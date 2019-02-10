package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Zhaosheng;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 16:02
 **/
public interface ZhaoshengDAO extends JpaRepository<Zhaosheng, Integer>, JpaSpecificationExecutor<Zhaosheng> {
}
