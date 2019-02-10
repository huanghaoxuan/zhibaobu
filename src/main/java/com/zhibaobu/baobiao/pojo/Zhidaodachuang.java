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
 * @create: 2019-02-02 16:02
 *
 * 表名：zhidaodachuang
 * 表含义：指导大创
 **/

@Entity
@Table(name = "zhidaodachuang")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Zhidaodachuang implements Serializable {
    private static final long serialVersionUID = -5245350659551119530L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：xiangmumingcheng
     * 字段类型：nvarchar(50)
     * 字段含义：项目名称
     */
    @Column(name = "xiangmumingcheng",length = 50)
    private String xiangmumingcheng;

    /**
     * 字段名：xiangmujibie
     * 字段类型：nvarchar(50)
     * 字段含义：项目级别
     */
    @Column(name = "xiangmujibie",length = 50)
    private String xiangmujibie;

    /**
     * 字段名：xuantilaiyuan
     * 字段类型：nvarchar(50)
     * 字段含义：选题来源
     */
    @Column(name = "xuantilaiyuan",length = 50)
    private String xuantilaiyuan;

    /**
     * 字段名：xiangmuzhuangkuang
     * 字段类型：nvarchar(50)
     * 字段含义：项目状况
     */
    @Column(name = "xiangmuzhuangkuang",length = 50)
    private String xiangmuzhuangkuang;

    /**
     * 字段名：jietidengji
     * 字段类型：nvarchar(50)
     * 字段含义：结题等级
     */
    @Column(name = "jietidengji",length = 50)
    private String jietidengji;

    /**
     * 字段名：xueshengnianji
     * 字段类型：nvarchar(50)
     * 字段含义：学生年级
     */
    @Column(name = "xueshengnianji",length = 50)
    private String xueshengnianji;

    /**
     * 字段名：xiangmuyingxiang
     * 字段类型：nvarchar(50)
     * 字段含义：项目影响
     */
    @Column(name = "xiangmuyingxiang",length = 50)
    private String xiangmuyingxiang;

    /**
     * 字段名：beizhu
     * 字段类型：nvarchar(50)
     * 字段含义：备注
     */
    @Column(name = "beizhu",length = 50)
    private String beizhu;

    /**
     * 字段名：xueshengrenshu
     * 字段类型：nvarchar(50)
     * 字段含义：学生人数
     */
    @Column(name = "xueshengrenshu",length = 50)
    private String xueshengrenshu;

    /**
     * 字段名：zhidaojiaoshirenshu
     * 字段类型：nvarchar(50)
     * 字段含义：指导教师人数
     */
    @Column(name = "zhidaojiaoshirenshu",length = 50)
    private String zhidaojiaoshirenshu;

    /**
     * 字段名：zhidaojiaoshijibie
     * 字段类型：nvarchar(50)
     * 字段含义：指导教师级别
     */
    @Column(name = "zhidaojiaoshijibie",length = 50)
    private String zhidaojiaoshijibie;

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
