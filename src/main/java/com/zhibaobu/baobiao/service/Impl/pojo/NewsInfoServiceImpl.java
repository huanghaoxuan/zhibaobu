package com.zhibaobu.baobiao.service.Impl.pojo;

import com.zhibaobu.baobiao.DAO.NewsInfoDAO;
import com.zhibaobu.baobiao.pojo.NewsInfo;
import com.zhibaobu.baobiao.service.pojo.NewsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-03-06 17:45
 **/
@Service
public class NewsInfoServiceImpl implements NewsInfoService {

    @Autowired
    private NewsInfoDAO newsInfoDAO;

    @Override
    public void saveNewNewsInfo(String gonghao, String title, String content) {
        newsInfoDAO.save(new NewsInfo().setGonghao(gonghao).setTitle(title).setContent(content).setTime(new Date(new java.util.Date().getTime())));
    }

    @Override
    public Long findCount() {
        return newsInfoDAO.count();
    }

    @Override
    public List<NewsInfo> findAllNewsInfoBySortBypage(Integer page) {
        //定义排序 （倒序 即日期近的在上面）
        Sort sort = new Sort(Sort.Direction.DESC, "ID");
        Pageable pageable = PageRequest.of(page - 1, 10, sort);
        List<NewsInfo> content = newsInfoDAO.findAll(pageable).getContent();
        return newsInfoDAO.findAll(pageable).getContent();
    }

    @Override
    public void deleteByID(Integer ID) {
        NewsInfo newsInfo = new NewsInfo();
        newsInfo.setID(ID);
        newsInfoDAO.delete(newsInfo);
    }

    @Override
    public void updateNewNewsInfo(Integer ID, String gonghao, String title, String content) {
        NewsInfo newsInfo = new NewsInfo();
        newsInfo.setID(ID);
        Example<NewsInfo> example = Example.of(newsInfo);
        newsInfoDAO.save(newsInfoDAO.findOne(example).get().setTitle(title).setContent(content).setTime(new Date(new java.util.Date().getTime())));
    }
}
