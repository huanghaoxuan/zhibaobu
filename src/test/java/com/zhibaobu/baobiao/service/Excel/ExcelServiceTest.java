package com.zhibaobu.baobiao.service.Excel;

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
 * @create: 2019-02-02 21:06
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ExcelServiceTest {

    @Autowired
    private ExcelService excelService;

    @Test
    public void test(){
        excelService.excel();
    }
}