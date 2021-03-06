package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Ketangjiaoxue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-01 23:40
 **/
public interface KetangjiaoxueDAO extends JpaRepository<Ketangjiaoxue, Integer>, JpaSpecificationExecutor<Ketangjiaoxue> {
}
