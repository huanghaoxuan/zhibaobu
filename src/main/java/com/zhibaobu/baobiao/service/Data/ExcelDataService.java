package com.zhibaobu.baobiao.service.Data;

import com.zhibaobu.baobiao.DAO.*;
import com.zhibaobu.baobiao.pojo.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 19:50
 * <p>
 * 查询表格所需全部数据
 **/

@Data
@Service
public class ExcelDataService {

    private String gonghao;

    /**
     * 个人情况
     */
    @Autowired
    private JbqkDAO jbqkDAO;
    private Jbqk jbqk = new Jbqk();

    /**
     * 年度考额情况
     */
    @Autowired
    private NiandukaoheqingkuangDAO niandukaoheqingkuangDAO;
    private List<Niandukaoheqingkuang> niandukaoheqingkuangList = new ArrayList<>();

    /**
     * 毕业设计指导
     */
    @Autowired
    private BiyeshejizhidaoDAO biyeshejizhidaoDAO;
    private List<Biyeshejizhidao> biyeshejizhidaoList = new ArrayList<>();

    /**
     * 指导大创
     */
    @Autowired
    private ZhidaodachuangDAO zhidaodachuangDAO;
    private List<Zhidaodachuang> zhidaodachuangList = new ArrayList<>();

    /**
     * 指导竞赛
     */
    @Autowired
    private ZhidaojingsaiDAO zhidaojingsaiDAO;
    private List<Zhidaojingsai> zhidaojingsaiList = new ArrayList<>();

    /**
     * 班主任
     */
    @Autowired
    private BanzhurenDAO banzhurenDAO;
    private List<Banzhuren> banzhurenList = new ArrayList<>();

    /**
     * 综合获奖
     */
    @Autowired
    private ZonghehuojiangDAO zonghehuojiangDAO;
    private List<Zonghehuojiang> zonghehuojiangList = new ArrayList<>();

    /**
     * 课堂教学
     */
    @Autowired
    private KetangjiaoxueDAO ketangjiaoxueDAO;
    private List<Ketangjiaoxue> ketangjiaoxueList = new ArrayList<>();

    /**
     * 发表论文
     */
    @Autowired
    private FabiaolunwenDAO fabiaolunwenDAO;
    private List<Fabiaolunwen> fabiaolunwenList;

    /**
     * 教材建设
     */
    @Autowired
    private JiaocaijiansheDAO jiaocaijiansheDAO;
    private List<Jiaocaijianshe> jiaocaijiansheList;

    /**
     * 起草的重要文件
     */
    @Autowired
    private RenzhiyilaiqicaozhidingdezhongyaowenjianbaogaoDAO renzhiyilaiqicaozhidingdezhongyaowenjianbaogaoDAO;
    private List<Renzhiyilaiqicaozhidingdezhongyaowenjianbaogao> renzhiyilaiqicaozhidingdezhongyaowenjianbaogaoList = new ArrayList<>();

    /**
     * 教改
     */
    @Autowired
    private ChengdanjiaoyanjiaogaiketiDAO chengdanjiaoyanjiaogaiketiDAO;
    private List<Chengdanjiaoyanjiaogaiketi> chengdanjiaoyanjiaogaiketiList;

    /**
     * 教改论文
     */
    private List<Fabiaolunwen> jiaogailunwenList;

    /**
     * 招生
     */
    @Autowired
    private ZhaoshengDAO zhaoshengDAO;
    private List<Zhaosheng> zhaoshengList;

    /**
     * 班级荣耀情况
     */
    @Autowired
    private JiaoxuehuojiangDAO jiaoxuehuojiangDAO;
    private List<Jiaoxuehuojiang> jiaoxuehuojiangList;

    /**
     * 横向课题
     */
    @Autowired
    private HengxiangketixiangmuDAO hengxiangketixiangmuDAO;
    private List<Hengxiangketixiangmu> hengxiangketixiangmuList;

