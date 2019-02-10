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
 * @create: 2019-02-01 23:22
 *
 * 表名：kechengjianshe
 * 表含义：课程建设
 **/

@Entity
@Table(name = "kechengjianshe")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Kechengjianshe implements Serializable {
    private static final long serialVersionUID = -3783971773574059445L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：renwujuese
     * 字段类型：nvarchar(50)
     * 字段含义：任务角色
     */
    @Column(name = "renwujuese",length = 50)
    private String renwujuese;

    /**
     * 字段名：chengdanrenwu
     * 字段类型：nvarchar(50)
     * 字段含义：承担任务
     */
    @Column(name = "chengdanrenwu",length = 50)
    private String chengdanrenwu;

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
