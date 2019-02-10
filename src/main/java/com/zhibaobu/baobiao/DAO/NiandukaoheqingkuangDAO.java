package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Niandukaoheqingkuang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 12:22
 **/
public interface NiandukaoheqingkuangDAO extends JpaRepository<Niandukaoheqingkuang, Integer>, JpaSpecificationExecutor<Niandukaoheqingkuang> {
}