    /**
     * 纵向课题
     */
    @Autowired
    private ZongxiangketixiangmuDAO zongxiangketixiangmuDAO;
    private List<Zongxiangketixiangmu> zongxiangketixiangmuList;

    /**
     * 考研率等情况
     */
    @Autowired
    private RenzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuangDAO renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuangDAO;
    private List<Renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang> renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuangList;


    /**
     * 通过gonghao获取Jbqk
     */
    @SuppressWarnings("OptionalGetWithoutIsPresent")
    public void findJbqk() {
        jbqk.setGonghao(gonghao);
        Example<Jbqk> example = Example.of(jbqk);
        jbqk = jbqkDAO.findOne(example).get();
//        System.out.println(jbqk);
    }

    /**
     * 通过gonghao获取List<Niandukaoheqingkuang>
     */
    public void findNiandukaoheqingkuang() {
        Niandukaoheqingkuang niandukaoheqingkuang = new Niandukaoheqingkuang();
        niandukaoheqingkuang.setGonghao(gonghao);
        Example<Niandukaoheqingkuang> example = Example.of(niandukaoheqingkuang);
//        System.out.println(example);
        niandukaoheqingkuangList = niandukaoheqingkuangDAO.findAll(example);
        niandukaoheqingkuangList = this.sortNiandukaoheqingkuang(niandukaoheqingkuangList);
//        for (Niandukaoheqingkuang niandukaoheqingkuang1 : niandukaoheqingkuangList) {
//            System.out.println(niandukaoheqingkuang1);
//        }
    }

    /**
     * 处理List<Niandukaoheqingkuang>年份顺序问题，取最近五年记录，并按顺序排列
     *
     * @param list 未排序的List<Niandukaoheqingkuang>
     * @return 通过gonghao排序后的List<Niandukaoheqingkuang>
     */
    private List<Niandukaoheqingkuang> sortNiandukaoheqingkuang(List<Niandukaoheqingkuang> list) {
        List<Niandukaoheqingkuang> niandukaoheqingkuangList1 = new ArrayList<>();

        //获得当前年份
        SimpleDateFormat df = new SimpleDateFormat("yyyy");//设置日期格式
        int year = Integer.valueOf(df.format(new Date()));
        //System.out.println(year);
        for (int i = year - 1; i > year - 6; i--) {
            for (Niandukaoheqingkuang niandukaoheqingkuang : list) {
                if (i == Integer.valueOf(niandukaoheqingkuang.getXuenian())/* && list.get(j).getShenheqingkuang().equals("通过")*/) {
                    niandukaoheqingkuangList1.add(niandukaoheqingkuang);
                }
            }
        }
        Niandukaoheqingkuang niandukaoheqingkuang = new Niandukaoheqingkuang();
        niandukaoheqingkuang.setXuenian("").setNiandukaoheqingkuang("");
        while (niandukaoheqingkuangList1.size() < 5) {
            niandukaoheqingkuangList1.add(niandukaoheqingkuang);
        }
        return niandukaoheqingkuangList1;
    }

    /**
     * 查询专业实践要求的实体
     * <p>
     * 毕业设计指导 Biyeshejizhidao
     * 指导大创 Zhidaodachuang
     * 指导竞赛 Zhidaojingsai
     */
    public void findZhuanYeShiJianYaoQiu() {
        //查询 Biyeshejizhidao
        Biyeshejizhidao biyeshejizhidao = new Biyeshejizhidao();
        biyeshejizhidao.setGonghao(gonghao);
        Example<Biyeshejizhidao> biyeshejizhidaoExample = Example.of(biyeshejizhidao);
        biyeshejizhidaoList = biyeshejizhidaoDAO.findAll(biyeshejizhidaoExample);


        //查询 Zhidaodachuang
        Zhidaodachuang zhidaodachuang = new Zhidaodachuang();
        zhidaodachuang.setGonghao(gonghao);
        Example<Zhidaodachuang> zhidaodachuangExample = Example.of(zhidaodachuang);
        zhidaodachuangList = zhidaodachuangDAO.findAll(zhidaodachuangExample);


        //查询 Zhidaojingsai
        Zhidaojingsai zhidaojingsai = new Zhidaojingsai();
        zhidaojingsai.setGonghao(gonghao);
        Example<Zhidaojingsai> zhidaojingsaiExample = Example.of(zhidaojingsai);
        zhidaojingsaiList = zhidaojingsaiDAO.findAll(zhidaojingsaiExample);

    }

