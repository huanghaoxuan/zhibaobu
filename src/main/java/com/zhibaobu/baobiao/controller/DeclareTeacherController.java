package com.zhibaobu.baobiao.controller;

import com.zhibaobu.baobiao.pojo.DeclareStatus;
import com.zhibaobu.baobiao.service.Impl.excel.ExcelServiceImpl;
import com.zhibaobu.baobiao.service.excel.ExcelService;
import com.zhibaobu.baobiao.service.pojo.DeclareStatusService;
import com.zhibaobu.baobiao.service.pojo.JbqkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-03-02 20:10
 **/
@RestController
public class DeclareTeacherController {

    @Autowired
    private ExcelService excelService;

    @Autowired
    private JbqkService jbqkService;

    @Autowired
    private DeclareStatusService declareStatusService;

    /**
     * 对第一次申报进行处理
     *
     * @param gonghao
     * @param xingming
     * @param xuekeID
     * @param xuekeName
     * @param zhicheng
     * @return 申报的基本情况
     */
    @PostMapping("/declare/save")
    public DeclareStatus save(String gonghao, String xingming, String xuekeID, String xuekeName, String zhicheng) {
        DeclareStatus declareStatus = new DeclareStatus();
        declareStatus = declareStatusService.saveDeclareStatus(gonghao, xingming, xuekeID, xuekeName, zhicheng);
        jbqkService.updateJbqk(gonghao, xuekeName, zhicheng);
        return declareStatus;
    }

    /**
     * 对当前年份的申报信息进行更新
     *
     * @param gonghao
     * @param xingming
     * @param xuekeID
     * @param xuekeName
     * @param zhicheng
     * @return
     */
    @PostMapping("/declare/update")
    public DeclareStatus update(Integer ID,String gonghao, String xingming, String xuekeID, String xuekeName, String zhicheng) {
        jbqkService.updateJbqk(gonghao, xuekeName, zhicheng);
        return  declareStatusService.updateDeclareStatus(ID, gonghao, xingming, xuekeID, xuekeName, zhicheng);
    }

    /**
     * 查找当前用户所有申报状态
     *
     * @param gonghao
     * @return 所有申报状态
     */
    @GetMapping("/declare/findStatus")
    public List<DeclareStatus> findStatus(String gonghao) {
        return declareStatusService.findAllDeclareStatus(gonghao);
    }

    /**
     * 删除申报信息
     *
     * @param ID 主键
     */
    @GetMapping("/declare/remove")
    public void removeStatus(Integer ID) {
        declareStatusService.deleteDeclareStatus(ID);
    }


    /**
     * 报表下载
     *
     * @param
     * @param gonghao
     * @param xuekeName
     * @param zhicheng
     */
    @GetMapping("/declare/download")
    public void downloadStatus(String gonghao, String xuekeName, String zhicheng, HttpServletResponse res) {
        jbqkService.updateJbqk(gonghao, xuekeName, zhicheng);
        excelService.excel(gonghao, xuekeName, zhicheng);
        try {
            //获取要下载的模板名称
            String fileName = gonghao + "-" + xuekeName + "-" + zhicheng + ".xlsx";
            //设置要下载的文件的名称
            res.setHeader("Content-disposition", "attachment;fileName=" + fileName);
            //通知客服文件的MIME类型
            res.setContentType("application/octet-stream;charset=UTF-8");
            //获取文件的路径
            //String filePath = getClass().getResource("/template/" + fileName).getPath();
            //excel模板路径
            File cfgFile = ResourceUtils.getFile(ResourceUtils.CLASSPATH_URL_PREFIX + "static/excel/" + fileName);
            FileInputStream input = new FileInputStream(cfgFile);
            //            FileInputStream input = new FileInputStream(new File("d://"+fileName));
            OutputStream out = res.getOutputStream();
            byte[] b = new byte[2048];
            int len;
            while ((len = input.read(b)) != -1) {
                out.write(b, 0, len);
            }
            //修正 Excel在“xxx.xlsx”中发现不可读取的内容。是否恢复此工作薄的内容？如果信任此工作簿的来源，请点击"是"
            res.setHeader("Content-Length", String.valueOf(input.getChannel().size()));
            input.close();
            System.out.println("应用导入模板下载完成");
        } catch (Exception ex) {
            System.out.println("应用导入模板下载失败！");
        }
    }
}
