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
 * @create: 2019-02-01 18:16
 *
 * 表名：fabiaolunwen
 * 表含义：发表论文
 **/

@Entity
@Table(name = "fabiaolunwen")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Fabiaolunwen implements Serializable {
    private static final long serialVersionUID = 8161366202016103220L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：lunwentimu
     * 字段类型：nvarchar(50)
     * 字段含义：论文题目
     */
    @Column(name = "lunwentimu", length = 50)
    private String lunwentimu;

    /**
     * 字段名：fabiaoqikan
     * 字段类型：nvarchar(50)
     * 字段含义：发表期刊
     */
    @Column(name = "fabiaoqikan", length = 50)
    private String fabiaoqikan;

    /**
     * 字段名：fabiaoshijian
     * 字段类型：date
     * 字段含义：发表时间
     */
    @Column(name = "fabiaoshijian")
    private Date fabiaoshijian;

    /**
     * 字段名：qikanjibie
     * 字段类型：nvarchar(50)
     * 字段含义：期刊级别
     */
    @Column(name = "qikanjibie", length = 50)
    private String qikanjibie;

    /**
     * 字段名：shouluqingkuang
     * 字段类型：nvarchar(50)
     * 字段含义：收录情况
     */
    @Column(name = "shouluqingkuang", length = 50)
    private String shouluqingkuang;

    /**
     * 字段名：qita
     * 字段类型：nvarchar(50)
     * 字段含义：任务角色
     */
    @Column(name = "qita", length = 50)
    private String qita;

    /**
     * 字段名：beizhu
     * 字段类型：nvarchar(50)
     * 字段含义：备注
     */
    @Column(name = "beizhu", length = 50)
    private String beizhu;

    /**
     * 字段名：lunwenzhonglei
     * 字段类型：nvarchar(50)
     * 字段含义：论文种类
     */
    @Column(name = "lunwenzhonglei", length = 50)
    private String lunwenzhonglei;

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
