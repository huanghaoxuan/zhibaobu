package com.zhibaobu.baobiao.service.Impl.excel;

import com.zhibaobu.baobiao.pojo.*;
import com.zhibaobu.baobiao.service.data.ExcelDataService;
import com.zhibaobu.baobiao.service.excel.ExcelService;
import com.zhibaobu.baobiao.service.Impl.data.ExcelDataServiceImpl;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 16:35
 * <p>
 * 该类用于创建标准表格
 **/
@Service
@Scope("prototype")
public class ExcelServiceImpl implements ExcelService {

    @Autowired
    private ExcelDataService excelDataService;


    private void setCellValue(String[] value, XSSFSheet sheet, XSSFWorkbook workbook, int rowNum) {
        XSSFCellStyle cellStyle = workbook.createCellStyle();
        XSSFRow row = sheet.createRow(rowNum);
        for (int i = 0; i < value.length; i++) {
            Cell cell = row.createCell(i);
            cell.setCellValue(value[i]);
            cellStyle.setAlignment(HorizontalAlignment.CENTER); // 水平居中
            cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);//垂直居中
            cellStyle.setWrapText(true);//开启自动换行
//            cellStyle.setBorderBottom(BorderStyle.THIN); //下边框
//            cellStyle.setBorderLeft(BorderStyle.THIN);//左边框
//            cellStyle.setBorderTop(BorderStyle.THIN);//上边框
//            cellStyle.setBorderRight(BorderStyle.THIN);//右边框
            cell.setCellStyle(cellStyle);
        }
    }

    /**
     * 生成Excel文件
     */
    @Override
    public void excel(String gonghao, String xuekeName, String zhicheng) {
        
        String[] value;
        //创建一个工作表sheet
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();

        //创建第1行    东南大学成贤学院高校教师专业技术网络申报人员情况简表（拟申报___________）
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 8));//合并单元格
        value = new String[]{"东南大学成贤学院高校教师专业技术网络申报人员情况简表（拟申报___________）"};
        this.setCellValue(value, sheet, workbook, 0);

//******************************************************************************************************************************************************************

        //创建第2行   所在部门    姓名    性别    身份证号码
        Jbqk jbqk = excelDataService.findJbqk(gonghao);
        sheet.addMergedRegion(new CellRangeAddress(1, 1, 7, 8));//合并单元格
        value = new String[]{
                "所在部门"
                , jbqk.getSuozaixibu()
                , "姓名"
                , jbqk.getXingming()
                , "性别"
                , jbqk.getXingbie()
                , "身份证号码"
                , jbqk.getIDcardNumber(), ""
        };
        this.setCellValue(value, sheet, workbook, 1);

//******************************************************************************************************************************************************************

        //创建第3行 申报学科   拟报职称     来院时间
        sheet.addMergedRegion(new CellRangeAddress(2, 2, 1, 2));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2, 2, 4, 5));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(2, 2, 7, 8));//合并单元格
        value = new String[]{
                "申报学科"
                , jbqk.getShenbaoxueke()
                , ""
                , "拟报职称"
                , jbqk.getNibaozhicheng()
                , ""
                , "来院时间"
                , jbqk.getJinxiaoshijian().toString()
                , ""
        };
        this.setCellValue(value, sheet, workbook, 2);

//******************************************************************************************************************************************************************

        //创建第4行  毕业院校    所学专业    工作时间
        sheet.addMergedRegion(new CellRangeAddress(3, 3, 1, 2));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(3, 3, 4, 5));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(3, 3, 7, 8));//合并单元格
        value = new String[]{
                "毕业院校"
                , jbqk.getBenkebiyexuexiao()
                , ""
                , "所学专业"
                , jbqk.getSuoxuezhuanye()
                , ""
                , "工作时间"
                , jbqk.getGongzuoshijian()
                , ""
        };
        this.setCellValue(value, sheet, workbook, 3);

//******************************************************************************************************************************************************************

        //创建第5行   教师资格证   岗前培训   普通话考试
        sheet.addMergedRegion(new CellRangeAddress(4, 4, 1, 2));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(4, 4, 4, 5));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(4, 4, 7, 8));//合并单元格
        value = new String[]{
                "教师资格证*"
                , jbqk.getJiaoshizigezheng()
                , ""
                , "岗前培训*"
                , jbqk.getGangqianpeixun()
                , ""
                , "普通话考试*"
                , jbqk.getPutonghuakaoshi()
                , ""
        };
        this.setCellValue(value, sheet, workbook, 4);

