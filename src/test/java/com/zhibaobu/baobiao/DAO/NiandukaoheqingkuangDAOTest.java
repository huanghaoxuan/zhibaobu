package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.College_manager;
import com.zhibaobu.baobiao.pojo.Niandukaoheqingkuang;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-03 01:18
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class NiandukaoheqingkuangDAOTest {

    @Autowired
    private NiandukaoheqingkuangDAO niandukaoheqingkuangDAO;

    /**
     * 查询
     */
    @Test
    public void find() {
        Niandukaoheqingkuang niandukaoheqingkuang = new Niandukaoheqingkuang();
        niandukaoheqingkuang.setGonghao("1");
        Example<Niandukaoheqingkuang> example = Example.of(niandukaoheqingkuang);
        System.out.println(example);
        List<Niandukaoheqingkuang> list = niandukaoheqingkuangDAO.findAll(example);
        for (Niandukaoheqingkuang niandukaoheqingkuang1 : list) {
            System.out.println(niandukaoheqingkuang1);
        }
    }
}