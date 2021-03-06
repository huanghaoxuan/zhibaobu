package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Shixunzhidao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 12:55
 **/
public interface ShixunzhidaoDAO extends JpaRepository<Shixunzhidao, Integer>, JpaSpecificationExecutor<Shixunzhidao> {
}
