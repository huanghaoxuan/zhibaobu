package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Shiyankecheng;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 13:21
 **/
public interface ShiyankechengDAO extends JpaRepository<Shiyankecheng, Integer>, JpaSpecificationExecutor<Shiyankecheng> {
}
