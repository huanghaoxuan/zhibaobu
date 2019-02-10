package com.zhibaobu.baobiao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-02 16:14
 *
 * 表名：zonghehuojiang
 * 表含义：综合获奖
 **/

@Entity
@Table(name = "zonghehuojiang")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Zonghehuojiang implements Serializable {
    private static final long serialVersionUID = -1345493513993784555L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：rongyuchenghao
     * 字段类型：nvarchar(50)
     * 字段含义：荣誉称号
     */
    @Column(name = "rongyuchenghao", length = 50)
    private String rongyuchenghao;

    /**
     * 字段名：shijian
     * 字段类型：date
     * 字段含义：时间
     */
    @Column(name = "shijian")
    private Date shijian;

    /**
     * 字段名：shoujiangbumen
     * 字段类型：nvarchar(50)
     * 字段含义：授奖部门
     */
    @Column(name = "shoujiangbumen", length = 50)
    private String shoujiangbumen;

    /**
     * 字段名：huojiangjibie
     * 字段类型：nvarchar(50)
     * 字段含义：获奖级别
     */
    @Column(name = "huojiangjibie", length = 50)
    private String huojiangjibie;

    /**
     * 字段名：paiming
     * 字段类型：nvarchar(50)
     * 字段含义：排名
     */
    @Column(name = "paiming", length = 50)
    private String paiming;

    /**
     * 字段名：zongrenshu
     * 字段类型：nvarchar(50)
     * 字段含义：总人数
     */
    @Column(name = "zongrenshu", length = 50)
    private String zongrenshu;

    /**
     * 字段名：beizhu
     * 字段类型：nvarchar(50)
     * 字段含义：备注
     */
    @Column(name = "beizhu", length = 50)
    private String beizhu;

    /**
     * 字段名：xuenian
     * 字段类型：nvarchar(50)
     * 字段含义：学年
     */
    @Column(name = "xuenian", length = 50)
    private String xuenian;

    /**
     * 字段名：gonghao
     * 字段类型：nvarchar(50)
     * 字段含义：工号
     */
    @Column(name = "gonghao", length = 50)
    private String gonghao;

    /**
     * 字段名：shenheqingkuang
     * 字段类型：nvarchar(50)
     * 字段含义：审核情况
     */
    @Column(name = "shenheqingkuang", length = 50)
    private String shenheqingkuang;
}
