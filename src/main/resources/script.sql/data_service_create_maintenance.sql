/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/5/24 19:22:50														*/
/* Author:				 lishuanzhu@fosun.com                         */
/* Purpose:				 Create tables for data service system				*/
/*==============================================================*/

/*Create database for data management platform*/
create database if not exists DMP default charset utf8 collate utf8_general_ci;

/*drop tables for data service for re-install or re-create*/
drop table if exists BUS_SYS_INFO;

drop table if exists DATA_API_BUS_SYS_MAPPING;

drop table if exists DATA_API_INFO;

drop table if exists DATA_API_REQ_PARM;

drop table if exists DATA_API_RESP_PARM;

drop table if exists ES_CLUSTER_INFO;

drop table if exists ES_INDX_INFO;

drop table if exists ES_INDX_TYP_INFO;

drop table if exists SYS_API_INFO;

drop table if exists SYS_API_REQ_PARM;

drop table if exists SYS_API_RESP_PARM;

drop table if exists SYS_API_SRVC_SYS;

drop table if exists THRD_PRT_DATA_PRVD_API_CHRG_RULE;

drop table if exists THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM;

drop table if exists THRD_PRT_DATA_PRVD_API_INFO;

drop table if exists THRD_PRT_DATA_PRVD_API_REQ_PARM;

drop table if exists THRD_PRT_DATA_PRVD_API_RESP_PARM;

drop table if exists THRD_PRT_DATA_PRVD_INFO;

/*==============================================================*/
/* Table: BUS_SYS_INFO	业务系统信息                            */
/*==============================================================*/
create table BUS_SYS_INFO
(
   BUS_SYS_ID           int not null comment '业务系统标识',
   BUS_SYS_NM           varchar(100) not null comment '业务系统名称',
   BUS_SYS_DMN_NM       varchar(100) not null comment '业务系统业务域名称',
   BUS_SYS_ON_USE_FLG   bool not null comment '业务系统是否停用',
   BUS_SYS_OWNR_NM      varchar(100) not null comment '业务系统负责人',
   BUS_SYS_CRT_DT       date not null comment '业务系统信息创建时间',
   BUS_SYS_UPDT_DT      date not null comment '业务系统信息更新日期',
   primary key (BUS_SYS_ID)
);

alter table BUS_SYS_INFO comment '业务系统信息';

alter	table	BUS_SYS_INFO	add	index	INDX_BUS_SYS_NM(BUS_SYS_NM);

/*==============================================================*/
/* Table: DATA_API_BUS_SYS_MAPPING 内部数据API与业务系统调用关系*/
/*==============================================================*/
create table DATA_API_BUS_SYS_MAPPING
(
   BUS_SYS_ID           int not null comment '业务系统标识',
   DATA_API_ID          int not null comment '内部数据API标识',
   primary key(BUS_SYS_ID,DATA_API_ID)
);

alter table DATA_API_BUS_SYS_MAPPING comment '内部数据API与业务系统调用关系';

/*==============================================================*/
/* Table: DATA_API_INFO 内部数据API信息                         */
/*==============================================================*/
create table DATA_API_INFO
(
   DATA_API_ID          int not null comment '内部数据API标识',
   ES_INDX_TYP_ID       int not null comment 'ES索引类型标识',
   DATA_API_CD          varchar(100) not null comment '内部数据API编码',
   DATA_API_NM          varchar(100) not null comment '内部数据API名称',
   DATA_API_URI_ADDR    varchar(500) not null comment '内部数据API URI地址',
   DATA_API_REQ_TYP_NM  varchar(100) not null comment '内部数据API请求类型名称',
   DATA_API_REQ_METH_NM varchar(100) not null comment '内部数据API请求方法名称',
   DATA_API_RESP_TYP_NM varchar(100) not null comment '内部数据API返回类型名称',
   DATA_API_DESC        varchar(1024) not null comment '内部数据API描述信息',
   DATA_API_DMN_SPEC_LNG_QUERY_TXT varchar(1024) not null comment '内部数据API的ES DSL查询语句',
   DATA_API_ON_USE_FLG  bool not null comment '内部数据API是否停用',
   DATA_API_OWNR_NM     varchar(100) not null comment '内部数据API负责人名称',
   DATA_API_CRT_DT      date not null comment '内部数据API信息创建日期',
   DATA_API_UPDT_DT     date not null comment '内部数据API信息更新日期',
   primary key (DATA_API_ID)
);

