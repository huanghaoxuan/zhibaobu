package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.NewsInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-03-06 17:35
 **/
public interface NewsInfoDAO extends JpaRepository<NewsInfo, Integer>, JpaSpecificationExecutor<NewsInfo> {
}
