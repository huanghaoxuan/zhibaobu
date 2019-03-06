package com.zhibaobu.baobiao.controller;

import com.zhibaobu.baobiao.pojo.FileInfo;
import com.zhibaobu.baobiao.service.pojo.FileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-03-04 21:04
 **/
@RestController
public class FileInfoController {
    @Autowired
    private FileInfoService fileInfoService;

    /**
     * 查询fileInfo的列表(分页)
     *
     * @return
     */
    @GetMapping("/fileInfo/downloadList")
    public List<FileInfo> downloadList(Integer page) {
        return fileInfoService.findAllFileInfoBySortBypage(page);
    }


    /**
     * 查询总条数
     * @return
     */
    @GetMapping("/fileInfo/count")
    public Long downloadCount() {
        return fileInfoService.findCount();
    }


    /**
     * 文件上传具体实现方法;
     *
     * @param file
     * @return
     */
    @PostMapping("/fileInfo/upload")
    public List<FileInfo> handleFileUpload(String gonghao, String title, MultipartFile file) {

        String fileInfoName = fileInfoService.fileUpload(file);
        fileInfoService.fileInfoupload(gonghao, title, fileInfoName);
        return fileInfoService.findAllFileInfoBySortBypage(1);

    }

    /**
     * 下载文件
     * @param ID
     * @param res
     */
    @GetMapping("/fileInfo/download")
    public void downloadStatus(Integer ID, HttpServletResponse res) {
        FileInfo fileInfo = fileInfoService.findOne(ID);
        try {
            //获取要下载的模板名称
            String fileName = fileInfo.getFileInfoName();
            //设置要下载的文件的名称
            res.setHeader("Content-disposition", "attachment;fileName=" + fileName);
            //通知客服文件的MIME类型
            res.setContentType("application/octet-stream;charset=UTF-8");
            //获取文件的路径
            //String filePath = getClass().getResource("/template/" + fileName).getPath();
            //excel模板路径
            File cfgFile = ResourceUtils.getFile(ResourceUtils.CLASSPATH_URL_PREFIX + "static/fileInfo/" + fileName);
            FileInputStream input = new FileInputStream(cfgFile);
            //            FileInputStream input = new FileInputStream(new File("d://"+fileName));
            OutputStream out = res.getOutputStream();
            byte[] b = new byte[2048];
            int len;
            while ((len = input.read(b)) != -1) {
                out.write(b, 0, len);
            }
            //修正 Excel在“xxx.xlsx”中发现不可读取的内容。是否恢复此工作薄的内容？如果信任此工作簿的来源，请点击"是"
            res.setHeader("Content-Length", String.valueOf(input.getChannel().size()));
            input.close();
            System.out.println("应用导入模板下载完成");
        } catch (Exception ex) {
            System.out.println("应用导入模板下载失败！");
        }
    }

    /**
     * 删除记录
     * @param ID
     * @return
     */
    @GetMapping("/fileInfo/remove")
    public List<FileInfo> remove(Integer ID){
        fileInfoService.deleteByID(ID);
        return fileInfoService.findAllFileInfoBySortBypage(1);
    }
}