    /**
     * 查询班主任
     */
    public void findBanZhuRen() {
        Banzhuren banzhuren = new Banzhuren();
        banzhuren.setGonghao(gonghao);
        Example<Banzhuren> example = Example.of(banzhuren);
        banzhurenList = banzhurenDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (banzhurenList.isEmpty()) {
            banzhurenList.add(banzhuren);
        }
    }

    /**
     * 查询横向课题
     */
    public void findHengXiangKeTi() {
        Hengxiangketixiangmu hengxiangketixiangmu = new Hengxiangketixiangmu();
        hengxiangketixiangmu.setGonghao(gonghao);
        Example<Hengxiangketixiangmu> example = Example.of(hengxiangketixiangmu);
        hengxiangketixiangmuList = hengxiangketixiangmuDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (hengxiangketixiangmuList.isEmpty()) {
            hengxiangketixiangmuList.add(hengxiangketixiangmu);
        }
    }

    /**
     * 查询纵向课题
     */
    public void findZongXiangKeTi() {
        Zongxiangketixiangmu zongxiangketixiangmu = new Zongxiangketixiangmu();
        zongxiangketixiangmu.setGonghao(gonghao);
        Example<Zongxiangketixiangmu> example = Example.of(zongxiangketixiangmu);
        zongxiangketixiangmuList = zongxiangketixiangmuDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (zongxiangketixiangmuList.isEmpty()) {
            zongxiangketixiangmuList.add(zongxiangketixiangmu);
        }
    }

    /**
     * 通过工号查询综合获奖情况
     */
    public void findZongHeHuoJiang() {
        Zonghehuojiang zonghehuojiang = new Zonghehuojiang();
        zonghehuojiang.setGonghao(gonghao);
        Example<Zonghehuojiang> example = Example.of(zonghehuojiang);
        zonghehuojiangList = zonghehuojiangDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (zonghehuojiangList.isEmpty()) {
            zonghehuojiangList.add(zonghehuojiang);
        }
    }

    /**
     * 通过工号查询课堂教学
     */
    public void findKeTangJiaoXue() {

        Ketangjiaoxue ketangjiaoxue = new Ketangjiaoxue();
        ketangjiaoxue.setGonghao(gonghao);
        Example<Ketangjiaoxue> example = Example.of(ketangjiaoxue);
        ketangjiaoxueList = ketangjiaoxueDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (ketangjiaoxueList.isEmpty()) {
            ketangjiaoxueList.add(ketangjiaoxue);
        }
    }

    /**
     * 通过工号查询发表的教改论文
     */
    public void findJiaoGaiLunWen() {
        Fabiaolunwen fabiaolunwen = new Fabiaolunwen();
        fabiaolunwen.setGonghao(gonghao);
        fabiaolunwen.setLunwenzhonglei("教改");
        Example<Fabiaolunwen> exampleFabiaolunwen = Example.of(fabiaolunwen);
        jiaogailunwenList = fabiaolunwenDAO.findAll(exampleFabiaolunwen);

        if (jiaogailunwenList.isEmpty()) {
            jiaogailunwenList.add(fabiaolunwen);
        }

    }

