package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Jiaocaijianshe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-01 22:52
 **/
public interface JiaocaijiansheDAO extends JpaRepository<Jiaocaijianshe, Integer>, JpaSpecificationExecutor<Jiaocaijianshe> {
}