alter table DATA_API_INFO comment '内部数据API信息';

alter table DATA_API_INFO add unique UNIQ_DATA_API_CD(DATA_API_CD);

/*==============================================================*/
/* Table: DATA_API_REQ_PARM	内部数据API请求参数信息							*/
/*==============================================================*/
create table DATA_API_REQ_PARM
(
   DATA_API_REQ_PARM_ID int not null comment '内部数据API请求参数标识',
   DATA_API_ID          int not null comment '内部数据API标识',
   DATA_API_REQ_PARM_NM varchar(100) not null comment '内部数据服务API请求参数名称',
   DATA_API_REQ_PARM_DATA_TYP_NM varchar(100) not null comment '内部数据API请求参数数据类型名称',
   DATA_API_REQ_PARM_DESC varchar(1024) not null comment '内部数据API请求参数描述',
   DATA_API_REQ_PARM_ON_USE_FLG bool not null comment '内部数据API请求参数是否停用',
   DATA_API_REQ_PARM_CRT_DT date not null comment '内部数据API请求参数信息创建日期',
   DATA_API_REQ_PARM_UPDT_DT date not null comment '内部数据API请求参数信息更新日期',
   primary key (DATA_API_REQ_PARM_ID)
);

alter table DATA_API_REQ_PARM comment '内部数据API请求参数信息';

alter table DATA_API_REQ_PARM add index INDX_DATA_API_ID_REQ_PARM_NM(DATA_API_ID,DATA_API_REQ_PARM_NM);

/*==============================================================*/
/* Table: DATA_API_RESP_PARM	内部数据API返回参数信息						*/
/*==============================================================*/
create table DATA_API_RESP_PARM
(
   DATA_API_RESP_PARM_ID int not null comment '内部数据API返回参数标识',
   DATA_API_ID          int not null comment '内部数据API标识',
   DATA_API_RESP_PARM_NM varchar(100) not null comment '内部数据API返回参数名称',
   DATA_API_RESP_PARM_DATA_TYP_NM varchar(100) not null comment '内部数据API返回参数数据类型名称',
   DATA_API_RESP_PARM_DESC varchar(1024) not null comment '内部数据API返回参数描述信息',
   DATA_API_RESP_PARM_ON_USE_FLG bool not null comment '内部数据API返回参数是否停用',
   DATA_API_RESP_PARM_CRT_DT date not null comment '内部数据API返回参数信息创建日期',
   DATA_API_RESP_PARM_UPDT_DT date not null comment '内部数据API返回参数信息更新日期',
   primary key (DATA_API_RESP_PARM_ID)
);

alter table DATA_API_RESP_PARM comment '内部数据API返回参数信息';

alter table DATA_API_RESP_PARM add index INDX_DATA_API_ID_RESP_PARM_NM(DATA_API_ID,DATA_API_RESP_PARM_NM);

/*==============================================================*/
/* Table: ES_CLUSTER_INFO	ES集群信息                          	*/
/*==============================================================*/
create table ES_CLUSTER_INFO
(
   ES_CLSTR_ID          int not null comment 'ES集群标识',
   ES_CLSTR_NM          varchar(100) not null comment 'ES集群名称',
   ES_CLSTR_URI_ADDR    varchar(500) not null comment 'ES集群URI地址',
   ES_CLSTR_USR_NM      varchar(100) not null comment 'ES集群用户名称',
   ES_CLSTR_PWD         varchar(100) not null comment 'ES集群密码',
   ES_CLSTR_ON_USE_FLG  bool not null comment 'ES集群是否停用信息',
   ES_CLSTR_OWNR_NM     varchar(100) not null comment 'ES集群负责人名称',
   ES_CLSTR_CRT_DT      date not null comment 'ES集群信息创建日期',
   ES_CLSTR_UPDT_DT     date not null comment 'ES集群信息更新日期',
   primary key (ES_CLSTR_ID)
);

