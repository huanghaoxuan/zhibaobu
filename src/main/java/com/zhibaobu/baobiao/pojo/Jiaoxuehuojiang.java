package com.zhibaobu.baobiao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-01 22:53
 *
 * 表名：jiaoxuehuojiang
 * 表含义：教学获奖情况表
 **/

@Entity
@Table(name = "jiaoxuehuojiang")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Jiaoxuehuojiang implements Serializable {
    private static final long serialVersionUID = -5314238380217649516L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：huojiangmingcheng
     * 字段类型：nvarchar(50)
     * 字段含义：获奖名称
     */
    @Column(name = "huojiangmingcheng", length = 50)
    private String huojiangmingcheng;

    /**
     * 字段名：huojiangleixing
     * 字段类型：nvarchar(50)
     * 字段含义：获奖类型
     */
    @Column(name = "huojiangleixing", length = 50)
    private String huojiangleixing;

    /**
     * 字段名：huojiangjibie
     * 字段类型：nvarchar(50)
     * 字段含义：获奖级别
     */
    @Column(name = "huojiangjibie", length = 50)
    private String huojiangjibie;

    /**
     * 字段名：huojiangdengji
     * 字段类型：nvarchar(50)
     * 字段含义：获奖等级
     */
    @Column(name = "huojiangdengji", length = 50)
    private String huojiangdengji;

    /**
     * 字段名：zhidaoxingshi
     * 字段类型：nvarchar(50)
     * 字段含义：指导形式
     */
    @Column(name = "zhidaoxingshi", length = 50)
    private String zhidaoxingshi;

    /**
     * 字段名：cansairenshu
     * 字段类型：nvarchar(50)
     * 字段含义：参赛人数
     */
    @Column(name = "cansairenshu", length = 50)
    private String cansairenshu;

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
     * 字段名：shenheqingkuang
     * 字段类型：nvarchar(50)
     * 字段含义：审核情况
     */
    @Column(name = "shenheqingkuang", length = 50)
    private String shenheqingkuang;

    /**
     * 字段名：fufen
     * 字段类型：nvarchar(50)
     * 字段含义：赋分
     */
    @Column(name = "fufen", length = 50)
    private String fufen;

    /**
     * 字段名：gonghao
     * 字段类型：nvarchar(50)
     * 字段含义：工号
     */
    @Column(name = "gonghao", length = 50)
    private String gonghao;
}
