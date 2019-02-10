package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Jiaoxuehuojiang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-01 22:59
 **/
public interface JiaoxuehuojiangDAO extends JpaRepository<Jiaoxuehuojiang, Integer>, JpaSpecificationExecutor<Jiaoxuehuojiang> {
}
