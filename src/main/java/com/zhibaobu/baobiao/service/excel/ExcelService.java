package com.zhibaobu.baobiao.service.excel;

import org.springframework.stereotype.Service;

import java.security.PrivateKey;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-03-02 23:12
 **/

public interface ExcelService {

    void excel(String gonghao, String xuekeName, String zhicheng);
}
