package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Daishixi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-01 15:02
 **/
public interface DaishixiDAO extends JpaRepository<Daishixi, Integer>, JpaSpecificationExecutor<Daishixi> {
}
