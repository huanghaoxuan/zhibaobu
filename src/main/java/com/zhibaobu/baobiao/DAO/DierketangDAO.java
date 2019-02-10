package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Dierketang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-01 18:15
 **/
public interface DierketangDAO extends JpaRepository<Dierketang, Integer>, JpaSpecificationExecutor<Dierketang> {
}
