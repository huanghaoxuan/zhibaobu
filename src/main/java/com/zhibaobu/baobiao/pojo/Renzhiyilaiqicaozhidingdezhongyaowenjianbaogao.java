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
 * @create: 2019-02-02 12:24
 *
 * 表名：renzhiyilaiqicaozhidingdezhongyaowenjianbaogao
 * 表含义：任职以来起草制定的重要文件报告
 **/

@Entity
@Table(name = "renzhiyilaiqicaozhidingdezhongyaowenjianbaogao")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Renzhiyilaiqicaozhidingdezhongyaowenjianbaogao implements Serializable {
    private static final long serialVersionUID = 8617595485058533379L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：wenjianbaogaotimu
     * 字段类型：nvarchar(50)
     * 字段含义：文件报告题目
     */
    @Column(name = "wenjianbaogaotimu",length = 50)
    private String wenjianbaogaotimu;

    /**
     * 字段名：shijian
     * 字段类型：date
     * 字段含义：时间
     */
    @Column(name = "shijian")
    private Date shijian;

    /**
     * 字段名：paiming
     * 字段类型：int
     * 字段含义：排名
     */
    @Column(name = "paiming")
    private Integer paiming;

    /**
     * 字段名：zongrenshu
     * 字段类型：int
     * 字段含义：总人数
     */
    @Column(name = "zongrenshu")
    private Integer zongrenshu;

    /**
     * 字段名：shiyongfanweijichanshengxiaoyii
     * 字段类型：nvarchar(50)
     * 字段含义：适用范围及产生效益
     */
    @Column(name = "shiyongfanweijichanshengxiaoyii",length = 50)
    private String shiyongfanweijichanshengxiaoyii;

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
