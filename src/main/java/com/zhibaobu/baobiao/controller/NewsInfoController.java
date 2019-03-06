package com.zhibaobu.baobiao.controller;

import com.zhibaobu.baobiao.pojo.NewsInfo;
import com.zhibaobu.baobiao.service.pojo.NewsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-03-06 17:42
 **/
@RestController
public class NewsInfoController {

    @Autowired
    private NewsInfoService newsInfoService;

    @PostMapping("/newsInfo/save")
    public List<NewsInfo> saveNewsInfo(String gonghao,String title,String content){
        newsInfoService.saveNewNewsInfo(gonghao,title,content);
        return newsInfoService.findAllNewsInfoBySortBypage(1);
    }

    @PostMapping("/newsInfo/update")
    public List<NewsInfo> updateNewsInfo(Integer ID,String gonghao,String title,String content){
        newsInfoService.updateNewNewsInfo(ID,gonghao,title,content);
        return newsInfoService.findAllNewsInfoBySortBypage(1);
    }

    /**
     * 查询公告总数
     * @return
     */
    @GetMapping("/newsInfo/count")
    public Long newsInfoCount() {
        return newsInfoService.findCount();
    }

    /**
     * 查询fileInfo的列表(分页)
     *
     * @return
     */
    @GetMapping("/newsInfo/List")
    public List<NewsInfo> List(Integer page) {
        return newsInfoService.findAllNewsInfoBySortBypage(page);
    }

    /**
     * 删除记录
     * @param ID
     * @return
     */
    @GetMapping("/newsInfo/remove")
    public List<NewsInfo> remove(Integer ID){
        newsInfoService.deleteByID(ID);
        return newsInfoService.findAllNewsInfoBySortBypage(1);
    }

}
