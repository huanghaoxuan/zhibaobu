package com.zhibaobu.baobiao.DAO;

import com.zhibaobu.baobiao.pojo.Jbqk;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 19:58
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class JbqkDAOTest {

    @Autowired
    private JbqkDAO jbqkDAO;

    /**
     * 通过工号查询
     */
    @Test
    public void findTest(){
        Jbqk jbqk = new Jbqk();
        jbqk.setGonghao("1");
        Example<Jbqk> example = Example.of(jbqk);
        jbqk = jbqkDAO.findOne(example).get();
        System.out.println(jbqk);
    }
}