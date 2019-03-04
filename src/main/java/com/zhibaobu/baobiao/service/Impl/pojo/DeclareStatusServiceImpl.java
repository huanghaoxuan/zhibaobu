package com.zhibaobu.baobiao.service.Impl.pojo;

import com.zhibaobu.baobiao.DAO.DeclareStatusDAO;
import com.zhibaobu.baobiao.pojo.DeclareStatus;
import com.zhibaobu.baobiao.service.pojo.DeclareStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-03-03 00:26
 **/
@Service
public class DeclareStatusServiceImpl implements DeclareStatusService {
    @Autowired
    private DeclareStatusDAO declareStatusDAO;

    /**
     * 第一次申请时进行所有信息填写
     *
     * @param gonghao   工号
     * @param xuekeID   学科ID
     * @param xuekeName 学科名字
     * @param zhicheng  职称
     * @return 申报的基本信息
     */
    @Override
    public DeclareStatus saveDeclareStatus(String gonghao, String xingming, String xuekeID, String xuekeName, String zhicheng) {
        //获得当前年份
        SimpleDateFormat df = new SimpleDateFormat("yyyy");//设置日期格式
        String year = df.format(new java.util.Date());
        DeclareStatus declareStatus = new DeclareStatus();
        java.util.Date date = new java.util.Date();
        declareStatus.setGonghao(gonghao).setXuekeID(xuekeID).setXuekeName(xuekeName).setZhicheng(zhicheng).setTime(new Date(new java.util.Date().getTime())).setStatus("未审核").setYear(year).setXingming(xingming);
        declareStatusDAO.save(declareStatus);
        return declareStatus;
    }

    /**
     * 查询该老师所有申报状态
     *
     * @param gonghao
     * @return 该老师所有的申报信息
     */
    @Override
    public List<DeclareStatus> findAllDeclareStatus(String gonghao) {

        DeclareStatus declareStatus = new DeclareStatus();
        declareStatus.setGonghao(gonghao);
        Example<DeclareStatus> example = Example.of(declareStatus);
        return declareStatusDAO.findAll(example);
    }

    /**
     * 查询所有老师所有申报状态
     *
     * @return 老师所有的申报信息
     */
    @Override
    public List<DeclareStatus> findAllDeclareStatus() {

        Example<DeclareStatus> example = Example.of(new DeclareStatus());
        return declareStatusDAO.findAll(example);
    }

    /**
     * 对申报信息进行更新
     *
     * @param gonghao
     * @param xingming
     * @param xuekeID
     * @param xuekeName
     * @param zhicheng
     * @return
     */
    @Override
    public DeclareStatus updateDeclareStatus(String gonghao, String xingming, String xuekeID, String xuekeName, String zhicheng) {
        //获得当前年份
        SimpleDateFormat df = new SimpleDateFormat("yyyy");//设置日期格式
        String year = df.format(new java.util.Date());
        DeclareStatus declareStatus = new DeclareStatus();
        declareStatus.setGonghao(gonghao).setYear(year);
        Example<DeclareStatus> example = Example.of(declareStatus);
        declareStatus = declareStatusDAO.findOne(example).get().setXuekeID(xuekeID).setXuekeName(xuekeName).setZhicheng(zhicheng).setTime(new Date(new java.util.Date().getTime())).setStatus("未审核").setYear(year).setXingming(xingming);
        declareStatusDAO.save(declareStatus);
        return declareStatus;
    }

    /**
     * 删除申报记录
     *
     * @param ID
     */
    @Override
    public void deleteDeclareStatus(Integer ID) {
        DeclareStatus declareStatus = new DeclareStatus();
        declareStatus.setID(ID);
        Example<DeclareStatus> example = Example.of(declareStatus);
        declareStatus = declareStatusDAO.findOne(example).get();
        declareStatusDAO.delete(declareStatus);
    }

    /**
     * 更新审核状态
     *
     * @param ID
     * @param status
     * @return
     */
    @Override
    public DeclareStatus updateDeclareStatus(Integer ID, String status) {
        DeclareStatus declareStatus = new DeclareStatus();
        declareStatus.setID(ID);
        Example<DeclareStatus> example = Example.of(declareStatus);
        declareStatus = declareStatusDAO.findOne(example).get().setStatus(status);
        declareStatusDAO.save(declareStatus);
        return declareStatus;
    }
}
