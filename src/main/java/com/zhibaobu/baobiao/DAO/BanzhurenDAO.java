package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Banzhuren;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-01 13:18
 **/
public interface BanzhurenDAO extends JpaRepository<Banzhuren, Integer>,JpaSpecificationExecutor<Banzhuren> {
}
