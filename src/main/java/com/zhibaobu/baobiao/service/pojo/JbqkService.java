package com.zhibaobu.baobiao.service.pojo;

import com.zhibaobu.baobiao.pojo.Jbqk;
import org.springframework.stereotype.Service;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-03-02 23:26
 **/

public interface JbqkService {

    /**
     * 查找Jbqk实例
     *
     * @param gonghao 工号
     * @return Jbqk实例
     */
    Jbqk findJbqk(String gonghao);

    /**
     * 更新Jbqk
     *
     * @param nibaozhicheng 拟报职称
     * @param shenbaoxueke  申报职称
     * @param gonghao       工号
     */
    void updateJbqk(String gonghao, String shenbaoxueke, String nibaozhicheng);
}
