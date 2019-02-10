package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Super_manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 15:56
 **/
public interface Super_managerDAO extends JpaRepository<Super_manager, Integer>, JpaSpecificationExecutor<Super_manager> {
}