    /**
     * 通过工号查询发表的科研论文和教材
     */
    public void findLunwenJiaoCai() {
        Fabiaolunwen fabiaolunwen = new Fabiaolunwen();
        fabiaolunwen.setGonghao(gonghao);
        fabiaolunwen.setLunwenzhonglei("科研");
        Example<Fabiaolunwen> exampleFabiaolunwen = Example.of(fabiaolunwen);
        fabiaolunwenList = fabiaolunwenDAO.findAll(exampleFabiaolunwen);

        Jiaocaijianshe jiaocaijianshe = new Jiaocaijianshe();
        jiaocaijianshe.setGonghao(gonghao);
        Example<Jiaocaijianshe> exampleJiaocaijianshe = Example.of(jiaocaijianshe);
        jiaocaijiansheList = jiaocaijiansheDAO.findAll(exampleJiaocaijianshe);
    }

    /**
     * 通过工号查询起草的重要文件
     */
    public void findRenzhiyilaiqicaozhidingdezhongyaowenjianbaogao() {
        Renzhiyilaiqicaozhidingdezhongyaowenjianbaogao renzhiyilaiqicaozhidingdezhongyaowenjianbaogao = new Renzhiyilaiqicaozhidingdezhongyaowenjianbaogao();
        renzhiyilaiqicaozhidingdezhongyaowenjianbaogao.setGonghao(gonghao);
        Example<Renzhiyilaiqicaozhidingdezhongyaowenjianbaogao> example = Example.of(renzhiyilaiqicaozhidingdezhongyaowenjianbaogao);
        renzhiyilaiqicaozhidingdezhongyaowenjianbaogaoList = renzhiyilaiqicaozhidingdezhongyaowenjianbaogaoDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (renzhiyilaiqicaozhidingdezhongyaowenjianbaogaoList.isEmpty()) {
            renzhiyilaiqicaozhidingdezhongyaowenjianbaogaoList.add(renzhiyilaiqicaozhidingdezhongyaowenjianbaogao);
        }
    }

    /**
     * 通过工号查询教改情况
     */
    public void findChengdanjiaoyanjiaogaiketi() {
        Chengdanjiaoyanjiaogaiketi chengdanjiaoyanjiaogaiketi = new Chengdanjiaoyanjiaogaiketi();
        chengdanjiaoyanjiaogaiketi.setGonghao(gonghao);
        Example<Chengdanjiaoyanjiaogaiketi> example = Example.of(chengdanjiaoyanjiaogaiketi);
        chengdanjiaoyanjiaogaiketiList = chengdanjiaoyanjiaogaiketiDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (chengdanjiaoyanjiaogaiketiList.isEmpty()) {
            chengdanjiaoyanjiaogaiketiList.add(chengdanjiaoyanjiaogaiketi);
        }
    }

    /**
     * 通过工号查询招生情况
     */
    public void findZhaoSheng() {
        Zhaosheng zhaosheng = new Zhaosheng();
        zhaosheng.setGonghao(gonghao);
        Example<Zhaosheng> example = Example.of(zhaosheng);
        zhaoshengList = zhaoshengDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (zhaoshengList.isEmpty()) {
            zhaoshengList.add(zhaosheng);
        }
    }

    /**
     * 通过工号查询所带班级获奖情况
     */
    public void findJiaoXueHuoJiang() {
        Jiaoxuehuojiang jiaoxuehuojiang = new Jiaoxuehuojiang();
        jiaoxuehuojiang.setGonghao(gonghao);
        Example<Jiaoxuehuojiang> example = Example.of(jiaoxuehuojiang);
        jiaoxuehuojiangList = jiaoxuehuojiangDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (jiaoxuehuojiangList.isEmpty()) {
            jiaoxuehuojiangList.add(jiaoxuehuojiang);
        }
    }

    /**
     * 通过工号查询考研率等情况
     */
    public void findRenzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang() {
        Renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang = new Renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang();
        renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang.setGonghao(gonghao);
        Example<Renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang> example = Example.of(renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang);
        renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuangList = renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuangDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuangList.isEmpty()) {
            renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuangList.add(renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang);
        }
    }

}