//******************************************************************************************************************************************************************

        //创建第6行  继续教育情况
        sheet.addMergedRegion(new CellRangeAddress(5, 5, 1, 8));//合并单元格
        value = new String[]{
                "继续教育情况*"
                , jbqk.getJixujiaoyuqingkuang()
                , ""
                , ""
                , ""
                , ""
                , ""
                , ""
                , ""
        };
        this.setCellValue(value, sheet, workbook, 5);

//******************************************************************************************************************************************************************

        //创建第7 - 12行  学历资历要求
        sheet.addMergedRegion(new CellRangeAddress(6, 11, 0, 0));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(6, 9, 1, 1));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(6, 9, 2, 2));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(6, 9, 3, 3));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(6, 7, 4, 8));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(10, 11, 1, 1));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(10, 11, 2, 2));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(10, 11, 3, 3));//合并单元格
        for (int i = 4; i < 9; i++) {
            sheet.addMergedRegion(new CellRangeAddress(8, 9, i, i));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(10, 11, i, i));//合并单元格
        }

        List<Niandukaoheqingkuang> niandukaoheqingkuang = excelDataService.findNiandukaoheqingkuang(gonghao);
        value = new String[]{"", "", "", ""
                , niandukaoheqingkuang.get(0).getXuenian()
                , niandukaoheqingkuang.get(1).getXuenian()
                , niandukaoheqingkuang.get(2).getXuenian()
                , niandukaoheqingkuang.get(3).getXuenian()
                , niandukaoheqingkuang.get(4).getXuenian()
        };
        this.setCellValue(value, sheet, workbook, 8);

        value = new String[]{
                "学历资历要求*"
                , "最高学历学位及取得时间"
                , "现专业技术职务及取得时间"
                , "现从事专业研究方向及年限"
                , "近五年学年年度考核情况"
                , ""
                , ""
                , ""
                , ""
        };
        this.setCellValue(value, sheet, workbook, 6);
        value = new String[]{""
                , jbqk.getZuigaoxuelixueweiqudeshijian() + "：" + jbqk.getXueli()
                , jbqk.getXianzhuanyejishuzhiwuqudeshijian().toString() + "：" + jbqk.getXianzhuanyejishuzhiwu()
                , jbqk.getXiancongshizhuanyeyanjiufangxiangnianxian() + "年 ：" + jbqk.getXiancongshizhuanyeyanjiufangxiang()
                , niandukaoheqingkuang.get(0).getNiandukaoheqingkuang()
                , niandukaoheqingkuang.get(1).getNiandukaoheqingkuang()
                , niandukaoheqingkuang.get(2).getNiandukaoheqingkuang()
                , niandukaoheqingkuang.get(3).getNiandukaoheqingkuang()
                , niandukaoheqingkuang.get(4).getNiandukaoheqingkuang()
        };
        this.setCellValue(value, sheet, workbook, 10);

