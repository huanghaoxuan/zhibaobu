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
 * @create: 2019-02-01 19:28
 *
 * 表名：jbqk
 * 表含义：教师，系部级管理员，超级管理员的基本信息
 **/

@Entity
@Table(name = "jbqk")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Jbqk implements Serializable {
    private static final long serialVersionUID = 7241178439926987283L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：xingming
     * 字段类型：nvarchar(50)
     * 字段含义：姓名
     */
    @Column(name = "xingming", length = 50)
    private String xingming;

    /**
     * 字段名：xingbie
     * 字段类型：nvarchar(50)
     * 字段含义：性别
     */
    @Column(name = "xingbie", length = 50)
    private String xingbie;

    /**
     * 字段名：chushengnianyue
     * 字段类型：date
     * 字段含义：出生年月
     */
    @Column(name = "chushengnianyue")
    private Date chushengnianyue;

    /**
     * 字段名：xueli
     * 字段类型：nvarchar(50)
     * 字段含义：学历
     */
    @Column(name = "xueli", length = 50)
    private String xueli;

    /**
     * 字段名：xuewei
     * 字段类型：nvarchar(50)
     * 字段含义：学位
     */
    @Column(name = "xuewei", length = 50)
    private String xuewei;

    /**
     * 字段名：zhicheng
     * 字段类型：nvarchar(50)
     * 字段含义：职称
     */
    @Column(name = "zhicheng", length = 50)
    private String zhicheng;

    /**
     * 字段名：zhiwu
     * 字段类型：nvarchar(50)
     * 字段含义：职务
     */
    @Column(name = "zhiwu", length = 50)
    private String zhiwu;

    /**
     * 字段名：zhengzhimianmao
     * 字段类型：nvarchar(50)
     * 字段含义：政治面貌
     */
    @Column(name = "zhengzhimianmao", length = 50)
    private String zhengzhimianmao;

    /**
     * 字段名：qiandinghetongqingkuang
     * 字段类型：nvarchar(50)
     * 字段含义：签订合同情况
     */
    @Column(name = "qiandinghetongqingkuang", length = 50)
    private String qiandinghetongqingkuang;

    /**
     * 字段名：gonghao
     * 字段类型：nvarchar(50)
     * 字段含义：工号
     */
    @Column(name = "gonghao", length = 50)
    private String gonghao;

    /**
     * 字段名：suozaixibu
     * 字段类型：nvarchar(50)
     * 字段含义：所在系部
     */
    @Column(name = "suozaixibu", length = 50)
    private String suozaixibu;

    /**
     * 字段名：jinxiaoshijian
     * 字段类型：date
     * 字段含义：进校时间
     */
    @Column(name = "jinxiaoshijian")
    private Date jinxiaoshijian;

    /**
     * 字段名：gaoxiaogongling
     * 字段类型：nvarchar(50)
     * 字段含义：高校工龄
     */
    @Column(name = "gaoxiaogongling", length = 50)
    private String gaoxiaogongling;

    /**
     * 字段名：benkebiyexuexiao
     * 字段类型：nvarchar(50)
     * 字段含义：本科毕业学校
     */
    @Column(name = "benkebiyexuexiao", length = 50)
    private String benkebiyexuexiao;

    /**
     * 字段名：huodezuigaoxuelideyuanxiaohuojigou
     * 字段类型：nvarchar(50)
     * 字段含义：获得最高学历的院校或机构
     */
    @Column(name = "huodezuigaoxuelideyuanxiaohuojigou", length = 50)
    private String huodezuigaoxuelideyuanxiaohuojigou;

    /**
     * 字段名：huodezuigaoxueweideyuanxiaohuojigou
     * 字段类型：nvarchar(50)
     * 字段含义：获得最高学位的院校或机构
     */
    @Column(name = "huodezuigaoxueweideyuanxiaohuojigou", length = 50)
    private String huodezuigaoxueweideyuanxiaohuojigou;

    /**
     * 字段名：gongchengshijianjingli
     * 字段类型：nvarchar(50)
     * 字段含义：工程实践经历
     */
    @Column(name = "gongchengshijianjingli", length = 50)
    private String gongchengshijianjingli;

    /**
     * 字段名：beizhu
     * 字段类型：nvarchar(50)
     * 字段含义：备注
     */
    @Column(name = "beizhu", length = 50)
    private String beizhu;

    /**
     * 字段名：IDcardNumber
     * 字段类型：nvarchar(50)
     * 字段含义：身份证号
     */
    @Column(name = "IDcardNumber", length = 50)
    private String IDcardNumber;

    /**
     * 字段名：shenbaoxueke
     * 字段类型：nvarchar(50)
     * 字段含义：申报学科
     */
    @Column(name = "shenbaoxueke", length = 50)
    private String shenbaoxueke;

    /**
     * 字段名：nibaozhicheng
     * 字段类型：nvarchar(50)
     * 字段含义：拟报职称
     */
    @Column(name = "nibaozhicheng", length = 50)
    private String nibaozhicheng;

    /**
     * 字段名：suoxuezhuanye
     * 字段类型：nvarchar(50)
     * 字段含义：所学专业
     */
    @Column(name = "suoxuezhuanye", length = 50)
    private String suoxuezhuanye;

    /**
     * 字段名：gongzuoshijian
     * 字段类型：nvarchar(50)
     * 字段含义：工作时间
     */
    @Column(name = "gongzuoshijian", length = 50)
    private String gongzuoshijian;

    /**
     * 字段名：jiaoshizigezheng
     * 字段类型：nvarchar(50)
     * 字段含义：教师资格证
     */
    @Column(name = "jiaoshizigezheng", length = 50)
    private String jiaoshizigezheng;

    /**
     * 字段名：gangqianpeixun
     * 字段类型：nvarchar(50)
     * 字段含义：岗前培训
     */
    @Column(name = "gangqianpeixun", length = 50)
    private String gangqianpeixun;

    /**
     * 字段名：putonghuakaoshi
     * 字段类型：nvarchar(50)
     * 字段含义：普通话考试
     */
    @Column(name = "putonghuakaoshi", length = 50)
    private String putonghuakaoshi;

    /**
     * 字段名：zuigaoxuelixueweiqudeshijian
     * 字段类型：nvarchar(50)
     * 字段含义：最高学历学位取得时间
     */
    @Column(name = "zuigaoxuelixueweiqudeshijian", length = 50)
    private String zuigaoxuelixueweiqudeshijian;

    /**
     * 字段名：xianzhuanyejishuzhiwu
     * 字段类型：nvarchar(50)
     * 字段含义：现专业技术职务
     */
    @Column(name = "xianzhuanyejishuzhiwu", length = 50)
    private String xianzhuanyejishuzhiwu;

    /**
     * 字段名：xianzhuanyejishuzhiwuqudeshijian
     * 字段类型：date
     * 字段含义：现专业技术职务取得时间
     */
    @Column(name = "xianzhuanyejishuzhiwuqudeshijian")
    private Date xianzhuanyejishuzhiwuqudeshijian;

    /**
     * 字段名：xiancongshizhuanyeyanjiufangxiang
     * 字段类型：nvarchar(50)
     * 字段含义：现从事专业研究方向
     */
    @Column(name = "xiancongshizhuanyeyanjiufangxiang", length = 50)
    private String xiancongshizhuanyeyanjiufangxiang;

    /**
     * 字段名：xiancongshizhuanyeyanjiufangxiangnianxian
     * 字段类型：int
     * 字段含义：现从事专业研究方向年限
     */
    @Column(name = "xiancongshizhuanyeyanjiufangxiangnianxian")
    private Integer xiancongshizhuanyeyanjiufangxiangnianxian;

    /**
     * 字段名：shenheqingkuang
     * 字段类型：nvarchar(50)
     * 字段含义：审核情况
     */
    @Column(name = "shenheqingkuang", length = 50)
    private String shenheqingkuang;

    /**
     * 字段名：jixujiaoyuqingkuang
     * 字段类型：nvarchar(50)
     * 字段含义：继续教育情况
     */
    @Column(name = "jixujiaoyuqingkuang", length = 50)
    private String jixujiaoyuqingkuang;
}
