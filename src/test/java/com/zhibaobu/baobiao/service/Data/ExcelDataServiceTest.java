package com.zhibaobu.baobiao.service.Data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 22:38
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ExcelDataServiceTest {

    @Autowired
    private ExcelDataService excelDataService;

    @Test
    public void test() {
        excelDataService.setGonghao("1");
        excelDataService.findNiandukaoheqingkuang();
    }
}