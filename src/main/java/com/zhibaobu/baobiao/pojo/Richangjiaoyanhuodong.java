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
 * @create: 2019-02-02 12:34
 *
 * 表名：richangjiaoyanhuodong
 * 表含义：日常教研活动
 **/

@Entity
@Table(name = "richangjiaoyanhuodong")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Richangjiaoyanhuodong implements Serializable {
    private static final long serialVersionUID = -3599627374950070198L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：xi_quexikoufen
     * 字段类型：nvarchar(50)
     * 字段含义：系缺席扣分
     */
    @Column(name = "xi_quexikoufen",length = 50)
    private String xi_quexikoufen;

    /**
     * 字段名：xi_chidaozaoatuikoufen
     * 字段类型：nvarchar(50)
     * 字段含义：系迟到早退扣分
     */
    @Column(name = "xi_chidaozaoatuikoufen",length = 50)
    private String xi_chidaozaoatuikoufen;

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
