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
 * @create: 2019-02-02 12:30
 *
 * 表名：renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang
 * 表含义：任职以来所带已毕业班就业率考研率违纪率情况
 **/

@Entity
@Table(name = "renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Renzhiyilaisuodaiyibiyebanjiuyelvkaoyanlvweijilvqingkuang implements Serializable {
    private static final long serialVersionUID = 6876412261023866104L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：banjimingcheng
     * 字段类型：nvarchar(50)
     * 字段含义：班级名称
     */
    @Column(name = "banjimingcheng",length = 50)
    private String banjimingcheng;

    /**
     * 字段名：jiuyelv
     * 字段类型：nvarchar(50)
     * 字段含义：就业率
     */
    @Column(name = "jiuyelv",length = 50)
    private String jiuyelv;

    /**
     * 字段名：kaoyanlv
     * 字段类型：nvarchar(50)
     * 字段含义：考研率
     */
    @Column(name = "kaoyanlv",length = 50)
    private String kaoyanlv;

    /**
     * 字段名：weijilv
     * 字段类型：nvarchar(50)
     * 字段含义：违纪率
     */
    @Column(name = "weijilv",length = 50)
    private String weijilv;

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
     * 字段名：gonghao
     * 字段类型：nvarchar(50)
     * 字段含义：工号
     */
    @Column(name = "gonghao",length = 50)
    private String gonghao;

    /**
     * 字段名：shenheqingkuang
     * 字段类型：nvarchar(50)
     * 字段含义：审核情况
     */
    @Column(name = "shenheqingkuang",length = 50)
    private String shenheqingkuang;
}
