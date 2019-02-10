package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Jidijianshe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-01 23:15
 **/
public interface JidijiansheDAO extends JpaRepository<Jidijianshe, Integer>, JpaSpecificationExecutor<Jidijianshe> {
}
