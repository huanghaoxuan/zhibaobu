package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Zonghehuojiang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 16:17
 **/
public interface ZonghehuojiangDAO extends JpaRepository<Zonghehuojiang, Integer>, JpaSpecificationExecutor<Zonghehuojiang> {
}