alter table ES_CLUSTER_INFO comment 'ES集群信息';

/*==============================================================*/
/* Table: ES_INDX_INFO	ES索引信息                         			*/
/*==============================================================*/
create table ES_INDX_INFO
(
   ES_INDX_ID           int not null comment 'ES索引标识',
   ES_CLSTR_ID          int not null comment 'ES集群标识',
   ES_INDX_NM           varchar(100) not null comment 'ES索引名称',
   ES_INDX_ON_USE_FLG   bool not null comment 'ES索引是否停用',
   ES_INDX_SHRD_NR      int not null comment 'ES索引分片数',
   ES_INDX_RPLC_NR      int not null comment 'ES索引副本数',
   ES_INDX_OWNR_NM      varchar(100) not null comment 'ES索引负责人',
   ES_INDX_CRT_DT       date not null comment 'ES索引信息创建日期',
   ES_INDX_UPDT_DT      date not null comment 'ES索引信息更新日期',
   primary key (ES_INDX_ID)
);

alter table ES_INDX_INFO comment 'ES索引信息';

alter table ES_INDX_INFO add index INDX_ES_INDX_NM(ES_INDX_NM);

/*==============================================================*/
/* Table: ES_INDX_TYP_INFO	ES索引类型信息         							*/
/*==============================================================*/
create table ES_INDX_TYP_INFO
(
   ES_INDX_TYP_ID       int not null comment 'ES索引类型标识',
   ES_INDX_ID           int not null comment 'ES索引标识',
   THRD_PRT_DATA_PRVD_API_ID int not null comment '第三方数据提供商API标识',
   ES_INDX_TYP_NM       varchar(20) not null comment 'ES索引类型名称',
   ES_INDX_TYP_ON_USE_FLG bool not null comment 'ES索引类型是否停用',
   ES_INDX_TYP_OWNR_NM  varchar(100) not null comment 'ES索引类型负责人名称',
   ES_INDX_TYP_CRT_DT   date not null comment 'ES索引类型信息创建日期',
   ES_INDX_TYP_UPDT_DT  date not null comment 'ES索引类型信息更新日期',
   primary key (ES_INDX_TYP_ID)
);

alter table ES_INDX_TYP_INFO comment 'ES索引类型信息';

alter table ES_INDX_TYP_INFO add index INDX_ES_INDX_TYP_NM(ES_INDX_TYP_NM);

/*==============================================================*/
/* Table: SYS_API_INFO	系统服务API信息                        	*/
/*==============================================================*/
create table SYS_API_INFO
(
   SYS_API_ID           int not null comment '系统服务API标识',
   SYS_API_SRVC_SYS_ID  int not null comment '系统API服务系统标识',
   SYS_API_CD           varchar(100) not null comment '系统服务API编码',
   SYS_API_NM           varchar(100) not null comment '系统API名称',
   SYS_API_URI_ADDR     varchar(500) not null comment '系统API URI地址',
   SYS_API_REQ_TYP_NM   varchar(100) not null comment '系统API请求类型信息',
   SYS_API_REQ_METH_NM  varchar(100) not null comment '系统API请求方法名称',
   SYS_API_RESP_TYP_NM  varchar(100) not null comment '系统API返回参数数据类型名称',
   SYS_API_DESC         varchar(1024) not null comment '系统服务API描述信息',
   SYS_API_ON_USE_FLG   bool not null comment '系统API是否停用',
   SYS_API_OWNR_NM      varchar(100) not null comment '系统API负责人名称',
   SYS_API_CRT_DT       date not null comment '系统服务API信息创建日期',
   SYS_API_UPDT_DT      date not null comment '系统API信息更新日期',
   primary key (SYS_API_ID)
);

alter table SYS_API_INFO comment '系统服务API信息';

alter table SYS_API_INFO add unique UNIQ_SYS_API_CD(SYS_API_CD);

