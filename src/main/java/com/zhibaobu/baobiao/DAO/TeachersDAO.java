package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 15:58
 **/
public interface TeachersDAO extends JpaRepository<Teachers, Integer>, JpaSpecificationExecutor<Teachers> {
}