//******************************************************************************************************************************************************************

        //创建第13 - n行  专业实践要求
        List<Hengxiangketixiangmu> hengXiangKeTi = excelDataService.findHengXiangKeTi(gonghao);
        List<Biyeshejizhidao> biyeshejizhidao = excelDataService.findBiyeshejizhidao(gonghao);
        List<Zhidaodachuang> zhidaodachuang = excelDataService.findZhidaodachuang(gonghao);
        List<Zhidaojingsai> zhidaojingsai = excelDataService.findZhidaojingsai(gonghao);
        int lastRow = 4
                + 2 * (biyeshejizhidao.size()
                + zhidaodachuang.size()
                + zhidaojingsai.size())
                + 11;

        sheet.addMergedRegion(new CellRangeAddress(12, lastRow + 2 * hengXiangKeTi.size(), 0, 0));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(12, 13, 1, 1));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(12, 13, 2, 8));//合并单元格

        // 填充数据
        value = new String[]{
                "专业实践要求"
                , "第一条*"
                , jbqk.getGongchengshijianjingli()
                , ""
                , ""
                , ""
                , ""
                , ""
                , ""
        };
        this.setCellValue(value, sheet, workbook, 12);


        sheet.addMergedRegion(new CellRangeAddress(14, lastRow, 1, 1));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(14, 15, 2, 2));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(14, 15, 3, 6));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(14, 15, 7, 7));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(14, 15, 8, 8));//合并单元格

        //填充数据
        value = new String[]{
                ""
                , "第二条：任现职以来指导学生竞赛获奖、毕业设计或省级大学生创新项目情况"
                , "时间"
                , "竞赛项目、科研项目名称"
                , ""
                , ""
                , ""
                , "指导教师排名（X/X）"
                , "获奖情况"
        };
        this.setCellValue(value, sheet, workbook, 14);

        for (int i = 16; i < lastRow; i = i + 2) {
            sheet.addMergedRegion(new CellRangeAddress(i, i + 1, 2, 2));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(i, i + 1, 3, 6));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(i, i + 1, 7, 7));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(i, i + 1, 8, 8));//合并单元格
            int biyeshejizhidaoValueRow = (i - 16) / 2;
            int zhidaodachuangValueRow = (i - 16) / 2 - biyeshejizhidao.size();
            int zhidaojingsaiValueRow = (i - 16) / 2 - biyeshejizhidao.size() - zhidaodachuang.size();
            if (biyeshejizhidaoValueRow < biyeshejizhidao.size()) {
                value = new String[]{
                        ""
                        , ""
                        , biyeshejizhidao.get(biyeshejizhidaoValueRow).getXuenian()
                        , biyeshejizhidao.get(biyeshejizhidaoValueRow).getBiyeshejimingcheng()
                        , ""
                        , ""
                        , ""
                        , ""
                        , biyeshejizhidao.get(biyeshejizhidaoValueRow).getHuojiangjibie()
                };
            } else if (zhidaodachuangValueRow < zhidaodachuang.size()) {
                value = new String[]{
                        ""
                        , ""
                        , zhidaodachuang.get(zhidaodachuangValueRow).getXuenian()
                        , zhidaodachuang.get(zhidaodachuangValueRow).getXiangmumingcheng()
                        , ""
                        , ""
                        , ""
                        , zhidaodachuang.get(zhidaodachuangValueRow).getZhidaojiaoshijibie()
                        , zhidaodachuang.get(zhidaodachuangValueRow).getXiangmujibie()
                };
            } else if (zhidaojingsaiValueRow < zhidaojingsai.size()) {
                value = new String[]{
                        ""
                        , ""
                        , zhidaojingsai.get(zhidaojingsaiValueRow).getXuenian()
                        , zhidaojingsai.get(zhidaojingsaiValueRow).getJingsaimingcheng()
                        , ""
                        , ""
                        , ""
                        , ""
                        , zhidaojingsai.get(zhidaojingsaiValueRow).getJingsaijibie()
                };
            }
            this.setCellValue(value, sheet, workbook, i);
        }

        //没有获奖留空一栏（美观）
        if (lastRow == 15) {
            sheet.addMergedRegion(new CellRangeAddress(16, 17, 2, 2));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(16, 17, 3, 6));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(16, 17, 7, 7));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(16, 17, 8, 8));//合并单元格
            lastRow = 17;
        }

        //第三条 来源：横向课题
        int firstRow = lastRow;

        lastRow = lastRow + 2 * hengXiangKeTi.size();
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, lastRow, 1, 1));//合并单元格

        //填充横向课题数据
        for (int i = 0; i / 2 < hengXiangKeTi.size(); i = i + 2) {
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 1 + i, firstRow + 2 + i, 2, 2));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 1 + i, firstRow + 2 + i, 3, 6));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 1 + i, firstRow + 2 + i, 7, 7));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 1 + i, firstRow + 2 + i, 8, 8));//合并单元格

            value = new String[]{
                    ""
                    , "第三条"
                    , hengXiangKeTi.get(i / 2).getXuenian()
                    , hengXiangKeTi.get(i / 2).getXiangmumingcheng()
                    , ""
                    , ""
                    , ""
                    , ""
                    , ""
            };
            this.setCellValue(value, sheet, workbook, firstRow + 1 + i);
        }


