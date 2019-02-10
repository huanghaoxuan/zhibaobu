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
 * @create: 2019-02-02 15:50
 *
 * 表名：super_manager
 * 表含义：超级管理员
 **/

@Entity
@Table(name = "super_manager")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Super_manager implements Serializable {
    private static final long serialVersionUID = 670187719266563308L;

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
    @Column(name = "gonghao",length = 50)
    private String gonghao;

    /**
     * 字段名：inkey
     * 字段类型：nvarchar(50)
     * 字段含义：密码
     */
    @Column(name = "inkey",length = 50)
    private String inkey;
}
