package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.College_manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-01 14:45
 **/
public interface College_managerDAO extends JpaRepository<College_manager, Integer>, JpaSpecificationExecutor<College_manager> {
}