//******************************************************************************************************************************************************************

        //创建8行  任现职以来教学业绩、成果要求
        List<Banzhuren> banZhuRen = excelDataService.findBanZhuRen(gonghao);
        List<Fabiaolunwen> jiaoGaiLunWen = excelDataService.findJiaoGaiLunWen(gonghao);
        firstRow = lastRow;
        lastRow = lastRow + 5 + banZhuRen.size() + 1 + jiaoGaiLunWen.size();
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, lastRow, 0, 0));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 2, 1, 8));//合并单元格
        value = new String[]{
                "任现职以来教学业绩、成果要求"
                , "兼任学生管理工作（一年以上）"
                , ""
                , ""
                , ""
                , ""
                , ""
                , ""
                , ""
        };
        this.setCellValue(value, sheet, workbook, firstRow + 1);
        firstRow++;//整体下挪一行
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 1, 2));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 3, 4));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 5, 8));//合并单元格
        value = new String[]{
                ""
                , "开始时间"
                , ""
                , "结束时间"
                , ""
                , "担任"
                , ""
                , ""
                , ""
        };
        this.setCellValue(value, sheet, workbook, firstRow + 2);
        for (int i = 0; i < banZhuRen.size(); i++) {
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 1, 2));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 3, 4));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 5, 8));//合并单元格
            //判断是否有真正的记录
            if (banZhuRen.get(0).getID() == null) {
                value = new String[]{};
            } else {
                value = new String[]{
                        ""
                        , banZhuRen.get(i).getKaishishijian().toString()
                        , ""
                        , banZhuRen.get(i).getJieshushijian().toString()
                        , ""
                        , "班主任"
                        , ""
                        , ""
                        , ""
                };
            }
            this.setCellValue(value, sheet, workbook, firstRow + 3 + i);
        }

        //开始计算 "教改论文（第一作者）" 的行数
        firstRow = firstRow + 2 + banZhuRen.size();
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 2, 1, 8));//合并单元格
        value = new String[]{
                ""
                , "教改论文（第一作者）"
                , ""
                , ""
                , ""
                , ""
                , ""
                , ""
                , ""
        };
        this.setCellValue(value, sheet, workbook, firstRow + 1);
        firstRow++;//整体下挪一行
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 1, 4));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 5, 8));//合并单元格
        value = new String[]{
                ""
                , "题目"
                , ""
                , ""
                , ""
                , "何年何月在何刊物发表或何出版社出版"
                , ""
                , ""
                , ""
        };
        this.setCellValue(value, sheet, workbook, firstRow + 2);

        //填充数据
        for (int i = 0; i < jiaoGaiLunWen.size(); i++) {
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 1, 4));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 5, 8));//合并单元格
            value = new String[]{
                    ""
                    , jiaoGaiLunWen.get(i).getLunwentimu()
                    , ""
                    , ""
                    , ""
                    , jiaoGaiLunWen.get(i).getFabiaoshijian().toString() + "：" + jiaoGaiLunWen.get(i).getFabiaoqikan()
                    , ""
                    , ""
                    , ""
            };
            this.setCellValue(value, sheet, workbook, firstRow + 3 + i);
        }

        lastRow = firstRow + 3;

//******************************************************************************************************************************************************************

        //创建3行  任现职以来综合奖励情况*
        List<Zonghehuojiang> zongHeHuoJiang = excelDataService.findZongHeHuoJiang(gonghao);
        firstRow = lastRow;
        lastRow = lastRow + 2 + zongHeHuoJiang.size();
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 1, 0, 8));//合并单元格
        value = new String[]{
                "任现职以来综合奖励情况*"
        };
        this.setCellValue(value, sheet, workbook, firstRow + 1);
        firstRow++;//整体下移一行

        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 1, 0, 1));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 1, 2, 3));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 1, 5, 6));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 1, 7, 8));//合并单元格
        value = new String[]{
                "时间"
                , ""
                , "荣誉称号、表彰奖励名称"
                , ""
                , "授奖部门"
                , "获奖级别"
                , ""
                , "排名/总人数"
                , ""
        };
        this.setCellValue(value, sheet, workbook, firstRow + 1);

        //填充数据
        for (int i = 0; i < zongHeHuoJiang.size(); i++) {
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 2 + i, firstRow + 2 + i, 0, 1));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 2 + i, firstRow + 2 + i, 2, 3));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 2 + i, firstRow + 2 + i, 5, 6));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 2 + i, firstRow + 2 + i, 7, 8));//合并单元格
            if (zongHeHuoJiang.get(0).getID() == null) {
                value = new String[]{};
            } else {
                value = new String[]{
                        zongHeHuoJiang.get(i).getShijian().toString()
                        , ""
                        , zongHeHuoJiang.get(i).getRongyuchenghao()
                        , ""
                        , zongHeHuoJiang.get(i).getShoujiangbumen()
                        , zongHeHuoJiang.get(i).getHuojiangjibie()
                        , ""
                        , zongHeHuoJiang.get(i).getPaiming() + "/" + zongHeHuoJiang.get(i).getZongrenshu()
                        , ""
                };
            }
            this.setCellValue(value, sheet, workbook, firstRow + 2 + i);
        }

