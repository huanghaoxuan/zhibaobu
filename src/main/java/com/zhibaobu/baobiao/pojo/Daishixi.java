package com.zhibaobu.baobiao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @program: baobiao
 * @description
 * @author: HuangHaoXuan
 * @create: 2019-02-01 14:47
 *
 * 表名：daishixi
 * 表含义：带实习
 **/

@Entity
@Table(name = "daishixi")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Daishixi implements Serializable {
    private static final long serialVersionUID = 1697072916253605659L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：shiximingcheng
     * 字段类型：nvarchar(50)
     * 字段含义：实习名称
     */
    @Column(name = "shiximingcheng", length = 50)
    private String shiximingcheng;

    /**
     * 字段名：xuefen
     * 字段类型：decimal
     * 字段含义：学分
     */
    @Column(name = "xuefen")
    private BigDecimal xuefen;

    /**
     * 字段名：shichang
     * 字段类型：nvarchar(50)
     * 字段含义：时长
     */
    @Column(name = "shichang", length = 50)
    private String shichang;

    /**
     * 字段名：xueshengrenshu
     * 字段类型：smallint
     * 字段含义：学生人数
     */
    @Column(name = "xueshengrenshu")
    private Integer xueshengrenshu;

    /**
     * 字段名：xunhuancishu
     * 字段类型：smallint
     * 字段含义：循环次数
     */
    @Column(name = "xunhuancishu")
    private Integer xunhuancishu;

    /**
     * 字段名：zhidaoneirong
     * 字段类型：nvarchar(50)
     * 字段含义：指导内容
     */
    @Column(name = "zhidaoneirong", length = 50)
    private String zhidaoneirong;

    /**
     * 字段名：shixibaogao
     * 字段类型：nchar
     * 字段含义：实习报告
     */
    @Column(name = "shixibaogao")
    private String shixibaogao;

    /**
     * 字段名：shifoupigai
     * 字段类型：nchar
     * 字段含义：是否批改
     */
    @Column(name = "shifoupigai")
    private String shifoupigai;

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
