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
 * @create: 2019-02-02 13:22
 *
 * 表名：shiyanshijianshe
 * 表含义：实验室建设
 **/

@Entity
@Table(name = "shiyanshijianshe")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Shiyanshijianshe implements Serializable {
    private static final long serialVersionUID = 2963391461134225879L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：renwujuese
     * 字段类型：nvarchar(50)
     * 字段含义：任务角色
     */
    @Column(name = "renwujuese",length = 50)
    private String renwujuese;

    /**
     * 字段名：benrengongxian
     * 字段类型：nvarchar(50)
     * 字段含义：本人贡献
     */
    @Column(name = "benrengongxian",length = 50)
    private String benrengongxian;

    /**
     * 字段名：kaifashiyanxiangmumingcheng
     * 字段类型：nvarchar(50)
     * 字段含义：开发实验项目名称
     */
    @Column(name = "kaifashiyanxiangmumingcheng",length = 50)
    private String kaifashiyanxiangmumingcheng;

    /**
     * 字段名：duiyingxueshi
     * 字段类型：nvarchar(50)
     * 字段含义：对应学时
     */
    @Column(name = "duiyingxueshi",length = 50)
    private String duiyingxueshi;

    /**
     * 字段名：shouyirenshu
     * 字段类型：nvarchar(50)
     * 字段含义：受益人数
     */
    @Column(name = "shouyirenshu",length = 50)
    private String shouyirenshu;

    /**
     * 字段名：shiyongzhuanyenianji
     * 字段类型：nvarchar(50)
     * 字段含义：使用专业年级
     */
    @Column(name = "shiyongzhuanyenianji",length = 50)
    private String shiyongzhuanyenianji;

    /**
     * 字段名：zizhizhuangzhimingcheng
     * 字段类型：nvarchar(50)
     * 字段含义：资质专职名称
     */
    @Column(name = "zizhizhuangzhimingcheng",length = 50)
    private String zizhizhuangzhimingcheng;

    /**
     * 字段名：gaizhizhuangzhimingcheng
     * 字段类型：nvarchar(50)
     * 字段含义：改制专职名称
     */
    @Column(name = "gaizhizhuangzhimingcheng",length = 50)
    private String gaizhizhuangzhimingcheng;

    /**
     * 字段名：jieshengjingfeishu
     * 字段类型：nvarchar(50)
     * 字段含义：节省经费数
     */
    @Column(name = "jieshengjingfeishu",length = 50)
    private String jieshengjingfeishu;

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
