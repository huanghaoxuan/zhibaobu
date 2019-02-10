package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Zhidaojingsai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 16:11
 **/
public interface ZhidaojingsaiDAO extends JpaRepository<Zhidaojingsai, Integer>, JpaSpecificationExecutor<Zhidaojingsai> {
}
