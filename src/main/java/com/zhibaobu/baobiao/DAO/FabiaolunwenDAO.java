package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Fabiaolunwen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-01 18:21
 **/
public interface FabiaolunwenDAO extends JpaRepository<Fabiaolunwen, Integer>, JpaSpecificationExecutor<Fabiaolunwen> {
}
