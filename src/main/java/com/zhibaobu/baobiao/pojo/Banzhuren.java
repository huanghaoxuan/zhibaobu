package com.zhibaobu.baobiao.pojo;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-01 13:12
 *
 * 表名：banzhuren
 * 表含义：班主任
 **/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "banzhuren")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Banzhuren implements Serializable {

    private static final long serialVersionUID = 8533494330511255087L;
    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：suodaibanjipingweixiaojixianjin
     * 字段类型：nvarchar(50)
     * 字段含义：所带班级评为校级先进
     */
    @Column(name = "suodaibanjipingweixiaojixianjin", length = 50)
    private String suodaibanjipingweixiaojixianjin;

    /**
     * 字段名：suodaibanjipingweishengjixianjin
     * 字段类型：nvarchar(50)
     * 字段含义：所带班级评为省级先进
     */
    @Column(name = "suodaibanjipingweishengjixianjin", length = 50)
    private String suodaibanjipingweishengjixianjin;

    /**
     * 字段名：suodaibanjiqitahuojiang
     * 字段类型：nvarchar(50)
     * 字段含义：所带班级其他获奖
     */
    @Column(name = "suodaibanjiqitahuojiang", length = 50)
    private String suodaibanjiqitahuojiang;

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
     * 字段名：gonghao
     * 字段类型：nvarchar(50)
     * 字段含义：工号
     */
    @Column(name = "gonghao", length = 50)
    private String gonghao;

    /**
     * 字段名：kaishishijian
     * 字段类型：date
     * 字段含义：开始时间
     */
    @Column(name = "kaishishijian")
    private Date kaishishijian;

    /**
     * 字段名：jieshushijian
     * 字段类型：date
     * 字段含义：结束时间
     */
    @Column(name = "jieshushijian")
    private Date jieshushijian;
}

