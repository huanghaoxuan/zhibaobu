package com.zhibaobu.baobiao.service.Impl.data;

import com.zhibaobu.baobiao.DAO.*;
import com.zhibaobu.baobiao.pojo.*;
import com.zhibaobu.baobiao.service.data.ExcelDataService;
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
public class ExcelDataServiceImpl implements ExcelDataService {

    /**
     * 个人情况
     */
    @Autowired
    private JbqkDAO jbqkDAO;


    /**
     * 年度考额情况
     */
    @Autowired
    private NiandukaoheqingkuangDAO niandukaoheqingkuangDAO;


    /**
     * 毕业设计指导
     */
    @Autowired
    private BiyeshejizhidaoDAO biyeshejizhidaoDAO;


    /**
     * 指导大创
     */
    @Autowired
    private ZhidaodachuangDAO zhidaodachuangDAO;


    /**
     * 指导竞赛
     */
    @Autowired
    private ZhidaojingsaiDAO zhidaojingsaiDAO;


    /**
     * 班主任
     */
    @Autowired
    private BanzhurenDAO banzhurenDAO;


    /**
     * 综合获奖
     */
    @Autowired
    private ZonghehuojiangDAO zonghehuojiangDAO;


    /**
     * 课堂教学
     */
    @Autowired
    private KetangjiaoxueDAO ketangjiaoxueDAO;


    /**
     * 发表论文
     */
    @Autowired
    private FabiaolunwenDAO fabiaolunwenDAO;


    /**
     * 教材建设
     */
    @Autowired
    private JiaocaijiansheDAO jiaocaijiansheDAO;


    /**
     * 起草的重要文件
     */
    @Autowired
    private RenzhiyilaiqicaozhidingdezhongyaowenjianbaogaoDAO renzhiyilaiqicaozhidingdezhongyaowenjianbaogaoDAO;

    /**
     * 教改
     */
    @Autowired
    private ChengdanjiaoyanjiaogaiketiDAO chengdanjiaoyanjiaogaiketiDAO;


    /**
     * 教改论文
     */


    /**
     * 招生
     */
    @Autowired
    private ZhaoshengDAO zhaoshengDAO;


    /**
     * 班级荣耀情况
     */
    @Autowired
    private JiaoxuehuojiangDAO jiaoxuehuojiangDAO;


    /**
     * 横向课题
     */
    @Autowired
    private HengxiangketixiangmuDAO hengxiangketixiangmuDAO;


    /**
     * 纵向课题
     */
    @Autowired
    private ZongxiangketixiangmuDAO zongxiangketixiangmuDAO;


    /**
     * 考研率等情况
     */
    @Autowired
    private RenzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuangDAO renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuangDAO;


    /**
     * 通过gonghao获取Jbqk
     */
    @Override
    public Jbqk findJbqk(String gonghao) {
        Jbqk jbqk = new Jbqk();
        jbqk.setGonghao(gonghao);
        Example<Jbqk> example = Example.of(jbqk);
        return jbqkDAO.findOne(example).get();
//        System.out.println(jbqk);

    }

