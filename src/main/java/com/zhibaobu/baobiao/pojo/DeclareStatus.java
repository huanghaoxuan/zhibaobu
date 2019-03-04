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
 * @description 申报状态描述
 * @author: HuangHaoXuan
 * @create: 2019-03-03 00:18
 **/
@Entity
@Table(name = "declareStatus")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class DeclareStatus implements Serializable {

    private static final long serialVersionUID = 8276478635303293758L;
    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：gonghao
     * 字段类型：nvarchar(50)
     * 字段含义：工号
     */
    @Column(name = "gonghao", length = 50)
    private String gonghao;

    /**
     * 字段名：xingming
     * 字段类型：nvarchar(50)
     * 字段含义：姓名
     */
    @Column(name = "xingming", length = 50)
    private String xingming;

    /**
     * 字段名：xuekeID
     * 字段类型：nvarchar(50)
     * 字段含义：学科ID
     */
    @Column(name = "xuekeID", length = 50)
    private String xuekeID;

    /**
     * 字段名：xuekeName
     * 字段类型：nvarchar(50)
     * 字段含义：学科名字
     */
    @Column(name = "xuekeName", length = 50)
    private String xuekeName;

    /**
     * 字段名：zhicheng
     * 字段类型：nvarchar(50)
     * 字段含义：职称
     */
    @Column(name = "zhicheng", length = 50)
    private String zhicheng;

    /**
     * 字段名：status
     * 字段类型：nvarchar(50)
     * 字段含义：是否已申报
     */
    @Column(name = "status", length = 50)
    private String status;

    /**
     * 字段名：time
     * 字段类型：date
     * 字段含义：申报具体时间
     */
    @Column(name = "time")
    private Date time;

    /**
     * 字段名：year
     * 字段类型：nvarchar(50)
     * 字段含义：申报学年
     */
    @Column(name = "year", length = 50)
    private String year;
}
