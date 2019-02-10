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
 * @create: 2019-02-01 18:22
 *
 * 表名：hengxiangketixiangmu
 * 表含义：横向课题项目
 **/

@Entity
@Table(name = "hengxiangketixiangmu")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Hengxiangketixiangmu implements Serializable {
    private static final long serialVersionUID = 1359378746249528228L;

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
    @Column(name = "xiangmumingcheng", length = 50)
    private String xiangmumingcheng;

    /**
     * 字段名：xiangmulaiyuan
     * 字段类型：nvarchar(50)
     * 字段含义：项目来源
     */
    @Column(name = "xiangmulaiyuan", length = 50)
    private String xiangmulaiyuan;

    /**
     * 字段名：xiangmujingfei
     * 字段类型：nvarchar(50)
     * 字段含义：项目经费
     */
    @Column(name = "xiangmujingfei", length = 50)
    private String xiangmujingfei;

    /**
     * 字段名：renwujuese
     * 字段类型：nvarchar(50)
     * 字段含义：任务角色
     */
    @Column(name = "renwujuese", length = 50)
    private String renwujuese;

    /**
     * 字段名：lixiangshijian
     * 字段类型：date
     * 字段含义：立项时间
     */
    @Column(name = "lixiangshijian")
    private Date lixiangshijian;

    /**
     * 字段名：yujijietishijian
     * 字段类型：date
     * 字段含义：预计结题时间
     */
    @Column(name = "yujijietishijian")
    private Date yujijietishijian;

    /**
     * 字段名：jietijielun
     * 字段类型：nvarchar(50)
     * 字段含义：结题结论
     */
    @Column(name = "jietijielun", length = 50)
    private String jietijielun;

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
     * 字段名：fufen
     * 字段类型：nvarchar(50)
     * 字段含义：赋分
     */
    @Column(name = "fufen", length = 50)
    private String fufen;

    /**
     * 字段名：gonghao
     * 字段类型：nvarchar(50)
     * 字段含义：工号
     */
    @Column(name = "gonghao", length = 50)
    private String gonghao;
}