//******************************************************************************************************************************************************************

        //创建3行  任现职以来教学工作情况
        List<Ketangjiaoxue> keTangJiaoXue = excelDataService.findKeTangJiaoXue(gonghao);
        firstRow = lastRow;
        lastRow = lastRow + 2 + keTangJiaoXue.size();
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 1, 0, 8));//合并单元格
        value = new String[]{
                "任现职以来教学工作情况"
        };
        this.setCellValue(value, sheet, workbook, firstRow + 1);
        firstRow++;//整体下移一行

        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 1, 0, 1));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 1, 2, 3));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 1, 4, 5));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 1, 6, 7));//合并单元格
        value = new String[]{
                "起止时间"
                , ""
                , "授课课程名称"
                , ""
                , "课程性质"
                , ""
                , "授课对象及人数"
                , ""
                , "总学时"
        };
        this.setCellValue(value, sheet, workbook, firstRow + 1);
        for (int i = 0; i < keTangJiaoXue.size(); i++) {
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 2 + i, firstRow + 2 + i, 0, 1));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 2 + i, firstRow + 2 + i, 2, 3));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 2 + i, firstRow + 2 + i, 4, 5));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 2 + i, firstRow + 2 + i, 6, 7));//合并单元格

            if (keTangJiaoXue.get(0).getID() == null) {
                value = new String[]{};
            } else {
                value = new String[]{
                        keTangJiaoXue.get(i).getXuenian()
                        , ""
                        , keTangJiaoXue.get(i).getKechengmingcheng()
                        , ""
                        , keTangJiaoXue.get(i).getKechengxingzhi()
                        , ""
                        , "授课班级：" + keTangJiaoXue.get(i).getShoukebangeshu()
                        , ""
                        , keTangJiaoXue.get(i).getXueshi()
                };
            }
            this.setCellValue(value, sheet, workbook, firstRow + 2 + i);
        }

