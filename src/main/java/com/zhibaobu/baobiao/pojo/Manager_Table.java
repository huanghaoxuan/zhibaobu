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
 * @create: 2019-02-01 23:42
 *
 * 表名：Manager_Table
 * 表含义：管理者赋分表
 **/

@Entity
@Table(name = "Manager_Table")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Manager_Table implements Serializable {
    private static final long serialVersionUID = 555377274161743894L;

    /**
     * 字段名：ID
     * 字段类型：int
     * 字段含义：主键，自增长标识id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//strategy=GenerationType.IDENTITY 自增长
    private Integer ID;

    /**
     * 字段名：goverAcc_National_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "goverAcc_National_1",length = 50)
    private String goverAcc_National_1;

    /**
     * 字段名：goverAcc_National_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "goverAcc_National_2",length = 50)
    private String goverAcc_National_2;

    /**
     * 字段名：goverAcc_National_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "goverAcc_National_3",length = 50)
    private String goverAcc_National_3;

    /**
     * 字段名：goverAcc_Province_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "goverAcc_Province_1",length = 50)
    private String goverAcc_Province_1;

    /**
     * 字段名：goverAcc_Province_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "goverAcc_Province_2",length = 50)
    private String goverAcc_Province_2;

    /**
     * 字段名：goverAcc_Province_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "goverAcc_Province_3",length = 50)
    private String goverAcc_Province_3;

    /**
     * 字段名：goverAcc_City_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "goverAcc_City_1",length = 50)
    private String goverAcc_City_1;

    /**
     * 字段名：goverAcc_City_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "goverAcc_City_2",length = 50)
    private String goverAcc_City_2;

    /**
     * 字段名：goverAcc_City_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "goverAcc_City_3",length = 50)
    private String goverAcc_City_3;

    /**
     * 字段名：goverAcc_college_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "goverAcc_college_1",length = 50)
    private String goverAcc_college_1;

    /**
     * 字段名：goverAcc_college_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "goverAcc_college_2",length = 50)
    private String goverAcc_college_2;

    /**
     * 字段名：goverAcc_college_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "goverAcc_college_3",length = 50)
    private String goverAcc_college_3;

    /**
     * 字段名：NgoverAcc_National_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "NgoverAcc_National_1",length = 50)
    private String NgoverAcc_National_1;

    /**
     * 字段名：NgoverAcc_National_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "NgoverAcc_National_2",length = 50)
    private String NgoverAcc_National_2;

    /**
     * 字段名：NgoverAcc_National_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "NgoverAcc_National_3",length = 50)
    private String NgoverAcc_National_3;

    /**
     * 字段名：NgoverAcc_Province_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "NgoverAcc_Province_1",length = 50)
    private String NgoverAcc_Province_1;

    /**
     * 字段名：NgoverAcc_Province_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "NgoverAcc_Province_2",length = 50)
    private String NgoverAcc_Province_2;

    /**
     * 字段名：NgoverAcc_Province_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "NgoverAcc_Province_3",length = 50)
    private String NgoverAcc_Province_3;

    /**
     * 字段名：NgoverAcc_college_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "NgoverAcc_college_1",length = 50)
    private String NgoverAcc_college_1;

    /**
     * 字段名：NgoverAcc_college_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "NgoverAcc_college_2",length = 50)
    private String NgoverAcc_college_2;

    /**
     * 字段名：NgoverAcc_college_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "NgoverAcc_college_3",length = 50)
    private String NgoverAcc_college_3;

    /**
     * 字段名：tecThesy_gernal
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "tecThesy_gernal",length = 50)
    private String tecThesy_gernal;

    /**
     * 字段名：tecThesy_core
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "tecThesy_core",length = 50)
    private String tecThesy_core;

    /**
     * 字段名：tecThesy_EI
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "tecThesy_EI",length = 50)
    private String tecThesy_EI;

    /**
     * 字段名：tecThesy_AHCISSCI
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "tecThesy_AHCISSCI",length = 50)
    private String tecThesy_AHCISSCI;

    /**
     * 字段名：tecThesy_SCI
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "tecThesy_SCI",length = 50)
    private String tecThesy_SCI;

    /**
     * 字段名：inventPatent_invent
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "inventPatent_invent",length = 50)
    private String inventPatent_invent;

    /**
     * 字段名：inventPatent_national
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "inventPatent_national",length = 50)
    private String inventPatent_national;

    /**
     * 字段名：inventPatent_practial
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "inventPatent_practial",length = 50)
    private String inventPatent_practial;

    /**
     * 字段名：inventPatent_design
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "inventPatent_design",length = 50)
    private String inventPatent_design;

    /**
     * 字段名：money_10th
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "money_10th",length = 50)
    private String money_10th;

    /**
     * 字段名：money_10th30th
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "money_10th30th",length = 50)
    private String money_10th30th;

    /**
     * 字段名：money_30th50th
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "money_30th50th",length = 50)
    private String money_30th50th;

    /**
     * 字段名：money_50th100th
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "money_50th100th",length = 50)
    private String money_50th100th;

    /**
     * 字段名：money_100th200th
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "money_100th200th",length = 50)
    private String money_100th200th;

    /**
     * 字段名：money_200th300th
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "money_200th300th",length = 50)
    private String money_200th300th;

    /**
     * 字段名：book_national
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "book_national",length = 50)
    private String book_national;

    /**
     * 字段名：book_depart
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "book_depart",length = 50)
    private String book_depart;

    /**
     * 字段名：book_school
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "book_school",length = 50)
    private String book_school;

    /**
     * 字段名：book_none
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "book_none",length = 50)
    private String book_none;

    /**
     * 字段名：book_count
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "book_count",length = 50)
    private String book_count;

    /**
     * 字段名：book_rank
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "book_rank",length = 50)
    private String book_rank;

    /**
     * 字段名：book_b
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "book_b",length = 50)
    private String book_b;

    /**
     * 字段名：leStuAcc_Inter_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "leStuAcc_Inter_1",length = 50)
    private String leStuAcc_Inter_1;

    /**
     * 字段名：leStuAcc_Inter_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "leStuAcc_Inter_2",length = 50)
    private String leStuAcc_Inter_2;

    /**
     * 字段名：leStuAcc_Inter_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "leStuAcc_Inter_3",length = 50)
    private String leStuAcc_Inter_3;

    /**
     * 字段名：leStuAcc_National_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "leStuAcc_National_1",length = 50)
    private String leStuAcc_National_1;

    /**
     * 字段名：leStuAcc_National_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "leStuAcc_National_2",length = 50)
    private String leStuAcc_National_2;

    /**
     * 字段名：leStuAcc_National_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "leStuAcc_National_3",length = 50)
    private String leStuAcc_National_3;

    /**
     * 字段名：leStuAcc_Provence_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "leStuAcc_Provence_1",length = 50)
    private String leStuAcc_Provence_1;

    /**
     * 字段名：leStuAcc_Provence_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "leStuAcc_Provence_2",length = 50)
    private String leStuAcc_Provence_2;

    /**
     * 字段名：leStuAcc_Provence_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "leStuAcc_Provence_3",length = 50)
    private String leStuAcc_Provence_3;

    /**
     * 字段名：leStuAcc_City_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "leStuAcc_City_1",length = 50)
    private String leStuAcc_City_1;

    /**
     * 字段名：leStuAcc_City_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "leStuAcc_City_2",length = 50)
    private String leStuAcc_City_2;

    /**
     * 字段名：leStuAcc_City_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "leStuAcc_City_3",length = 50)
    private String leStuAcc_City_3;

    /**
     * 字段名：leStuAcc_College_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "leStuAcc_College_1",length = 50)
    private String leStuAcc_College_1;

    /**
     * 字段名：leStuAcc_College_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "leStuAcc_College_2",length = 50)
    private String leStuAcc_College_2;

    /**
     * 字段名：leStuAcc_College_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "leStuAcc_College_3",length = 50)
    private String leStuAcc_College_3;

    /**
     * 字段名：TecAcc_National_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "TecAcc_National_1",length = 50)
    private String TecAcc_National_1;

    /**
     * 字段名：TecAcc_National_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "TecAcc_National_2",length = 50)
    private String TecAcc_National_2;

    /**
     * 字段名：TecAcc_National_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "TecAcc_National_3",length = 50)
    private String TecAcc_National_3;

    /**
     * 字段名：TecAcc_Provence_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "TecAcc_Provence_1",length = 50)
    private String TecAcc_Provence_1;

    /**
     * 字段名：TecAcc_Provence_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "TecAcc_Provence_2",length = 50)
    private String TecAcc_Provence_2;

    /**
     * 字段名：TecAcc_Provence_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "TecAcc_Provence_3",length = 50)
    private String TecAcc_Provence_3;

    /**
     * 字段名：TecAcc_City_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "TecAcc_City_1",length = 50)
    private String TecAcc_City_1;

    /**
     * 字段名：TecAcc_City_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "TecAcc_City_2",length = 50)
    private String TecAcc_City_2;

    /**
     * 字段名：TecAcc_City_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "TecAcc_City_3",length = 50)
    private String TecAcc_City_3;

    /**
     * 字段名：TecAcc_College_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "TecAcc_College_1",length = 50)
    private String TecAcc_College_1;

    /**
     * 字段名：TecAcc_College_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "TecAcc_College_2",length = 50)
    private String TecAcc_College_2;

    /**
     * 字段名：TecAcc_College_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "TecAcc_College_3",length = 50)
    private String TecAcc_College_3;

    /**
     * 字段名：TecDisaster_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "TecDisaster_1",length = 50)
    private String TecDisaster_1;

    /**
     * 字段名：TecDisaster_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "TecDisaster_2",length = 50)
    private String TecDisaster_2;

    /**
     * 字段名：TecDisaster_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "TecDisaster_3",length = 50)
    private String TecDisaster_3;

    /**
     * 字段名：NgoverAcc_City_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "NgoverAcc_City_1",length = 50)
    private String NgoverAcc_City_1;

    /**
     * 字段名：NgoverAcc_City_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "NgoverAcc_City_2",length = 50)
    private String NgoverAcc_City_2;

    /**
     * 字段名：NgoverAcc_City_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "NgoverAcc_City_3",length = 50)
    private String NgoverAcc_City_3;

    /**
     * 字段名：sciTecCusCost_National_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "sciTecCusCost_National_1",length = 50)
    private String sciTecCusCost_National_1;

    /**
     * 字段名：sciTecCusCost_National_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "sciTecCusCost_National_2",length = 50)
    private String sciTecCusCost_National_2;

    /**
     * 字字段名：sciTecCusCost_National_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "sciTecCusCost_National_3",length = 50)
    private String sciTecCusCost_National_3;

    /**
     * 字段名：sciTecCusCost_Province_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "sciTecCusCost_Province_1",length = 50)
    private String sciTecCusCost_Province_1;

    /**
     * 字段名：sciTecCusCost_Province_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "sciTecCusCost_Province_2",length = 50)
    private String sciTecCusCost_Province_2;

    /**
     * 字段名：sciTecCusCost_Province_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "sciTecCusCost_Province_3",length = 50)
    private String sciTecCusCost_Province_3;

    /**
     * 字段名：sciTecCusCost_College_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "sciTecCusCost_College_1",length = 50)
    private String sciTecCusCost_College_1;

    /**
     * 字段名：sciTecCusCost_College_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "sciTecCusCost_College_2",length = 50)
    private String sciTecCusCost_College_2;

    /**
     * 字段名：sciTecCusCost_College_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "sciTecCusCost_College_3",length = 50)
    private String sciTecCusCost_College_3;

    /**
     * 字段名：sciTecCusCost_City_1
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "sciTecCusCost_City_1",length = 50)
    private String sciTecCusCost_City_1;

    /**
     * 字段名：sciTecCusCost_City_2
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "sciTecCusCost_City_2",length = 50)
    private String sciTecCusCost_City_2;

    /**
     * 字字段名：sciTecCusCost_City_3
     * 字段类型：nvarchar(50)
     * 字段含义：
     */
    @Column(name = "sciTecCusCost_City_3",length = 50)
    private String sciTecCusCost_City_3;
}
