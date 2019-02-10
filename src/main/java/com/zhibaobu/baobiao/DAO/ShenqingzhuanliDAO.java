package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Shenqingzhuanli;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 12:50
 **/
public interface ShenqingzhuanliDAO extends JpaRepository<Shenqingzhuanli, Integer>, JpaSpecificationExecutor<Shenqingzhuanli> {
}
