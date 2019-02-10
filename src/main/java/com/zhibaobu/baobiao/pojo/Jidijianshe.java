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
 * @create: 2019-02-01 23:09
 *
 * 表名：jidijianshe
 * 表含义：基地建设
 **/

@Entity
@Table(name = "jidijianshe")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Jidijianshe implements Serializable {
    private static final long serialVersionUID = 480781421264439877L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：jidimingcheng
     * 字段类型：nvarchar(50)
     * 字段含义：基地名称
     */
    @Column(name = "jidimingcheng", length = 50)
    private String jidimingcheng;

    /**
     * 字段名：kejienarenshu
     * 字段类型：smallint
     * 字段含义：可接纳人数
     */
    @Column(name = "kejienarenshu")
    private Integer kejienarenshu;

    /**
     * 字段名：shijijienarenshu
     * 字段类型：smallint
     * 字段含义：实际接纳人数
     */
    @Column(name = "shijijienarenshu")
    private Integer shijijienarenshu;

    /**
     * 字段名：youwuxieyi
     * 字段类型：nchar
     * 字段含义：有无协议
     */
    @Column(name = "youwuxieyi")
    private String youwuxieyi;

    /**
     * 字段名：zhuyaogongzuo
     * 字段类型：nvarchar(50)
     * 字段含义：主要工作
     */
    @Column(name = "zhuyaogongzuo", length = 50)
    private String zhuyaogongzuo;

    /**
     * 字段名：beizhu
     * 字段类型：nvarchar(50)
     * 字段含义：备注
     */
    @Column(name = "beizhu", length = 50)
    private String beizhu;
}
