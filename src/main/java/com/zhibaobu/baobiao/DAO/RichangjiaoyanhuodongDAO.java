package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Richangjiaoyanhuodong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 12:37
 **/
public interface RichangjiaoyanhuodongDAO extends JpaRepository<Richangjiaoyanhuodong, Integer>, JpaSpecificationExecutor<Richangjiaoyanhuodong> {
}