/*==============================================================*/
/* Table: SYS_API_REQ_PARM	系统服务API请求参数信息							*/
/*==============================================================*/
create table SYS_API_REQ_PARM
(
   SYS_API_REQ_PARM_ID  int not null,
   SYS_API_ID           int not null comment '系统服务API标识',
   SYS_API_REQ_PARM_NM  varchar(100) not null comment '系统服务API请求参数名称',
   SYS_API_REQ_PARM_DATA_TYP_NM varchar(100) not null comment '系统API请求参数数据类型名称',
   SYS_API_REQ_PARM_DESC varchar(1024) not null comment '系统服务API请求参数描述信息',
   SYS_API_REQ_PARM_ON_USE_FLG bool not null comment '系统服务API请求参数是否停用',
   SYS_API_REQ_PARM_OWNR_NM varchar(100) not null comment '系统服务API请求参数负责人名称',
   SYS_API_REQ_PARM_CRT_DT date not null comment '系统API请求参数信息创建日期',
   SYS_API_REQ_PARM_UPDT_DT date not null comment '系统API请求参数信息更新日期',
   primary key (SYS_API_REQ_PARM_ID)
);

alter table SYS_API_REQ_PARM comment '系统服务API请求参数信息';

alter table SYS_API_REQ_PARM add index INDX_SYS_API_ID_REQ_PARM_NM(SYS_API_ID,SYS_API_REQ_PARM_NM);

/*==============================================================*/
/* Table: SYS_API_RESP_PARM	系统服务API返回参数信息							*/
/*==============================================================*/
create table SYS_API_RESP_PARM
(
   SYS_API_RESP_PARM_ID int not null comment '系统服务API返回参数标识',
   SYS_API_ID           int not null comment '系统服务API标识',
   SYS_API_RESP_PARM_NM varchar(100) not null comment '系统服务API返回参数名称',
   SYS_API_RESP_PARM_DATA_TYP_NM varchar(100) not null comment '系统服务API返回参数数据类型名称',
   SYS_API_RESP_PARM_DESC varchar(1024) not null comment '系统服务API返回参数描述信息',
   SYS_API_RESP_PARM_ON_USE_FLG bool not null,
   SYS_API_RESP_PARM_OWNR_NM varchar(100) not null comment '系统服务API返回参数负责人名称',
   SYS_API_RESP_PARM_CRT_DT date not null comment '系统API返回参数信息创建日期',
   SYS_API_RESP_PARM_UPDT_DT date not null comment '系统服务API返回参数信息更新日期',
   primary key (SYS_API_RESP_PARM_ID)
);

alter table SYS_API_RESP_PARM comment '系统服务API返回参数信息';

alter table SYS_API_RESP_PARM add index INDX_SYS_API_ID_RRSP_PARM_NM(SYS_API_ID,SYS_API_RESP_PARM_NM);

/*==============================================================*/
/* Table: SYS_API_SRVC_SYS	系统服务API服务系统信息							*/
/*==============================================================*/
create table SYS_API_SRVC_SYS
(
   SYS_API_SRVC_SYS_ID  int not null comment '系统API服务系统标识',
   SYS_API_SRVC_SYS_NM  varchar(100) not null comment '系统API服务系统名称',
   SYS_API_SRVC_SYS_URI_ADDR varchar(500) not null comment '系统API服务系统URI地址信息',
   SYS_API_SRVC_SYS_ON_USE_FLG bool not null comment '系统API服务系统是否停用',
   SYS_API_SRVC_SYS_OWNR_NM varchar(100) not null comment '系统API服务系统负责人名称',
   SYS_API_SRVC_SYS_CRT_DT date not null comment '系统API服务系统信息创建日期',
   SYS_API_SRVC_SYS_UPDT_DT date not null comment '系统API服务系统信息更新日期',
   primary key (SYS_API_SRVC_SYS_ID)
);

alter table SYS_API_SRVC_SYS comment '系统服务API服务系统信息';


