package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Zhidaodachuang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 16:06
 **/
public interface ZhidaodachuangDAO extends JpaRepository<Zhidaodachuang, Integer>, JpaSpecificationExecutor<Zhidaodachuang> {
}
