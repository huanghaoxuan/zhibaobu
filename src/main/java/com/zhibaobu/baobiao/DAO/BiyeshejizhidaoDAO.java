package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Biyeshejizhidao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-01 14:06
 **/
public interface BiyeshejizhidaoDAO extends JpaRepository<Biyeshejizhidao, Integer>, JpaSpecificationExecutor<Biyeshejizhidao> {
}
