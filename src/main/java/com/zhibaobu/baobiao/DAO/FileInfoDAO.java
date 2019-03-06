package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-03-04 19:30
 **/
public interface FileInfoDAO extends JpaRepository<FileInfo, Integer>, JpaSpecificationExecutor<FileInfo> {
}
