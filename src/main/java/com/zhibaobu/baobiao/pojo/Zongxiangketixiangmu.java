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
 * @create: 2019-02-02 16:18
 *
 * 表名：zongxiangketixiangmu
 * 表含义：纵向课题项目
 **/

@Entity
@Table(name = "zongxiangketixiangmu")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Zongxiangketixiangmu implements Serializable {
    private static final long serialVersionUID = 3807208570753898943L;

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
    @Column(name = "ketimingcheng",length = 50)
    private String ketimingcheng;

    /**
     * 字段名：ketilaiyuan
     * 字段类型：nvarchar(50)
     * 字段含义：课题来源
     */
    @Column(name = "ketilaiyuan",length = 50)
    private String ketilaiyuan;

    /**
     * 字段名：renwujuese
     * 字段类型：nvarchar(50)
     * 字段含义：任务角色
     */
    @Column(name = "renwujuese",length = 50)
    private String renwujuese;

    /**
     * 字段名：ketixingzhi
     * 字段类型：nvarchar(50)
     * 字段含义：课题性质
     */
    @Column(name = "ketixingzhi",length = 50)
    private String ketixingzhi;

    /**
     * 字段名：jingfeiedu
     * 字段类型：nvarchar(50)
     * 字段含义：经费额度
     */
    @Column(name = "jingfeiedu",length = 50)
    private String jingfeiedu;

    /**
     * 字段名：lixiangshijian
     * 字段类型：date
     * 字段含义：立项时间
     */
    @Column(name = "lixiangshijian")
    private Date lixiangshijian;

    /**
     * 字段名：yujijietushijian
     * 字段类型：date
     * 字段含义：预计结题时间
     */
    @Column(name = "yujijietushijian")
    private Date yujijietushijian;

    /**
     * 字段名：jietijielun
     * 字段类型：nvarchar(50)
     * 字段含义：结题结论
     */
    @Column(name = "jietijielun",length = 50)
    private String jietijielun;

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
     * 字段名：fufen
     * 字段类型：nvarchar(50)
     * 字段含义：赋分
     */
    @Column(name = "fufen",length = 50)
    private String fufen;

    /**
     * 字段名：gonghao
     * 字段类型：nvarchar(50)
     * 字段含义：工号
     */
    @Column(name = "gonghao",length = 50)
    private String gonghao;
}
