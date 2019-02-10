package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Zhuanyejianshezonghegaige;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 16:13
 **/
public interface ZhuanyejianshezonghegaigeDAO extends JpaRepository<Zhuanyejianshezonghegaige, Integer>, JpaSpecificationExecutor<Zhuanyejianshezonghegaige> {
}
