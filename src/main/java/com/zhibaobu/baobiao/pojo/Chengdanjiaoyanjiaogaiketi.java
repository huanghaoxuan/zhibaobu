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
 * @create: 2019-02-01 14:17
 *
 * 表名：chengdanjiaoyanjiaogaiketi
 * 表含义：承担教研教改课题
 **/

@Entity
@Table(name = "chengdanjiaoyanjiaogaiketi")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Chengdanjiaoyanjiaogaiketi implements Serializable {
    private static final long serialVersionUID = 66527896309283251L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：ketimingcheng
     * 字段类型：nvarchar(50)
     * 字段含义：课题名称
     */
    @Column(name = "ketimingcheng", length = 50)
    private String ketimingcheng;

    /**
     * 字段名：ketilaiyuan
     * 字段类型：nvarchar(50)
     * 字段含义：课题来源
     */
    @Column(name = "ketilaiyuan", length = 50)
    private String ketilaiyuan;

    /**
     * 字段名：renwujuese
     * 字段类型：nvarchar(50)
     * 字段含义：任务角色
     */
    @Column(name = "renwujuese", length = 50)
    private String renwujuese;

    /**
     * 字段名：ketixingzhi
     * 字段类型：nvarchar(50)
     * 字段含义：课题性质
     */
    @Column(name = "ketixingzhi", length = 50)
    private String ketixingzhi;

    /**
     * 字段名：xiangmuzhuangkuang
     * 字段类型：nvarchar(50)
     * 字段含义：项目状况
     */
    @Column(name = "xiangmuzhuangkuang", length = 50)
    private String xiangmuzhuangkuang;

    /**
     * 字段名：lixiangshijian
     * 字段类型：date
     * 字段含义：立项时间
     */
    @Column(name = "lixiangshijian")
    private Date lixiangshijian;

    /**
     * 字段名：jietishijian
     * 字段类型：date
     * 字段含义：结题时间
     */
    @Column(name = "jietishijian")
    private Date jietishijian;

    /**
     * 字段名：xiangmuzhiliang
     * 字段类型：nvarchar(50)
     * 字段含义：项目质量
     */
    @Column(name = "xiangmuzhiliang", length = 50)
    private String xiangmuzhiliang;

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

    /**
     * 字段名：fufen
     * 字段类型：nvarchar(50)
     * 字段含义：赋分
     */
    @Column(name = "fufen", length = 50)
    private String fufen;
}
