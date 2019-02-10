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
 * @create: 2019-02-01 22:48
 *
 * 表名：jiaocaijianshe
 * 表含义：教材建设
 **/

@Entity
@Table(name = "jiaocaijianshe")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Jiaocaijianshe implements Serializable {
    private static final long serialVersionUID = -7093021292115291841L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：jiaocaimingcheng
     * 字段类型：nvarchar(50)
     * 字段含义：教材名称
     */
    @Column(name = "jiaocaimingcheng", length = 50)
    private String jiaocaimingcheng;

    /**
     * 字段名：chubanshe
     * 字段类型：nvarchar(50)
     * 字段含义：出版社
     */
    @Column(name = "chubanshe", length = 50)
    private String chubanshe;

    /**
     * 字段名：chubanshijian
     * 字段类型：date
     * 字段含义：出版时间
     */
    @Column(name = "chubanshijian")
    private Date chubanshijian;

    /**
     * 字段名：jiaocaizishu
     * 字段类型：nvarchar(50)
     * 字段含义：教材字数
     */
    @Column(name = "jiaocaizishu", length = 50)
    private String jiaocaizishu;

    /**
     * 字段名：benrengongxian
     * 字段类型：nvarchar(50)
     * 字段含义：本人贡献
     */
    @Column(name = "benrengongxian", length = 50)
    private String benrengongxian;

    /**
     * 字段名：shifou
     * 字段类型：nvarchar(50)
     * 字段含义：是否
     */
    @Column(name = "shifou", length = 50)
    private String shifou;

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
     * 字段名：fufen
     * 字段类型：nvarchar(50)
     * 字段含义：赋分
     */
    @Column(name = "fufen", length = 50)
    private String fufen;

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