    /**
     * 通过gonghao获取List<Niandukaoheqingkuang>
     */
    @Override
    public List<Niandukaoheqingkuang> findNiandukaoheqingkuang(String gonghao) {
        List<Niandukaoheqingkuang> niandukaoheqingkuangList = new ArrayList<>();
        Niandukaoheqingkuang niandukaoheqingkuang = new Niandukaoheqingkuang();
        niandukaoheqingkuang.setGonghao(gonghao);
        Example<Niandukaoheqingkuang> example = Example.of(niandukaoheqingkuang);

        niandukaoheqingkuangList = niandukaoheqingkuangDAO.findAll(example);
        return this.sortNiandukaoheqingkuang(niandukaoheqingkuangList);

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
    @Override
    public List<Biyeshejizhidao> findBiyeshejizhidao(String gonghao) {
        //List<Biyeshejizhidao> biyeshejizhidaoList = new ArrayList<>();
        //查询 Biyeshejizhidao
        Biyeshejizhidao biyeshejizhidao = new Biyeshejizhidao();
        biyeshejizhidao.setGonghao(gonghao);
        Example<Biyeshejizhidao> biyeshejizhidaoExample = Example.of(biyeshejizhidao);
        return biyeshejizhidaoDAO.findAll(biyeshejizhidaoExample);
    }

    @Override
    public List<Zhidaodachuang> findZhidaodachuang(String gonghao) {
        //List<Zhidaodachuang> zhidaodachuangList = new ArrayList<>();
        //查询 Zhidaodachuang
        Zhidaodachuang zhidaodachuang = new Zhidaodachuang();
        zhidaodachuang.setGonghao(gonghao);
        Example<Zhidaodachuang> zhidaodachuangExample = Example.of(zhidaodachuang);
        return zhidaodachuangDAO.findAll(zhidaodachuangExample);
    }

    @Override
    public List<Zhidaojingsai> findZhidaojingsai(String gonghao) {
        //List<Zhidaojingsai> zhidaojingsaiList = new ArrayList<>();
        //查询 Zhidaojingsai
        Zhidaojingsai zhidaojingsai = new Zhidaojingsai();
        zhidaojingsai.setGonghao(gonghao);
        Example<Zhidaojingsai> zhidaojingsaiExample = Example.of(zhidaojingsai);
        return zhidaojingsaiDAO.findAll(zhidaojingsaiExample);
    }


    /**
     * 查询班主任
     */
    @Override
    public List<Banzhuren> findBanZhuRen(String gonghao) {
        List<Banzhuren> banzhurenList = new ArrayList<>();
        Banzhuren banzhuren = new Banzhuren();
        banzhuren.setGonghao(gonghao);
        Example<Banzhuren> example = Example.of(banzhuren);
        banzhurenList = banzhurenDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (banzhurenList.isEmpty()) {
            banzhurenList.add(banzhuren);
        }
        return banzhurenList;
    }

    /**
     * 查询横向课题
     */
    @Override
    public List<Hengxiangketixiangmu> findHengXiangKeTi(String gonghao) {
        List<Hengxiangketixiangmu> hengxiangketixiangmuList = new ArrayList<>();
        Hengxiangketixiangmu hengxiangketixiangmu = new Hengxiangketixiangmu();
        hengxiangketixiangmu.setGonghao(gonghao);
        Example<Hengxiangketixiangmu> example = Example.of(hengxiangketixiangmu);
        hengxiangketixiangmuList = hengxiangketixiangmuDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (hengxiangketixiangmuList.isEmpty()) {
            hengxiangketixiangmuList.add(hengxiangketixiangmu);
        }
        return hengxiangketixiangmuList;
    }

    /**
     * 查询纵向课题
     */
    @Override
    public List<Zongxiangketixiangmu> findZongXiangKeTi(String gonghao) {
        List<Zongxiangketixiangmu> zongxiangketixiangmuList = new ArrayList<>();
        Zongxiangketixiangmu zongxiangketixiangmu = new Zongxiangketixiangmu();
        zongxiangketixiangmu.setGonghao(gonghao);
        Example<Zongxiangketixiangmu> example = Example.of(zongxiangketixiangmu);
        zongxiangketixiangmuList = zongxiangketixiangmuDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (zongxiangketixiangmuList.isEmpty()) {
            zongxiangketixiangmuList.add(zongxiangketixiangmu);
        }
        return zongxiangketixiangmuList;
    }

    /**
     * 通过工号查询综合获奖情况
     */
    @Override
    public List<Zonghehuojiang> findZongHeHuoJiang(String gonghao) {
        List<Zonghehuojiang> zonghehuojiangList = new ArrayList<>();
        Zonghehuojiang zonghehuojiang = new Zonghehuojiang();
        zonghehuojiang.setGonghao(gonghao);
        Example<Zonghehuojiang> example = Example.of(zonghehuojiang);
        zonghehuojiangList = zonghehuojiangDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (zonghehuojiangList.isEmpty()) {
            zonghehuojiangList.add(zonghehuojiang);
        }
        return zonghehuojiangList;
    }

    /**
     * 通过工号查询课堂教学
     */
    @Override
    public List<Ketangjiaoxue> findKeTangJiaoXue(String gonghao) {
        List<Ketangjiaoxue> ketangjiaoxueList = new ArrayList<>();
        Ketangjiaoxue ketangjiaoxue = new Ketangjiaoxue();
        ketangjiaoxue.setGonghao(gonghao);
        Example<Ketangjiaoxue> example = Example.of(ketangjiaoxue);
        ketangjiaoxueList = ketangjiaoxueDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (ketangjiaoxueList.isEmpty()) {
            ketangjiaoxueList.add(ketangjiaoxue);
        }
        return ketangjiaoxueList;
    }

    /**
     * 通过工号查询发表的教改论文
     */
    @Override
    public List<Fabiaolunwen> findJiaoGaiLunWen(String gonghao) {
        List<Fabiaolunwen> jiaogailunwenList;
        Fabiaolunwen fabiaolunwen = new Fabiaolunwen();
        fabiaolunwen.setGonghao(gonghao);
        fabiaolunwen.setLunwenzhonglei("教改");
        Example<Fabiaolunwen> exampleFabiaolunwen = Example.of(fabiaolunwen);
        jiaogailunwenList = fabiaolunwenDAO.findAll(exampleFabiaolunwen);

        if (jiaogailunwenList.isEmpty()) {
            jiaogailunwenList.add(fabiaolunwen);
        }
        return jiaogailunwenList;

    }

    /**
     * 通过工号查询发表的科研论文和教材
     */
    @Override
    public List<Fabiaolunwen> findLunwenJiaoCai(String gonghao) {
        List<Fabiaolunwen> fabiaolunwenList;
        Fabiaolunwen fabiaolunwen = new Fabiaolunwen();
        fabiaolunwen.setGonghao(gonghao);
        fabiaolunwen.setLunwenzhonglei("科研");
        Example<Fabiaolunwen> exampleFabiaolunwen = Example.of(fabiaolunwen);
        fabiaolunwenList = fabiaolunwenDAO.findAll(exampleFabiaolunwen);
        return fabiaolunwenList;
    }

    @Override
    public List<Jiaocaijianshe> findJiaocaijianshe(String gonghao) {
        List<Jiaocaijianshe> jiaocaijiansheList;
        Jiaocaijianshe jiaocaijianshe = new Jiaocaijianshe();
        jiaocaijianshe.setGonghao(gonghao);
        Example<Jiaocaijianshe> exampleJiaocaijianshe = Example.of(jiaocaijianshe);
        jiaocaijiansheList = jiaocaijiansheDAO.findAll(exampleJiaocaijianshe);
        return jiaocaijiansheList;
    }

    /**
     * 通过工号查询起草的重要文件
     */
    @Override
    public List<Renzhiyilaiqicaozhidingdezhongyaowenjianbaogao> findRenzhiyilaiqicaozhidingdezhongyaowenjianbaogao(String gonghao) {
        List<Renzhiyilaiqicaozhidingdezhongyaowenjianbaogao> renzhiyilaiqicaozhidingdezhongyaowenjianbaogaoList = new ArrayList<>();
        Renzhiyilaiqicaozhidingdezhongyaowenjianbaogao renzhiyilaiqicaozhidingdezhongyaowenjianbaogao = new Renzhiyilaiqicaozhidingdezhongyaowenjianbaogao();
        renzhiyilaiqicaozhidingdezhongyaowenjianbaogao.setGonghao(gonghao);
        Example<Renzhiyilaiqicaozhidingdezhongyaowenjianbaogao> example = Example.of(renzhiyilaiqicaozhidingdezhongyaowenjianbaogao);
        renzhiyilaiqicaozhidingdezhongyaowenjianbaogaoList = renzhiyilaiqicaozhidingdezhongyaowenjianbaogaoDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (renzhiyilaiqicaozhidingdezhongyaowenjianbaogaoList.isEmpty()) {
            renzhiyilaiqicaozhidingdezhongyaowenjianbaogaoList.add(renzhiyilaiqicaozhidingdezhongyaowenjianbaogao);
        }
        return renzhiyilaiqicaozhidingdezhongyaowenjianbaogaoList;
    }

    /**
     * 通过工号查询教改情况
     */
    @Override
    public List<Chengdanjiaoyanjiaogaiketi> findChengdanjiaoyanjiaogaiketi(String gonghao) {
        List<Chengdanjiaoyanjiaogaiketi> chengdanjiaoyanjiaogaiketiList;
        Chengdanjiaoyanjiaogaiketi chengdanjiaoyanjiaogaiketi = new Chengdanjiaoyanjiaogaiketi();
        chengdanjiaoyanjiaogaiketi.setGonghao(gonghao);
        Example<Chengdanjiaoyanjiaogaiketi> example = Example.of(chengdanjiaoyanjiaogaiketi);
        chengdanjiaoyanjiaogaiketiList = chengdanjiaoyanjiaogaiketiDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (chengdanjiaoyanjiaogaiketiList.isEmpty()) {
            chengdanjiaoyanjiaogaiketiList.add(chengdanjiaoyanjiaogaiketi);
        }
        return chengdanjiaoyanjiaogaiketiList;
    }

    /**
     * 通过工号查询招生情况
     */
    @Override
    public List<Zhaosheng> findZhaoSheng(String gonghao) {
        List<Zhaosheng> zhaoshengList;
        Zhaosheng zhaosheng = new Zhaosheng();
        zhaosheng.setGonghao(gonghao);
        Example<Zhaosheng> example = Example.of(zhaosheng);
        zhaoshengList = zhaoshengDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (zhaoshengList.isEmpty()) {
            zhaoshengList.add(zhaosheng);
        }
        return zhaoshengList;
    }

    /**
     * 通过工号查询所带班级获奖情况
     */
    @Override
    public List<Jiaoxuehuojiang> findJiaoXueHuoJiang(String gonghao) {
        List<Jiaoxuehuojiang> jiaoxuehuojiangList;
        Jiaoxuehuojiang jiaoxuehuojiang = new Jiaoxuehuojiang();
        jiaoxuehuojiang.setGonghao(gonghao);
        Example<Jiaoxuehuojiang> example = Example.of(jiaoxuehuojiang);
        jiaoxuehuojiangList = jiaoxuehuojiangDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (jiaoxuehuojiangList.isEmpty()) {
            jiaoxuehuojiangList.add(jiaoxuehuojiang);
        }
        return jiaoxuehuojiangList;
    }

    /**
     * 通过工号查询考研率等情况
     */
    @Override
    public List<Renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang> findRenzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang(String gonghao) {
        List<Renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang> renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuangList;
        Renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang = new Renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang();
        renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang.setGonghao(gonghao);
        Example<Renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang> example = Example.of(renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang);
        renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuangList = renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuangDAO.findAll(example);
        //没有记录补一条空记录用于表格留空
        if (renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuangList.isEmpty()) {
            renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuangList.add(renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang);
        }
        return renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuangList;
    }

}
