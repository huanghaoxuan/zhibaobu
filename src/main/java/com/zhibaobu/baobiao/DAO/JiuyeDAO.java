package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Jiuye;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-01 23:21
 **/
public interface JiuyeDAO extends JpaRepository<Jiuye, Integer>, JpaSpecificationExecutor<Jiuye> {
}