//******************************************************************************************************************************************************************

        //创建4行  任现职以来发表、出版论文/论著/教材/教学参考书情况
        List<Fabiaolunwen> lunwenJiaoCai = excelDataService.findLunwenJiaoCai(gonghao);
        List<Jiaocaijianshe> jiaocaijianshe = excelDataService.findJiaocaijianshe(gonghao);
        firstRow = lastRow;
        lastRow = lastRow + 2 + lunwenJiaoCai.size() + jiaocaijianshe.size();
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 1, 0, 8));//合并单元格
        value = new String[]{
                "任现职以来发表、出版论文/论著/教材/教学参考书情况"
        };
        this.setCellValue(value, sheet, workbook, firstRow + 1);

        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 0, 2));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 3, 5));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 6, 7));//合并单元格
        value = new String[]{
                "题目"
                , ""
                , ""
                , "何年何月在何刊物发表或在何出版社出版"
                , ""
                , ""
                , "本人承担部分及排名"
                , ""
                , "期刊收录级别（北核、CSSCI、SCI、EI等）"
        };
        this.setCellValue(value, sheet, workbook, firstRow + 2);
        //填充数据
        for (int i = 0; i < lunwenJiaoCai.size(); i++) {
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 0, 2));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 3, 5));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 6, 7));//合并单元格
            value = new String[]{
                    lunwenJiaoCai.get(i).getLunwentimu()
                    , ""
                    , ""
                    , lunwenJiaoCai.get(i).getFabiaoshijian().toString()
                    , ""
                    , ""
                    , lunwenJiaoCai.get(i).getQita()
                    , ""
                    , lunwenJiaoCai.get(i).getQikanjibie()
            };
            this.setCellValue(value, sheet, workbook, firstRow + 3 + i);
        }
        for (int i = 0; i < jiaocaijianshe.size(); i++) {
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i + lunwenJiaoCai.size(), firstRow + 3 + i + lunwenJiaoCai.size(), 0, 2));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i + lunwenJiaoCai.size(), firstRow + 3 + i + lunwenJiaoCai.size(), 3, 5));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i + lunwenJiaoCai.size(), firstRow + 3 + i + lunwenJiaoCai.size(), 6, 7));//合并单元格
            value = new String[]{
                    jiaocaijianshe.get(i).getJiaocaimingcheng()
                    , ""
                    , ""
                    , jiaocaijianshe.get(i).getChubanshijian().toString()
                    , ""
                    , ""
                    , jiaocaijianshe.get(i).getBenrengongxian()
                    , ""
                    , ""
            };
            this.setCellValue(value, sheet, workbook, firstRow + 3 + i + lunwenJiaoCai.size());
        }
        if (lunwenJiaoCai.size() + jiaocaijianshe.size() == 0) {
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3, firstRow + 3 , 0, 2));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3, firstRow + 3 , 3, 5));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3, firstRow + 3 , 6, 7));//合并单元格
            lastRow = lastRow + 1;
        }

//******************************************************************************************************************************************************************

        //创建3行  任现职以来承担并完成科研任务、取得科研成果情况
        List<Zongxiangketixiangmu> zongXiangKeTi = excelDataService.findZongXiangKeTi(gonghao);
        firstRow = lastRow;
        lastRow = lastRow + 2 + zongXiangKeTi.size();
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 1, 0, 8));//合并单元格
        value = new String[]{
                "任现职以来承担并完成科研任务、取得科研成果情况"
        };
        this.setCellValue(value, sheet, workbook, firstRow + 1);

        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 1, 2));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 3, 4));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 5, 6));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 7, 8));//合并单元格
        value = new String[]{
                "时间"
                , "科研项目、课题名称"
                , ""
                , "项目来源及类别"
                , ""
                , "本人排名及完成情况"
                , ""
                , "成果获奖、专利及效益情况（注明授奖部门、奖励级别及排名）"
                , ""
        };
        this.setCellValue(value, sheet, workbook, firstRow + 2);

        //填充数据 来源：纵向课题
        for (int i = 0; i < zongXiangKeTi.size(); i++) {
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 1, 2));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 3, 4));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 5, 6));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 7, 8));//合并单元格
            value = new String[]{
                    zongXiangKeTi.get(i).getXuenian()
                    , zongXiangKeTi.get(i).getKetimingcheng()
                    , ""
                    , zongXiangKeTi.get(i).getKetilaiyuan()
                    , ""
                    , zongXiangKeTi.get(i).getRenwujuese()
                    , ""
                    , ""
                    , ""
            };
            this.setCellValue(value, sheet, workbook, firstRow + 3 + i);
        }


