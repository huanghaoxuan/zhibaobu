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
 * @create: 2019-02-02 12:19
 *
 * 表名：niandukaoheqingkuang
 * 表含义：年度考额情况
 **/

@Entity
@Table(name = "niandukaoheqingkuang")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Niandukaoheqingkuang implements Serializable {
    private static final long serialVersionUID = -2526314270362901681L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：xuenian
     * 字段类型：nvarchar(50)
     * 字段含义：学年
     */
    @Column(name = "xuenian",length = 50)
    private String xuenian;

    /**
     * 字段名：niandukaoheqingkuang
     * 字段类型：nvarchar(50)
     * 字段含义：年度考核情况
     */
    @Column(name = "niandukaoheqingkuang",length = 50)
    private String niandukaoheqingkuang;

    /**
     * 字段名：gonghao
     * 字段类型：nvarchar(50)
     * 字段含义：工号
     */
    @Column(name = "gonghao",length = 50)
    private String gonghao;

    /**
     * 字段名：shenheqingkuang
     * 字段类型：nvarchar(50)
     * 字段含义：审核情况
     */
    @Column(name = "shenheqingkuang",length = 50)
    private String shenheqingkuang;

    /**
     * 字段名：beizhu
     * 字段类型：nvarchar(50)
     * 字段含义：备注
     */
    @Column(name = "beizhu",length = 50)
    private String beizhu;
}
