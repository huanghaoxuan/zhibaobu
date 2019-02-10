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
 * @create: 2019-02-01 23:01
 *
 * 表名：jiaoxuexiaoguo
 * 表含义：教学效果
 **/

@Entity
@Table(name = "jiaoxuexiaoguo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Jiaoxuexiaoguo implements Serializable {
    private static final long serialVersionUID = -7585957444693237532L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：xueshengpingjiao
     * 字段类型：nvarchar(50)
     * 字段含义：学生评价
     */
    @Column(name = "xueshengpingjiao", length = 50)
    private String xueshengpingjiao;

    /**
     * 字段名：dudaotingke
     * 字段类型：nvarchar(50)
     * 字段含义：督导听课
     */
    @Column(name = "dudaotingke", length = 50)
    private String dudaotingke;

    /**
     * 字段名：lingdaotingke
     * 字段类型：nvarchar(50)
     * 字段含义：领导听课
     */
    @Column(name = "lingdaotingke", length = 50)
    private String lingdaotingke;

    /**
     * 字段名：tonghangtingke
     * 字段类型：nvarchar(50)
     * 字段含义：同行听课
     */
    @Column(name = "tonghangtingke", length = 50)
    private String tonghangtingke;

    /**
     * 字段名：jiaoxuexiaoguojiafen
     * 字段类型：nvarchar(50)
     * 字段含义：教学效果加分
     */
    @Column(name = "jiaoxuexiaoguojiafen", length = 50)
    private String jiaoxuexiaoguojiafen;

    /**
     * 字字段名：qitazhongyaojianchajiafen
     * 字段类型：nvarchar(50)
     * 字段含义：其他重要监察加分
     */
    @Column(name = "qitazhongyaojianchajiafen", length = 50)
    private String qitazhongyaojianchajiafen;

    /**
     * 字段名：jiaoxueshiguanjibiekoufen
     * 字段类型：nvarchar(50)
     * 字段含义：教学事故按级别扣分
     */
    @Column(name = "jiaoxueshiguanjibiekoufen", length = 50)
    private String jiaoxueshiguanjibiekoufen;

    /**
     * 字段名：qitazhongyaojianchakoufen
     * 字段类型：nvarchar(50)
     * 字段含义：其他重要监察扣分
     */
    @Column(name = "qitazhongyaojianchakoufen", length = 50)
    private String qitazhongyaojianchakoufen;
}
