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
 * @create: 2019-02-01 23:27
 *
 * 表名：ketangjiaoxue
 * 表含义：课堂教学
 **/

@Entity
@Table(name = "ketangjiaoxue")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Ketangjiaoxue implements Serializable {
    private static final long serialVersionUID = -7643888241962303676L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：kechengmingcheng
     * 字段类型：nvarchar(50)
     * 字段含义：课程名称
     */
    @Column(name = "kechengmingcheng",length = 50)
    private String kechengmingcheng;

    /**
     * 字段名：kechengxingzhi
     * 字段类型：nvarchar(50)
     * 字段含义：课程性质
     */
    @Column(name = "kechengxingzhi",length = 50)
    private String kechengxingzhi;

    /**
     * 字段名：shoukexingshi
     * 字段类型：nvarchar(50)
     * 字段含义：授课形式
     */
    @Column(name = "shoukexingshi",length = 50)
    private String shoukexingshi;

    /**
     * 字段名：shifou
     * 字段类型：nvarchar(50)
     * 字段含义：是否
     */
    @Column(name = "shifou",length = 50)
    private String shifou;

    /**
     * 字字段名：xuefen
     * 字段类型：nvarchar(50)
     * 字段含义：学分
     */
    @Column(name = "xuefen",length = 50)
    private String xuefen;

    /**
     * 字段名：xueshi
     * 字段类型：nvarchar(50)
     * 字段含义：学时
     */
    @Column(name = "xueshi",length = 50)
    private String xueshi;

    /**
     * 字段名：shoukebangeshu
     * 字段类型：nvarchar(50)
     * 字段含义：授课班个数
     */
    @Column(name = "shoukebangeshu",length = 50)
    private String shoukebangeshu;

    /**
     * 字段名：pingxingbangeshu
     * 字段类型：nvarchar(50)
     * 字段含义：平行班个数
     */
    @Column(name = "pingxingbangeshu",length = 50)
    private String pingxingbangeshu;

    /**
     * 字段名：zuoyecishu
     * 字段类型：nvarchar(50)
     * 字段含义：作业次数
     */
    @Column(name = "zuoyecishu",length = 50)
    private String zuoyecishu;

    /**
     * 字段名：pigaicishu
     * 字段类型：nvarchar(50)
     * 字段含义：批改次数
     */
    @Column(name = "pigaicishu",length = 50)
    private String pigaicishu;

    /**
     * 字段名：dayicishu
     * 字段类型：nvarchar(50)
     * 字段含义：答疑次数
     */
    @Column(name = "dayicishu",length = 50)
    private String dayicishu;

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