//******************************************************************************************************************************************************************

        //创建3行  任现职以来起草、制定重要文件、报告（限学生思想政治教育教师、教育管理研究人员填写）*
        List<Renzhiyilaiqicaozhidingdezhongyaowenjianbaogao> renzhiyilaiqicaozhidingdezhongyaowenjianbaogao = excelDataService.findRenzhiyilaiqicaozhidingdezhongyaowenjianbaogao(gonghao);
        firstRow = lastRow;
        lastRow = lastRow + 2 + renzhiyilaiqicaozhidingdezhongyaowenjianbaogao.size();
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 1, 0, 8));//合并单元格
        value = new String[]{
                "任现职以来起草、制定重要文件、报告(限学生思想政治教育教师,教育管理研究人员填写)*"
        };
        this.setCellValue(value, sheet, workbook, firstRow + 1);

        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 0, 1));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 2, 3));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 5, 6));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 7, 8));//合并单元格
        value = new String[]{
                "时间"
                , ""
                , "文件题目报告"
                , ""
                , "本人排名（X/X）"
                , "使用范围及产生效益"
                , ""
                , "备注"
                , ""
        };
        this.setCellValue(value, sheet, workbook, firstRow + 2);

        for (int i = 0; i < renzhiyilaiqicaozhidingdezhongyaowenjianbaogao.size(); i++) {
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 0, 1));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 2, 3));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 5, 6));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 7, 8));//合并单元格
            value = new String[]{
                    renzhiyilaiqicaozhidingdezhongyaowenjianbaogao.get(i).getShijian().toString()
                    , ""
                    , renzhiyilaiqicaozhidingdezhongyaowenjianbaogao.get(i).getWenjianbaogaotimu()
                    , ""
                    , renzhiyilaiqicaozhidingdezhongyaowenjianbaogao.get(i).getPaiming() + "/" + renzhiyilaiqicaozhidingdezhongyaowenjianbaogao.get(i).getZongrenshu()
                    , renzhiyilaiqicaozhidingdezhongyaowenjianbaogao.get(i).getShiyongfanweijichanshengxiaoyii()
                    , ""
                    , renzhiyilaiqicaozhidingdezhongyaowenjianbaogao.get(i).getBeizhu()
                    , ""
            };
            this.setCellValue(value, sheet, workbook, firstRow + 3 + i);
        }

//******************************************************************************************************************************************************************

        //创建3行  任现职以来承担教改项目情况
        List<Chengdanjiaoyanjiaogaiketi> chengdanjiaoyanjiaogaiketi = excelDataService.findChengdanjiaoyanjiaogaiketi(gonghao);
        firstRow = lastRow;
        lastRow = lastRow + 2 + chengdanjiaoyanjiaogaiketi.size();
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 1, 0, 8));//合并单元格
        value = new String[]{
                "任现职以来承担教改项目情况"
        };
        this.setCellValue(value, sheet, workbook, firstRow + 1);

        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 0, 1));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 2, 4));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 5, 6));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 7, 8));//合并单元格
        value = new String[]{
                "时间"
                , ""
                , "项目名称"
                , ""
                , ""
                , "项目来源及类别"
                , ""
                , "本人排名（X/X）"
                , ""
        };
        this.setCellValue(value, sheet, workbook, firstRow + 2);

        for (int i = 0; i < chengdanjiaoyanjiaogaiketi.size(); i++) {
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 0, 1));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 2, 4));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 5, 6));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 7, 8));//合并单元格
            value = new String[]{
                    chengdanjiaoyanjiaogaiketi.get(i).getLixiangshijian().toString()
                    , ""
                    , chengdanjiaoyanjiaogaiketi.get(i).getKetimingcheng()
                    , ""
                    , ""
                    , chengdanjiaoyanjiaogaiketi.get(i).getKetilaiyuan()
                    , ""
                    , chengdanjiaoyanjiaogaiketi.get(i).getRenwujuese()
                    , ""
            };
            this.setCellValue(value, sheet, workbook, firstRow + 3 + i);
        }


//******************************************************************************************************************************************************************

        //创建3行  任现职以来参加招生工作
        List<Zhaosheng> zhaoSheng = excelDataService.findZhaoSheng(gonghao);
        firstRow = lastRow;
        lastRow = lastRow + 2 + zhaoSheng.size();
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 1, 0, 8));//合并单元格
        value = new String[]{
                "任现职以来参加招生工作"
        };
        this.setCellValue(value, sheet, workbook, firstRow + 1);


        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 0, 1));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 2, 4));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 5, 6));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 7, 8));//合并单元格
        value = new String[]{
                "时间"
                , ""
                , "地点"
                , ""
                , ""
                , "考核情况"
                , ""
                , "招生组长签字"
                , ""
        };
        this.setCellValue(value, sheet, workbook, firstRow + 2);

        for (int i = 0; i < zhaoSheng.size(); i++) {
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 0, 1));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 2, 4));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 5, 6));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 7, 8));//合并单元格
            value = new String[]{
                    zhaoSheng.get(i).getXuenian()
                    , ""
                    , zhaoSheng.get(i).getDidian()
                    , ""
                    , ""
                    , zhaoSheng.get(i).getShenheqingkuang()
                    , ""
                    , ""
                    , ""
            };
            this.setCellValue(value, sheet, workbook, firstRow + 3 + i);
        }

