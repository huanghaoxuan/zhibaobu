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
 * @create: 2019-02-01 15:44
 *
 * 表名：dierketang
 * 表含义：第二课堂
 **/

@Entity
@Table(name = "daishixi")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Dierketang implements Serializable {
    private static final long serialVersionUID = -2111598713308767048L;

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
    @Column(name = "huodongmingcheng", length = 50)
    private String huodongmingcheng;

    /**
     * 字段名：zhidaoxingshi
     * 字段类型：nvarchar(50)
     * 字段含义：指导形式
     */
    @Column(name = "zhidaoxingshi", length = 50)
    private String zhidaoxingshi;

    /**
     * 字段名：dingqizhidao
     * 字段类型：nvarchar(50)
     * 字段含义：定期指导
     */
    @Column(name = "dingqizhidao", length = 50)
    private String dingqizhidao;

    /**
     * 字段名：budingqizhidao
     * 字段类型：nvarchar(50)
     * 字段含义：不定期指导
     */
    @Column(name = "budingqizhidao", length = 50)
    private String budingqizhidao;

    /**
     * 字段名：zhidaoshijian
     * 字段类型：nvarchar(50)
     * 字段含义：指导时间
     */
    @Column(name = "zhidaoshijian", length = 50)
    private String zhidaoshijian;

    /**
     * 字段名：biaozhixingchengguo
     * 字段类型：nvarchar(50)
     * 字段含义：标志性成果
     */
    @Column(name = "biaozhixingchengguo", length = 50)
    private String biaozhixingchengguo;

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
}
