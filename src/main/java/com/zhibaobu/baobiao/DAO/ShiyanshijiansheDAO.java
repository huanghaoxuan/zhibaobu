package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Shiyanshijianshe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 15:48
 **/
public interface ShiyanshijiansheDAO extends JpaRepository<Shiyanshijianshe, Integer>, JpaSpecificationExecutor<Shiyanshijianshe> {
}
