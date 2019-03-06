package com.zhibaobu.baobiao.service.pojo;

import com.zhibaobu.baobiao.pojo.NewsInfo;

import java.util.List;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-03-06 17:44
 **/
public interface NewsInfoService {

    void saveNewNewsInfo(String gonghao,String title,String content);

    /**
     * 查询总条数
     * @return
     */
    Long findCount();

    /**
     * 倒序(time)查询newsInfo的列表(分页)
     *
     * @return
     */
    List<NewsInfo> findAllNewsInfoBySortBypage(Integer page);

    /**
     * 删除一条记录
     * @param ID
     */
    void deleteByID(Integer ID);

    /**
     * 更新一条记录
     * @param ID
     * @param gonghao
     * @param title
     * @param content
     */
    void updateNewNewsInfo(Integer ID, String gonghao, String title, String content);
}
