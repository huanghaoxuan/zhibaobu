package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.College_manager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;


/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-01 15:06
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class College_managerDAOTest {

    @Autowired
    private College_managerDAO college_managerDAO;

    /**
     * 添加
     */
    @Test
    public void addTest() {
        College_manager college_manager = new College_manager();
        college_manager.setGonghao("123");
        college_manager.setInkey("123");
        college_managerDAO.save(college_manager);
    }

    /**
     * 通过ID查询
     */
    @Test
    public void findByID() {
        Optional<College_manager> optional = college_managerDAO.findById(2);
        System.out.println(optional.get());
    }
}