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
 * @create: 2019-03-04 19:26
 **/

@Entity
@Table(name = "fileInfo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class FileInfo implements Serializable {
    private static final long serialVersionUID = 5999419955631916314L;

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
     * 字段名：title
     * 字段类型：nvarchar(50)
     * 字段含义：标题
     */
    @Column(name = "title", length = 50)
    private String title;

    /**
     * 字段名：fileInfoName
     * 字段类型：nvarchar(50)
     * 字段含义：文件名字
     */
    @Column(name = "fileInfoName", length = 50)
    private String fileInfoName;

    /**
     * 字段名：time
     * 字段类型：date
     * 字段含义：申报具体时间
     */
    @Column(name = "time")
    private Date time;
}
