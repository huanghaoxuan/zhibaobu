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
 * @create: 2019-02-02 15:59
 *
 * 表名：zhaosheng
 * 表含义：招生
 **/

@Entity
@Table(name = "zhaosheng")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Zhaosheng implements Serializable {
    private static final long serialVersionUID = 6125744749801989860L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：zhaoshengdianfuzeren
     * 字段类型：nvarchar(50)
     * 字段含义：招生点负责人
     */
    @Column(name = "zhaoshengdianfuzeren",length = 50)
    private String zhaoshengdianfuzeren;

    /**
     * 字段名：canyuzhaosheng
     * 字段类型：nvarchar(50)
     * 字段含义：参与招生
     */
    @Column(name = "canyuzhaosheng",length = 50)
    private String canyuzhaosheng;

    /**
     * 字段名：zhaoshengbiaoxian
     * 字段类型：nvarchar(50)
     * 字段含义：招生表现
     */
    @Column(name = "zhaoshengbiaoxian",length = 50)
    private String zhaoshengbiaoxian;

    /**
     * 字段名：zhaoshengyeji
     * 字段类型：nvarchar(50)
     * 字段含义：招生业绩
     */
    @Column(name = "zhaoshengyeji",length = 50)
    private String zhaoshengyeji;

    /**
     * 字段名：beizhu
     * 字段类型：nvarchar(50)
     * 字段含义：备注
     */
    @Column(name = "beizhu",length = 50)
    private String beizhu;

    /**
     * 字段名：didian
     * 字段类型：nvarchar(50)
     * 字段含义：地点
     */
    @Column(name = "didian",length = 50)
    private String didian;


    /**
     * 字段名：xuenian
     * 字段类型：nvarchar(50)
     * 字段含义：学年
     */
    @Column(name = "xuenian",length = 50)
    private String xuenian;

    /**
     * 字段名：shenheqingkuang
     * 字段类型：nvarchar(50)
     * 字段含义：审核情况
     */
    @Column(name = "shenheqingkuang",length = 50)
    private String shenheqingkuang;

    /**
     * 字段名：gonghao
     * 字段类型：nvarchar(50)
     * 字段含义：工号
     */
    @Column(name = "gonghao",length = 50)
    private String gonghao;
}
