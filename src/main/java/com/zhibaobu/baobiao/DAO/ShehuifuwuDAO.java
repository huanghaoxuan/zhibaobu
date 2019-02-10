package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Shehuifuwu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 12:45
 **/
public interface ShehuifuwuDAO extends JpaRepository<Shehuifuwu, Integer>, JpaSpecificationExecutor<Shehuifuwu> {
}
