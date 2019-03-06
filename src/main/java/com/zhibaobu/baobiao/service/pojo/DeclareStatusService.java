package com.zhibaobu.baobiao.service.pojo;

import com.zhibaobu.baobiao.pojo.DeclareStatus;

import java.util.List;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-03-03 00:26
 **/
public interface DeclareStatusService {

    /**
     * 第一次申请时进行所有信息填写
     *
     * @param gonghao   工号
     * @param xuekeID   学科ID
     * @param xuekeName 学科名字
     * @param zhicheng  职称
     */
    DeclareStatus saveDeclareStatus(String gonghao, String xingmin, String xuekeID, String xuekeName, String zhicheng);

    /**
     * 查找当前用户所有申请记录
     *
     * @param gonghao
     * @return
     */
    List<DeclareStatus> findAllDeclareStatus(String gonghao);

    /**
     * 查询所有老师所有申报状态
     *
     * @return 老师所有的申报信息
     */
    List<DeclareStatus> findAllDeclareStatus(Integer page);

    /**
     * 更新申请记录
     *
     * @param gonghao
     * @param xingming
     * @param xuekeID
     * @param xuekeName
     * @param zhicheng
     * @return
     */
    DeclareStatus updateDeclareStatus(Integer ID,String gonghao, String xingming, String xuekeID, String xuekeName, String zhicheng);

    /**
     * 删除申报记录
     *
     * @param ID
     * @return
     */
    void deleteDeclareStatus(Integer ID);

    /**
     * 更新审核状态
     *
     * @param ID
     * @param status
     * @return
     */
    DeclareStatus updateDeclareStatus(Integer ID, String status);

    /**
     * 查询总查询条数
     * @return
     */
    Long findAllDeclareStatusCount();
}
