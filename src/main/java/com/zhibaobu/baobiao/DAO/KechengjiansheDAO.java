package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Kechengjianshe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-01 23:26
 **/
public interface KechengjiansheDAO extends JpaRepository<Kechengjianshe, Integer>, JpaSpecificationExecutor<Kechengjianshe> {
}
