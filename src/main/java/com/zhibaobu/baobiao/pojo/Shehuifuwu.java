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
 * @create: 2019-02-02 12:38
 *
 * 表名：shehuifuwu
 * 表含义：社会服务
 **/

@Entity
@Table(name = "shehuifuwu")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Shehuifuwu implements Serializable {
    private static final long serialVersionUID = -1063249275936786225L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：huodongmingcheng
     * 字段类型：nvarchar(50)
     * 字段含义：活动名称
     */
    @Column(name = "huodongmingcheng",length = 50)
    private String huodongmingcheng;

    /**
     * 字段名：canyuxingshi
     * 字段类型：nvarchar(50)
     * 字段含义：参与性质
     */
    @Column(name = "canyuxingshi",length = 50)
    private String canyuxingshi;

    /**
     * 字段名：beizhu
     * 字段类型：nvarchar(50)
     * 字段含义：备注
     */
    @Column(name = "beizhu",length = 50)
    private String beizhu;

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
