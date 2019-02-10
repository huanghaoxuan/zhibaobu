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
 * @create: 2019-02-02 12:45
 *
 * 表名：shenqingzhuanli
 * 表含义：申请专利
 **/

@Entity
@Table(name = "shenqingzhuanli")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Shenqingzhuanli implements Serializable {
    private static final long serialVersionUID = 3189703080924546511L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：zhuanlimingcheng
     * 字段类型：nvarchar(50)
     * 字段含义：专利名称
     */
    @Column(name = "zhuanlimingcheng",length = 50)
    private String zhuanlimingcheng;

    /**
     * 字段名：zhuanlileixing
     * 字段类型：nvarchar(50)
     * 字段含义：专利类型
     */
    @Column(name = "zhuanlileixing",length = 50)
    private String zhuanlileixing;

    /**
     * 字段名：shenqingshijian
     * 字段类型：date
     * 字段含义：申请时间
     */
    @Column(name = "shenqingshijian")
    private Date shenqingshijian;

    /**
     * 字段名：shifoushouli
     * 字段类型：nvarchar(50)
     * 字段含义：是否受理
     */
    @Column(name = "shifoushouli",length = 50)
    private String shifoushouli;

    /**
     * 字段名：shifouhuoshouquan
     * 字段类型：nvarchar(50)
     * 字段含义：是否授权
     */
    @Column(name = "shifouhuoshouquan",length = 50)
    private String shifouhuoshouquan;

    /**
     * 字段名：shifouhuozhuanhua
     * 字段类型：nvarchar(50)
     * 字段含义：是否或转化
     */
    @Column(name = "shifouhuozhuanhua",length = 50)
    private String shifouhuozhuanhua;

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