//******************************************************************************************************************************************************************

        //创建3行  任现职以来所带班级(党团组织/学生社团)获得荣誉情况(限学生思想政治教育教师填写)
        List<Jiaoxuehuojiang> jiaoXueHuoJiang = excelDataService.findJiaoXueHuoJiang(gonghao);
        firstRow = lastRow;
        lastRow = lastRow + 2 + jiaoXueHuoJiang.size();
        System.out.println(lastRow);
        System.out.println(jiaoXueHuoJiang.size());
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 1, 0, 8));//合并单元格
        value = new String[]{
                "任现职以来所带班级(党团组织/学生社团)获得荣誉情况(限学生思想政治教育教师填写)"
        };
        this.setCellValue(value, sheet, workbook, firstRow + 1);


        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 0, 1));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 2, 4));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 5, 6));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 7, 8));//合并单元格
        value = new String[]{
                "时间"
                , ""
                , "荣誉称号"
                , ""
                , ""
                , "等级"
                , ""
                , "本人排名（X/X）"
                , ""
        };
        this.setCellValue(value, sheet, workbook, firstRow + 2);

        for (int i = 0; i < jiaoXueHuoJiang.size(); i++) {
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 0, 1));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 2, 4));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 5, 6));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 7, 8));//合并单元格
            value = new String[]{
                    jiaoXueHuoJiang.get(i).getXuenian()
                    , ""
                    , jiaoXueHuoJiang.get(i).getHuojiangmingcheng()
                    , ""
                    , ""
                    , jiaoXueHuoJiang.get(i).getHuojiangdengji()
                    , ""
                    , jiaoXueHuoJiang.get(i).getHuojiangjibie() + "/" + jiaoXueHuoJiang.get(i).getCansairenshu()
                    , ""
            };
            this.setCellValue(value, sheet, workbook, firstRow + 3 + i);
        }

//******************************************************************************************************************************************************************

        //创建3行  任现职以来所带毕业班级就业率、考研率、违纪率情况(限学生思想政治教育教师填写)
        List<Renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang> renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang = excelDataService.findRenzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang(gonghao);
        firstRow = lastRow;
        lastRow = lastRow + 2 + renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang.size();
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 1, firstRow + 1, 0, 8));//合并单元格
        value = new String[]{
                "任现职以来所带毕业班级就业率、考研率、违纪率情况(限学生思想政治教育教师填写)"
        };
        this.setCellValue(value, sheet, workbook, firstRow + 1);


        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 0, 2));//合并单元格
        sheet.addMergedRegion(new CellRangeAddress(firstRow + 2, firstRow + 2, 6, 8));//合并单元格
        value = new String[]{
                "班级名称"
                , ""
                , ""
                , "就业率"
                , "考研率"
                , "违纪率"
                , "备注"
                , ""
                , ""
        };
        this.setCellValue(value, sheet, workbook, firstRow + 2);

        for (int i = 0; i < renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang.size(); i++) {
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 0, 2));//合并单元格
            sheet.addMergedRegion(new CellRangeAddress(firstRow + 3 + i, firstRow + 3 + i, 6, 8));//合并单元格
            value = new String[]{
                    renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang.get(i).getBanjimingcheng()
                    , ""
                    , ""
                    , renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang.get(i).getJiuyelv()
                    , renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang.get(i).getKaoyanlv()
                    , renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang.get(i).getWeijilv()
                    , renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang.get(i).getBeizhu()
                    , ""
                    , ""
            };
            this.setCellValue(value, sheet, workbook, firstRow + 3 + i);
        }

//******************************************************************************************************************************************************************

        //创建一个文件
        try {
            System.out.println(this.getClass().getClassLoader().getResource(".").getPath() + "static/excel/" + gonghao + "-" + xuekeName + "-" + zhicheng + ".xlsx");
            File file = new File(this.getClass().getClassLoader().getResource(".").getPath() + "static/excel/" + gonghao + "-" + xuekeName + "-" + zhicheng + ".xlsx");  //在这里填写存放路径
            file.createNewFile();
            FileOutputStream stream = FileUtils.openOutputStream(file);
            workbook.write(stream);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