/*=========================================================================*/
/* Table: THRD_PRT_DATA_PRVD_API_CHRG_RULE	第三方数据提供商API收费规则信息*/
/*=========================================================================*/
create table THRD_PRT_DATA_PRVD_API_CHRG_RULE
(
   THRD_PRT_DATA_PRVD_API_ID int not null comment '第三方数据提供商API标识',
   THRD_PRT_DATA_PRVD_API_CHRG_TYP_NM varchar(100) not null comment '第三方数据提供商API收费方法类别',
   THRD_PRT_DATA_PRVD_API_CHRG_PRC_NR numeric(12,4) not null comment '第三方数据提供商API收费价格',
   THRD_PRT_DATA_PRVD_API_CHRG_LOGIC_TXT varchar(1024) not null comment '第三方数据提供商API收费逻辑',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_ON_USE_FLG bool not null comment '第三方数据提供商API收费规则是否停用',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_OWNR_NM varchar(100) not null comment '第三方数据提供商API收费规则负责人名称',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_CRT_DT date not null comment '第三方数据提供商API收费规则信息创建日期',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_UPDT_DT date not null comment '第三方数据提供商API收费规则信息更新日期',
   primary key (THRD_PRT_DATA_PRVD_API_ID)
);

alter table THRD_PRT_DATA_PRVD_API_CHRG_RULE comment '第三方数据提供商API收费规则信息';

/*===========================================================================*/
/* Table: THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM	第三方数据提供商API收费码信息*/
/*===========================================================================*/
create table THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM
(
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM_ID int not null comment '第三方数据提供商API收费参数标识',
   THRD_PRT_DATA_PRVD_API_ID int not null comment '第三方数据提供商API标识',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM_NM varchar(100) not null comment '第三方数据提供商API收费参数名称',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM_VAL_TXT varchar(1024) not null comment '第三方数据提供商API收费参数值',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM_ON_USE_FLG bool not null comment '第三方数据提供商API收费参数是否停用',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM_OWNR_NM varchar(100) not null comment '第三方数据提供商API收费参数负责人名称',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM_CRT_DT date not null comment '第三方数据提供商API收费参数信息创建日期',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM_UPDT_DT date not null comment '第三方数据提供商API收费参数信息更新日期',
   primary key (THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM_ID)
);

alter table THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM comment '第三方数据提供商API收费码信息';

alter table THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM add index INDX_THRD_PRT_DATA_PRVD_API_ID_CHRG_PARM_NM(THRD_PRT_DATA_PRVD_API_ID,THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM_NM);

/*==============================================================*/
/* Table: THRD_PRT_DATA_PRVD_API_INFO	第三方数据提供商API信息		*/
/*==============================================================*/
create table THRD_PRT_DATA_PRVD_API_INFO
(
   THRD_PRT_DATA_PRVD_API_ID int not null comment '第三方数据提供商API标识',
   THRD_PRT_DATA_PRVD_ID int not null comment '第三方数据提供商标识',
   THRD_PRT_DATA_PRVD_API_CD varchar(100) not null comment '第三方数据提供商API编码',
   THRD_PRT_DATA_PRVD_API_NM varchar(100) not null comment '第三方数据提供商API名称',
   THRD_PRT_DATA_PRVD_API_URI_ADDR varchar(500) not null comment '第三方数据提供商API URI地址信息',
   THRD_PRT_DATA_PRVD_API_REQ_TYP_NM varchar(100) not null comment '第三方数据提供商API请求类型名称',
   THRD_PRT_DATA_PRVD_API_REQ_METH_NM varchar(100) not null comment '第三方数据提供商API请求方法名称',
   THRD_PRT_DATA_PRVD_API_BUS_TYP_NM varchar(100) not null comment '第三方数据提供商API业务类别名称',
   THRD_PRT_DATA_PRVD_API_DESC varchar(1024) not null comment '第三方数据提供商API描述信息',
   THRD_PRT_DATA_PRVD_API_ON_USE_FLG bool not null comment '第三方数据提供商API是否停用',
   THRD_PRT_DATA_PRVD_API_UPDT_PD_NR numeric(12,4) not null comment '第三方数据提供商API更新周期(天)',
   THRD_PRT_DATA_PRVD_API_OWNR_NM varchar(100) not null comment '第三方数据提供商API负责人名称',
   THRD_PRT_DATA_PRVD_API_CRT_DT date not null comment '第三方数据提供商API信息更新日期',
   THRD_PRT_DATA_PRVD_API_UPDT_DT date not null comment '第三方数据提供商API信息更新日期',
   primary key (THRD_PRT_DATA_PRVD_API_ID)
);

