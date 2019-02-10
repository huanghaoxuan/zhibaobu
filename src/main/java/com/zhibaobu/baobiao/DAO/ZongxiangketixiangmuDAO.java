package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Zongxiangketixiangmu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 16:22
 **/
public interface ZongxiangketixiangmuDAO extends JpaRepository<Zongxiangketixiangmu, Integer>, JpaSpecificationExecutor<Zongxiangketixiangmu> {
}
