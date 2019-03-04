package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Daishixi;
import com.zhibaobu.baobiao.pojo.DeclareStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-03-03 00:25
 **/
public interface DeclareStatusDAO extends JpaRepository<DeclareStatus, Integer>, JpaSpecificationExecutor<DeclareStatus> {
}
