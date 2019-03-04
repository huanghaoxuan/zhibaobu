package com.zhibaobu.baobiao.controller;

import com.zhibaobu.baobiao.pojo.DeclareStatus;
import com.zhibaobu.baobiao.service.pojo.DeclareStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-03-03 23:10
 **/

@RestController
public class AuditingController {

    @Autowired
    private DeclareStatusService declareStatusService;


    /**
     * 更新审核的通过情况
     *
     * @param ID
     * @param status
     * @return
     */
    @GetMapping("/auditing/status")
    public DeclareStatus auditing(Integer ID, String status) {
        DeclareStatus declareStatus = new DeclareStatus();
        return declareStatusService.updateDeclareStatus(ID, status);
    }

    @GetMapping("/auditing/findAllStatus")
    public List<DeclareStatus> findAllStatus() {
        return declareStatusService.findAllDeclareStatus();
    }
}
