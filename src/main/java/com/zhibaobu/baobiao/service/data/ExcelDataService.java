package com.zhibaobu.baobiao.service.data;

import com.zhibaobu.baobiao.pojo.*;

import java.util.List;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-03-02 23:04
 **/

public interface ExcelDataService {
    /**
     * 通过gonghao获取Jbqk
     */
    Jbqk findJbqk(String gonghao);

    /**
     * 通过gonghao获取List<Niandukaoheqingkuang>
     */
    List<Niandukaoheqingkuang> findNiandukaoheqingkuang(String gonghao);

    /**
     * 查询专业实践要求的实体
     * <p>
     * 毕业设计指导 Biyeshejizhidao
     * 指导大创 Zhidaodachuang
     * 指导竞赛 Zhidaojingsai
     */

    List<Biyeshejizhidao> findBiyeshejizhidao(String gonghao);

    List<Zhidaodachuang> findZhidaodachuang(String gonghao);

    List<Zhidaojingsai> findZhidaojingsai(String gonghao);

    /**
     * 查询班主任
     */

    List<Banzhuren> findBanZhuRen(String gonghao);

    /**
     * 查询横向课题
     */

    List<Hengxiangketixiangmu> findHengXiangKeTi(String gonghao);

    /**
     * 查询纵向课题
     */

    List<Zongxiangketixiangmu> findZongXiangKeTi(String gonghao);

    /**
     * 通过工号查询综合获奖情况
     */

    List<Zonghehuojiang> findZongHeHuoJiang(String gonghao);

    /**
     * 通过工号查询课堂教学
     */

    List<Ketangjiaoxue> findKeTangJiaoXue(String gonghao);

    /**
     * 通过工号查询发表的教改论文
     */

    List<Fabiaolunwen> findJiaoGaiLunWen(String gonghao);

    /**
     * 通过工号查询发表的科研论文和教材
     */

    List<Fabiaolunwen> findLunwenJiaoCai(String gonghao);


    List<Jiaocaijianshe> findJiaocaijianshe(String gonghao);

    /**
     * 通过工号查询起草的重要文件
     */

    List<Renzhiyilaiqicaozhidingdezhongyaowenjianbaogao> findRenzhiyilaiqicaozhidingdezhongyaowenjianbaogao(String gonghao);

    /**
     * 通过工号查询教改情况
     */

    List<Chengdanjiaoyanjiaogaiketi> findChengdanjiaoyanjiaogaiketi(String gonghao);

    /**
     * 通过工号查询招生情况
     */

    List<Zhaosheng> findZhaoSheng(String gonghao);

    /**
     * 通过工号查询所带班级获奖情况
     */

    List<Jiaoxuehuojiang> findJiaoXueHuoJiang(String gonghao);

    /**
     * 通过工号查询考研率等情况
     */

    List<Renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang> findRenzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang(String gonghao);
}
