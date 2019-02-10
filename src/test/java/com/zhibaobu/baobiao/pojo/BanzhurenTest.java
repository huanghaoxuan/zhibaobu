package com.zhibaobu.baobiao.pojo;

import com.zhibaobu.baobiao.DAO.BanzhurenDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-01 13:16
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class BanzhurenTest {

    @Autowired
    private BanzhurenDAO banzhurenDAO;
    /**
     * 添加班主任
     */
    @Test
    public void addTest() {
        Banzhuren banzhuren = new Banzhuren();
        banzhuren.setShenheqingkuang("好棒");
        banzhuren.setGonghao("2143242");
        Date utilDate = new Date();//util.Date
        System.out.println("utilDate : " + utilDate);
        //util.Date转sql.Date
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        System.out.println("sqlDate : " + sqlDate);
        banzhuren.setKaishishijian(sqlDate);
        this.banzhurenDAO.save(banzhuren);
    }
}