alter table THRD_PRT_DATA_PRVD_API_INFO comment '第三方数据提供商API信息';


alter table THRD_PRT_DATA_PRVD_API_INFO add unique UNIQ_THRD_PRT_DATA_PRVD_API_CD(THRD_PRT_DATA_PRVD_API_CD);

/*=======================================================================*/
/* Table: THRD_PRT_DATA_PRVD_API_REQ_PARM	第三方数据提供商API请求参数信息*/
/*=======================================================================*/
create table THRD_PRT_DATA_PRVD_API_REQ_PARM
(
   THRD_PRT_DATA_PRVD_API_REQ_PARM_ID int not null comment '第三方数据提供商API请求参数标识',
   THRD_PRT_DATA_PRVD_API_ID int not null comment '第三方数据提供商API标识',
   THRD_PRT_DATA_PRVD_API_REQ_PARM_NM varchar(100) not null comment '第三方数据提供商API请求参数名称',
   THRD_PRT_DATA_PRVD_API_REQ_PARM_DATA_TYP_NM varchar(100) not null comment '第三方数据提供商API请求数据类型名称',
   THRD_PRT_DATA_PRVD_API_REQ_PARM_DESC varchar(1024) not null comment '第三方数据提供商API请求参数描述信息',
   THRD_PRT_DATA_PRVD_API_REQ_PARM_ON_USE_FLG bool not null comment '第三方数据提供商API请求参数是否停用',
   THRD_PRT_DATA_PRVD_API_REQ_PARM_OWNR_NM varchar(100) not null comment '第三方数据提供商API请求参数负责人名称',
   THRD_PRT_DATA_PRVD_API_REQ_PARM_CRT_DT date not null comment '第三方数据提供商API请求参数信息创建日期',
   THRD_PRT_DATA_PRVD_API_REQ_PARM_UPDT_DT date not null comment '第三方数据提供商API请求参数信息更新日期',
   primary key (THRD_PRT_DATA_PRVD_API_REQ_PARM_ID)
);

alter table THRD_PRT_DATA_PRVD_API_REQ_PARM comment '第三方数据提供商API请求参数信息';

alter table THRD_PRT_DATA_PRVD_API_REQ_PARM add index INDX_THRD_PRT_DATA_PRVD_API_ID_REQ_PARM_NM(THRD_PRT_DATA_PRVD_API_ID,THRD_PRT_DATA_PRVD_API_REQ_PARM_NM);


/*=========================================================================*/
/* Table: THRD_PRT_DATA_PRVD_API_RESP_PARM	第三方数据提供商API返回参数信息*/
/*=========================================================================*/
create table THRD_PRT_DATA_PRVD_API_RESP_PARM
(
   THRD_PRT_DATA_PRVD_API_RESP_PARM_ID int not null comment '第三方数据提供商API返回参数标识',
   THRD_PRT_DATA_PRVD_API_ID int not null comment '第三方数据提供商API标识',
   THRD_PRT_DATA_PRVD_API_RESP_PARM_NM varchar(100) not null comment '第三方数据提供商API返回参数名称',
   THRD_PRT_DATA_PRVD_API_RESP_PARM_DATA_TYP_NM varchar(100) not null comment '第三方数据提供商API返回参数数据类型名称',
   THRD_PRT_DATA_PRVD_API_RESP_PARM_DESC varchar(1024) not null comment '第三方数据提供商API返回参数描述信息',
   THRD_PRT_DATA_PRVD_API_RESP_PARM_ON_USE_FLG bool not null comment '第三方数据提供商API返回参数是否停用',
   THRD_PRT_DATA_PRVD_API_RESP_PARM_OWNR_NM varchar(100) not null comment '第三方数据提供商API返回参数负责人名称',
   THRD_PRT_DATA_PRVD_API_RESP_PARM_CRT_DT date not null comment '第三方数据提供商API返回参数信息创建日期',
   THRD_PRT_DATA_PRVD_API_RESP_PARM_UPDT_DT date not null comment '第三方数据提供商API返回参数信息更新日期',
   primary key (THRD_PRT_DATA_PRVD_API_RESP_PARM_ID)
);

