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
 * @create: 2019-02-02 16:07
 *
 * 表名：zhidaojingsai
 * 表含义：指导竞赛
 **/

@Entity
@Table(name = "zhidaojingsai")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Zhidaojingsai implements Serializable {
    private static final long serialVersionUID = 3764133807454171649L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：jingsaimingcheng
     * 字段类型：nvarchar(50)
     * 字段含义：竞赛名称
     */
    @Column(name = "jingsaimingcheng",length = 50)
    private String jingsaimingcheng;

    /**
     * 字段名：jingsaijibie
     * 字段类型：nvarchar(50)
     * 字段含义：竞赛级别
     */
    @Column(name = "jingsaijibie",length = 50)
    private String jingsaijibie;

    /**
     * 字段名：tedengjiangrenshu
     * 字段类型：nvarchar(50)
     * 字段含义：特等奖人数
     */
    @Column(name = "tedengjiangrenshu",length = 50)
    private String tedengjiangrenshu;

    /**
     * 字段名：yidengjiangrenshu
     * 字段类型：nvarchar(50)
     * 字段含义：一等奖人数
     */
    @Column(name = "yidengjiangrenshu",length = 50)
    private String yidengjiangrenshu;

    /**
     * 字段名：erdengjiangrenshu
     * 字段类型：nvarchar(50)
     * 字段含义：二等奖人数
     */
    @Column(name = "erdengjiangrenshu",length = 50)
    private String erdengjiangrenshu;

    /**
     * 字段名：sandengjiangrenshu
     * 字段类型：nvarchar(50)
     * 字段含义：三等奖人数
     */
    @Column(name = "sandengjiangrenshu",length = 50)
    private String sandengjiangrenshu;

    /**
     * 字段名：youxiujiangrenshu
     * 字段类型：nvarchar(50)
     * 字段含义：优秀奖人数
     */
    @Column(name = "youxiujiangrenshu",length = 50)
    private String youxiujiangrenshu;

    /**
     * 字段名：zhidaoxingshi
     * 字段类型：nvarchar(50)
     * 字段含义：指导形式
     */
    @Column(name = "zhidaoxingshi",length = 50)
    private String zhidaoxingshi;

    /**
     * 字段名：zhidaojiaoshirenshu
     * 字段类型：nvarchar(50)
     * 字段含义：指导教师人数
     */
    @Column(name = "zhidaojiaoshirenshu",length = 50)
    private String zhidaojiaoshirenshu;

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
     * 字段名：fufen
     * 字段类型：nvarchar(50)
     * 字段含义：赋分
     */
    @Column(name = "fufen",length = 50)
    private String fufen;

    /**
     * 字段名：gonghao
     * 字段类型：nvarchar(50)
     * 字段含义：工号
     */
    @Column(name = "gonghao",length = 50)
    private String gonghao;
}
