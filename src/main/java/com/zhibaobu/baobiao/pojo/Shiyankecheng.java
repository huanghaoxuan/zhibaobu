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
 * @create: 2019-02-02 12:55
 *
 * 表名：shiyankecheng
 * 表含义：实验课程
 **/

@Entity
@Table(name = "shiyankecheng")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Shiyankecheng implements Serializable {
    private static final long serialVersionUID = -2796187140330649912L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：shiyankechengmingcheng
     * 字段类型：nvarchar(50)
     * 字段含义：实验课程名称
     */
    @Column(name = "shiyankechengmingcheng",length = 50)
    private String shiyankechengmingcheng;

    /**
     * 字段名：juese
     * 字段类型：nvarchar(50)
     * 字段含义：角色
     */
    @Column(name = "juese",length = 50)
    private String juese;

    /**
     * 字段名：zongshishu
     * 字段类型：nvarchar(50)
     * 字段含义：总时数
     */
    @Column(name = "zongshishu",length = 50)
    private String zongshishu;

    /**
     * 字段名：zhoushishu
     * 字段类型：nvarchar(50)
     * 字段含义：周时数
     */
    @Column(name = "zhoushishu",length = 50)
    private String zhoushishu;

    /**
     * 字段名：xueshengrenshu
     * 字段类型：smallint
     * 字段含义：学生人数
     */
    @Column(name = "xueshengrenshu")
    private Integer xueshengrenshu;

    /**
     * 字段名：pingxingbangeshu
     * 字段类型：tinyint
     * 字段含义：平行班个数
     */
    @Column(name = "pingxingbangeshu")
    private Short pingxingbangeshu;

    /**
     * 字段名：meibanfenzucishu
     * 字段类型：tinyint
     * 字段含义：每班分组次数
     */
    @Column(name = "meibanfenzucishu")
    private Short meibanfenzucishu;

    /**
     * 字段名：zhidaojiaoshirenshu
     * 字段类型：tinyint
     * 字段含义：指导教师人数
     */
    @Column(name = "zhidaojiaoshirenshu")
    private Short zhidaojiaoshirenshu;

    /**
     * 字段名：shiyanleixing
     * 字段类型：nvarchar(50)
     * 字段含义：实验类型
     */
    @Column(name = "shiyanleixing",length = 50)
    private String shiyanleixing;

    /**
     * 字段名：shiyanbaogaocishu
     * 字段类型：tinyint
     * 字段含义：实验报告次数
     */
    @Column(name = "shiyanbaogaocishu")
    private Short shiyanbaogaocishu;

    /**
     * 字段名：pigaicishu
     * 字段类型：tinyint
     * 字段含义：批改次数
     */
    @Column(name = "pigaicishu")
    private Short pigaicishu;

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
