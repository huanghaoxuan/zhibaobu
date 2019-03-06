package com.zhibaobu.baobiao.service.pojo;

import com.zhibaobu.baobiao.pojo.FileInfo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-03-04 20:39
 **/
public interface FileInfoService {

    /**
     * 倒序(time)查询fileInfo的列表(分页)
     *
     * @return
     */
    List<FileInfo> findAllFileInfoBySortBypage(Integer page);

    /**
     * 查询总条数
     * @return
     */
    Long findCount();

    void fileInfoupload(String gonghao, String title, String fileInfoName);

    /**
     * 储存文件本体
     * @param file
     *
     * @return 文件名字
     */
    String fileUpload(MultipartFile file);

    /**
     * 查询单条记录
     * @param ID
     * @return
     */
    FileInfo findOne(Integer ID);

    /**
     * 删除一条记录
     * @param ID
     */
    void deleteByID(Integer ID);

}
