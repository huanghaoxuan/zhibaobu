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
 * @create: 2019-02-01 23:16
 *
 * 表名：jiuye
 * 表含义：就业
 **/

@Entity
@Table(name = "jiuye")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Jiuye implements Serializable {
    private static final long serialVersionUID = 3585104735509775147L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：zhijietuijianjiuyerenshu
     * 字段类型：int
     * 字段含义：直接推荐就业人数
     */
    @Column(name = "zhijietuijianjiuyerenshu")
    private Integer zhijietuijianjiuyerenshu;

    /**
     * 字段名：bangzhulianxijiuye
     * 字段类型：int
     * 字段含义：帮助联系就业
     */
    @Column(name = "bangzhulianxijiuye")
    private Integer bangzhulianxijiuye;

    /**
     * 字段名：canyujiuyezhidao
     * 字段类型：int
     * 字段含义：参与就业指导
     */
    @Column(name = "canyujiuyezhidao")
    private Integer canyujiuyezhidao;

    /**
     * 字段名：fudaokaoyankecheng
     * 字段类型：int
     * 字段含义：辅导考研课程
     */
    @Column(name = "fudaokaoyankecheng")
    private Integer fudaokaoyankecheng;

    /**
     * 字段名：bangzhukaoyanluqu
     * 字段类型：int
     * 字段含义：帮助考研录取
     */
    @Column(name = "bangzhukaoyanluqu")
    private Integer bangzhukaoyanluqu;

    /**
     * 字段名：zhidaoxueshengchenggongchuangye
     * 字段类型：int
     * 字段含义：指导学生成功创业
     */
    @Column(name = "zhidaoxueshengchenggongchuangye")
    private Integer zhidaoxueshengchenggongchuangye;

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
