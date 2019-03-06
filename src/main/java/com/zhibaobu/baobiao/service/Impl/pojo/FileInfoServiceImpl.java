package com.zhibaobu.baobiao.service.Impl.pojo;


import com.zhibaobu.baobiao.DAO.FileInfoDAO;
import com.zhibaobu.baobiao.pojo.FileInfo;
import com.zhibaobu.baobiao.service.pojo.FileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-03-04 20:40
 **/
@Service
public class FileInfoServiceImpl implements FileInfoService {

    @Autowired
    private FileInfoDAO fileInfoDAO;

    /**
     * 倒序(time)查询fileInfo的列表
     *
     * @return
     */
    @Override
    public List<FileInfo> findAllFileInfoBySortBypage(Integer page) {

        //定义排序 （倒序 即日期近的在上面）
        Sort sort = new Sort(Sort.Direction.DESC, "ID");
        System.out.println(page);
        Pageable pageable = PageRequest.of(page-1,10,sort);
        List<FileInfo> content = fileInfoDAO.findAll(pageable).getContent();
        return fileInfoDAO.findAll(pageable).getContent();
    }

    @Override
    public Long findCount() {
        return fileInfoDAO.count();
    }

    /**
     * 文件信息保存
     * @param gonghao
     * @param title
     * @param fileInfoName
     */
    @Override
    public void fileInfoupload(String gonghao, String title,String fileInfoName) {
        FileInfo fileInfo = new FileInfo().setGonghao(gonghao).setTitle(title).setTime(new Date(new java.util.Date().getTime())).setFileInfoName(fileInfoName);
        fileInfoDAO.save(fileInfo);
    }

    /**
     * 文件本体保存
     * @param file
     *
     * @return
     */
    @Override
    public String fileUpload(MultipartFile file) {
        java.util.Date date = new java.util.Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_");//可以方便地修改日期格式
        String time = dateFormat.format(date);
        if (!file.isEmpty()) {
            try {
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(new File(this.getClass().getClassLoader().getResource(".").getPath() + "static/fileInfo/"
                                + time + file.getOriginalFilename())));
                //System.out.println(file.getName());
                out.write(file.getBytes());
                out.flush();
                out.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();

            } catch (IOException e) {
                e.printStackTrace();

            }
        }return time + file.getOriginalFilename();
    }

    @Override
    public FileInfo findOne(Integer ID) {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setID(ID);
        Example<FileInfo> example = Example.of(fileInfo);
        return fileInfoDAO.findOne(example).get();
    }

    @Override
    public void deleteByID(Integer ID) {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setID(ID);
        fileInfoDAO.delete(fileInfo);
    }
}