alter table THRD_PRT_DATA_PRVD_API_RESP_PARM comment '第三方数据提供商API返回参数信息';

alter table THRD_PRT_DATA_PRVD_API_RESP_PARM add index INDX_THRD_PRT_DATA_PRVD_API_ID_RESP_PARM_NM(THRD_PRT_DATA_PRVD_API_ID,THRD_PRT_DATA_PRVD_API_RESP_PARM_NM);


/*==============================================================*/
/* Table: THRD_PRT_DATA_PRVD_INFO	第三方数据服务提供商信息			*/
/*==============================================================*/
create table THRD_PRT_DATA_PRVD_INFO
(
   THRD_PRT_DATA_PRVD_ID int not null comment '第三方数据提供商标识',
   THRD_PRT_DATA_PRVD_NM varchar(100) not null comment '第三方数据提供商名称',
   THRD_PRT_DATA_PRVD_URI_ADDR varchar(500) not null comment '第三方数据提供商URI地址',
   THRD_PRT_DATA_PRVD_USR_NM varchar(100) not null comment '第三方数据提供商用户名',
   THRD_PRT_DATA_PRVD_PWD varchar(100) not null comment '第三方数据提供商密码',
   THRD_PRT_DATA_PRVD_CERT_ATCH blob comment '第三方数据提供商证书附件',
   THRD_PRT_DATA_PRVD_ON_USE_FLG bool not null comment '第三方数据提供商是否停用',
   THRD_PRT_DATA_PRVD_BUS_OWNR_NM varchar(100) not null comment '第三方数据提供商业务负责人名称',
   THRD_PRT_DATA_PRVD_TECH_OWNR_NM varchar(100) not null comment '第三方数据提供商技术负责人名称',
   THRD_PRT_DATA_PRVD_CRT_DT date not null comment '第三方数据提供商信息创建日期',
   THRD_PRT_DATA_PRVD_UPDT_DT date not null comment '第三方数据提供商信息更新日期',
   primary key (THRD_PRT_DATA_PRVD_ID)
);

alter table THRD_PRT_DATA_PRVD_INFO comment '第三方数据服务提供商信息';



/*==============================================================*/
/* Update statistics for good query plan on every weekend				*/
/* Reorg table to avoid random IO																*/
/*==============================================================*/

analyze table BUS_SYS_INFO;
optimize table BUS_SYS_INFO;



analyze table DATA_API_BUS_SYS_MAPPING;
optimize table DATA_API_BUS_SYS_MAPPING;


analyze table DATA_API_INFO;
optimize table DATA_API_INFO;


analyze table DATA_API_REQ_PARM;
optimize table DATA_API_REQ_PARM;


analyze table DATA_API_RESP_PARM;
optimize table DATA_API_RESP_PARM;


analyze table ES_CLUSTER_INFO;
optimize table ES_CLUSTER_INFO;


analyze table ES_INDX_INFO;
optimize table ES_INDX_INFO;


analyze table ES_INDX_TYP_INFO;
optimize table ES_INDX_TYP_INFO;


analyze table SYS_API_INFO;
optimize table SYS_API_INFO;


analyze table SYS_API_REQ_PARM;
optimize table SYS_API_REQ_PARM;


analyze table SYS_API_RESP_PARM;
optimize table SYS_API_RESP_PARM;


analyze table SYS_API_SRVC_SYS;
optimize table SYS_API_SRVC_SYS;


analyze table THRD_PRT_DATA_PRVD_API_CHRG_RULE;
optimize table THRD_PRT_DATA_PRVD_API_CHRG_RULE;


analyze table THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM;
optimize table THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM;


analyze table THRD_PRT_DATA_PRVD_API_INFO;
optimize table THRD_PRT_DATA_PRVD_API_INFO;


analyze table THRD_PRT_DATA_PRVD_API_REQ_PARM;
optimize table THRD_PRT_DATA_PRVD_API_REQ_PARM;


analyze table THRD_PRT_DATA_PRVD_API_RESP_PARM;
optimize table THRD_PRT_DATA_PRVD_API_RESP_PARM;


analyze table THRD_PRT_DATA_PRVD_INFO;
optimize table THRD_PRT_DATA_PRVD_INFO;


