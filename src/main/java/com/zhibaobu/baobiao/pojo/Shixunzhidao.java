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
 * @create: 2019-02-02 12:50
 *
 * 表名：shixunzhidao
 * 表含义：实训指导
 **/

@Entity
@Table(name = "shixunzhidao")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Shixunzhidao implements Serializable {
    private static final long serialVersionUID = 2098885139307727537L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：shixunxiangmumingcheng
     * 字段类型：nvarchar(50)
     * 字段含义：实训项目名称
     */
    @Column(name = "shixunxiangmumingcheng",length = 50)
    private String shixunxiangmumingcheng;

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
     * 字段含义：实创
     */
    @Column(name = "shichang",length = 50)
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
     * 字段名：shixunleixing
     * 字段类型：nvarchar(50)
     * 字段含义：实训类型
     */
    @Column(name = "shixunleixing",length = 50)
    private String shixunleixing;

    /**
     * 字段名：chengguoxingshi
     * 字段类型：nvarchar(50)
     * 字段含义：成功形式
     */
    @Column(name = "chengguoxingshi",length = 50)
    private String chengguoxingshi;

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
