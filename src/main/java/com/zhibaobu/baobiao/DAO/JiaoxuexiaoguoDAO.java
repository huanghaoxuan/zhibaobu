package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Jiaoxuexiaoguo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-01 23:08
 **/
public interface JiaoxuexiaoguoDAO extends JpaRepository<Jiaoxuexiaoguo, Integer>, JpaSpecificationExecutor<Jiaoxuexiaoguo> {
}
