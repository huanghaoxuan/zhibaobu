package com.zhibaobu.baobiao.service.Impl.pojo;

import com.zhibaobu.baobiao.DAO.JbqkDAO;
import com.zhibaobu.baobiao.pojo.Jbqk;
import com.zhibaobu.baobiao.service.pojo.JbqkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-03-02 23:26
 **/
@Service
public class JbqkServiceImpl implements JbqkService {

    @Autowired
    private JbqkDAO jbqkDAO;


    @Override
    public Jbqk findJbqk(String gonghao) {
        Jbqk jbqk = new Jbqk();
        jbqk.setGonghao(gonghao);
        Example<Jbqk> example = Example.of(jbqk);
        return jbqkDAO.findOne(example).get();
    }

    @Override
    public void updateJbqk(String gonghao, String shenbaoxueke, String nibaozhicheng) {
        Jbqk jbqk = new Jbqk();
        jbqk = findJbqk(gonghao);
        jbqk.setNibaozhicheng(nibaozhicheng).setShenbaoxueke(shenbaoxueke);
        jbqkDAO.save(jbqk);
    }

}
