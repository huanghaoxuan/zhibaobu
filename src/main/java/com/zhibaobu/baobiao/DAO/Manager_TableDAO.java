package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Manager_Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 00:06
 **/
public interface Manager_TableDAO extends JpaRepository<Manager_Table, Integer>, JpaSpecificationExecutor<Manager_Table> {
}
