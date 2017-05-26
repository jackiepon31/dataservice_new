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
/* Table: BUS_SYS_INFO	ҵ��ϵͳ��Ϣ                            */
/*==============================================================*/
create table BUS_SYS_INFO
(
   BUS_SYS_ID           int not null comment 'ҵ��ϵͳ��ʶ',
   BUS_SYS_NM           varchar(100) not null comment 'ҵ��ϵͳ����',
   BUS_SYS_DMN_NM       varchar(100) not null comment 'ҵ��ϵͳҵ��������',
   BUS_SYS_ON_USE_FLG   bool not null comment 'ҵ��ϵͳ�Ƿ�ͣ��',
   BUS_SYS_OWNR_NM      varchar(100) not null comment 'ҵ��ϵͳ������',
   BUS_SYS_CRT_DT       date not null comment 'ҵ��ϵͳ��Ϣ����ʱ��',
   BUS_SYS_UPDT_DT      date not null comment 'ҵ��ϵͳ��Ϣ��������',
   primary key (BUS_SYS_ID)
);

alter table BUS_SYS_INFO comment 'ҵ��ϵͳ��Ϣ';

alter	table	BUS_SYS_INFO	add	index	INDX_BUS_SYS_NM(BUS_SYS_NM);

/*==============================================================*/
/* Table: DATA_API_BUS_SYS_MAPPING �ڲ�����API��ҵ��ϵͳ���ù�ϵ*/
/*==============================================================*/
create table DATA_API_BUS_SYS_MAPPING
(
   BUS_SYS_ID           int not null comment 'ҵ��ϵͳ��ʶ',
   DATA_API_ID          int not null comment '�ڲ�����API��ʶ',
   primary key(BUS_SYS_ID,DATA_API_ID)
);

alter table DATA_API_BUS_SYS_MAPPING comment '�ڲ�����API��ҵ��ϵͳ���ù�ϵ';

/*==============================================================*/
/* Table: DATA_API_INFO �ڲ�����API��Ϣ                         */
/*==============================================================*/
create table DATA_API_INFO
(
   DATA_API_ID          int not null comment '�ڲ�����API��ʶ',
   ES_INDX_TYP_ID       int not null comment 'ES�������ͱ�ʶ',
   DATA_API_CD          varchar(100) not null comment '�ڲ�����API����',
   DATA_API_NM          varchar(100) not null comment '�ڲ�����API����',
   DATA_API_URI_ADDR    varchar(500) not null comment '�ڲ�����API URI��ַ',
   DATA_API_REQ_TYP_NM  varchar(100) not null comment '�ڲ�����API������������',
   DATA_API_REQ_METH_NM varchar(100) not null comment '�ڲ�����API���󷽷�����',
   DATA_API_RESP_TYP_NM varchar(100) not null comment '�ڲ�����API������������',
   DATA_API_DESC        varchar(1024) not null comment '�ڲ�����API������Ϣ',
   DATA_API_DMN_SPEC_LNG_QUERY_TXT varchar(1024) not null comment '�ڲ�����API��ES DSL��ѯ���',
   DATA_API_ON_USE_FLG  bool not null comment '�ڲ�����API�Ƿ�ͣ��',
   DATA_API_OWNR_NM     varchar(100) not null comment '�ڲ�����API����������',
   DATA_API_CRT_DT      date not null comment '�ڲ�����API��Ϣ��������',
   DATA_API_UPDT_DT     date not null comment '�ڲ�����API��Ϣ��������',
   primary key (DATA_API_ID)
);

alter table DATA_API_INFO comment '�ڲ�����API��Ϣ';

alter table DATA_API_INFO add unique UNIQ_DATA_API_CD(DATA_API_CD);

/*==============================================================*/
/* Table: DATA_API_REQ_PARM	�ڲ�����API���������Ϣ							*/
/*==============================================================*/
create table DATA_API_REQ_PARM
(
   DATA_API_REQ_PARM_ID int not null comment '�ڲ�����API���������ʶ',
   DATA_API_ID          int not null comment '�ڲ�����API��ʶ',
   DATA_API_REQ_PARM_NM varchar(100) not null comment '�ڲ����ݷ���API�����������',
   DATA_API_REQ_PARM_DATA_TYP_NM varchar(100) not null comment '�ڲ�����API�������������������',
   DATA_API_REQ_PARM_DESC varchar(1024) not null comment '�ڲ�����API�����������',
   DATA_API_REQ_PARM_ON_USE_FLG bool not null comment '�ڲ�����API��������Ƿ�ͣ��',
   DATA_API_REQ_PARM_CRT_DT date not null comment '�ڲ�����API���������Ϣ��������',
   DATA_API_REQ_PARM_UPDT_DT date not null comment '�ڲ�����API���������Ϣ��������',
   primary key (DATA_API_REQ_PARM_ID)
);

alter table DATA_API_REQ_PARM comment '�ڲ�����API���������Ϣ';

alter table DATA_API_REQ_PARM add index INDX_DATA_API_ID_REQ_PARM_NM(DATA_API_ID,DATA_API_REQ_PARM_NM);

/*==============================================================*/
/* Table: DATA_API_RESP_PARM	�ڲ�����API���ز�����Ϣ						*/
/*==============================================================*/
create table DATA_API_RESP_PARM
(
   DATA_API_RESP_PARM_ID int not null comment '�ڲ�����API���ز�����ʶ',
   DATA_API_ID          int not null comment '�ڲ�����API��ʶ',
   DATA_API_RESP_PARM_NM varchar(100) not null comment '�ڲ�����API���ز�������',
   DATA_API_RESP_PARM_DATA_TYP_NM varchar(100) not null comment '�ڲ�����API���ز���������������',
   DATA_API_RESP_PARM_DESC varchar(1024) not null comment '�ڲ�����API���ز���������Ϣ',
   DATA_API_RESP_PARM_ON_USE_FLG bool not null comment '�ڲ�����API���ز����Ƿ�ͣ��',
   DATA_API_RESP_PARM_CRT_DT date not null comment '�ڲ�����API���ز�����Ϣ��������',
   DATA_API_RESP_PARM_UPDT_DT date not null comment '�ڲ�����API���ز�����Ϣ��������',
   primary key (DATA_API_RESP_PARM_ID)
);

alter table DATA_API_RESP_PARM comment '�ڲ�����API���ز�����Ϣ';

alter table DATA_API_RESP_PARM add index INDX_DATA_API_ID_RESP_PARM_NM(DATA_API_ID,DATA_API_RESP_PARM_NM);

/*==============================================================*/
/* Table: ES_CLUSTER_INFO	ES��Ⱥ��Ϣ                          	*/
/*==============================================================*/
create table ES_CLUSTER_INFO
(
   ES_CLSTR_ID          int not null comment 'ES��Ⱥ��ʶ',
   ES_CLSTR_NM          varchar(100) not null comment 'ES��Ⱥ����',
   ES_CLSTR_URI_ADDR    varchar(500) not null comment 'ES��ȺURI��ַ',
   ES_CLSTR_USR_NM      varchar(100) not null comment 'ES��Ⱥ�û�����',
   ES_CLSTR_PWD         varchar(100) not null comment 'ES��Ⱥ����',
   ES_CLSTR_ON_USE_FLG  bool not null comment 'ES��Ⱥ�Ƿ�ͣ����Ϣ',
   ES_CLSTR_OWNR_NM     varchar(100) not null comment 'ES��Ⱥ����������',
   ES_CLSTR_CRT_DT      date not null comment 'ES��Ⱥ��Ϣ��������',
   ES_CLSTR_UPDT_DT     date not null comment 'ES��Ⱥ��Ϣ��������',
   primary key (ES_CLSTR_ID)
);

alter table ES_CLUSTER_INFO comment 'ES��Ⱥ��Ϣ';

/*==============================================================*/
/* Table: ES_INDX_INFO	ES������Ϣ                         			*/
/*==============================================================*/
create table ES_INDX_INFO
(
   ES_INDX_ID           int not null comment 'ES������ʶ',
   ES_CLSTR_ID          int not null comment 'ES��Ⱥ��ʶ',
   ES_INDX_NM           varchar(100) not null comment 'ES��������',
   ES_INDX_ON_USE_FLG   bool not null comment 'ES�����Ƿ�ͣ��',
   ES_INDX_SHRD_NR      int not null comment 'ES������Ƭ��',
   ES_INDX_RPLC_NR      int not null comment 'ES����������',
   ES_INDX_OWNR_NM      varchar(100) not null comment 'ES����������',
   ES_INDX_CRT_DT       date not null comment 'ES������Ϣ��������',
   ES_INDX_UPDT_DT      date not null comment 'ES������Ϣ��������',
   primary key (ES_INDX_ID)
);

alter table ES_INDX_INFO comment 'ES������Ϣ';

alter table ES_INDX_INFO add index INDX_ES_INDX_NM(ES_INDX_NM);

/*==============================================================*/
/* Table: ES_INDX_TYP_INFO	ES����������Ϣ         							*/
/*==============================================================*/
create table ES_INDX_TYP_INFO
(
   ES_INDX_TYP_ID       int not null comment 'ES�������ͱ�ʶ',
   ES_INDX_ID           int not null comment 'ES������ʶ',
   THRD_PRT_DATA_PRVD_API_ID int not null comment '�����������ṩ��API��ʶ',
   ES_INDX_TYP_NM       varchar(20) not null comment 'ES������������',
   ES_INDX_TYP_ON_USE_FLG bool not null comment 'ES���������Ƿ�ͣ��',
   ES_INDX_TYP_OWNR_NM  varchar(100) not null comment 'ES�������͸���������',
   ES_INDX_TYP_CRT_DT   date not null comment 'ES����������Ϣ��������',
   ES_INDX_TYP_UPDT_DT  date not null comment 'ES����������Ϣ��������',
   primary key (ES_INDX_TYP_ID)
);

alter table ES_INDX_TYP_INFO comment 'ES����������Ϣ';

alter table ES_INDX_TYP_INFO add index INDX_ES_INDX_TYP_NM(ES_INDX_TYP_NM);

/*==============================================================*/
/* Table: SYS_API_INFO	ϵͳ����API��Ϣ                        	*/
/*==============================================================*/
create table SYS_API_INFO
(
   SYS_API_ID           int not null comment 'ϵͳ����API��ʶ',
   SYS_API_SRVC_SYS_ID  int not null comment 'ϵͳAPI����ϵͳ��ʶ',
   SYS_API_CD           varchar(100) not null comment 'ϵͳ����API����',
   SYS_API_NM           varchar(100) not null comment 'ϵͳAPI����',
   SYS_API_URI_ADDR     varchar(500) not null comment 'ϵͳAPI URI��ַ',
   SYS_API_REQ_TYP_NM   varchar(100) not null comment 'ϵͳAPI����������Ϣ',
   SYS_API_REQ_METH_NM  varchar(100) not null comment 'ϵͳAPI���󷽷�����',
   SYS_API_RESP_TYP_NM  varchar(100) not null comment 'ϵͳAPI���ز���������������',
   SYS_API_DESC         varchar(1024) not null comment 'ϵͳ����API������Ϣ',
   SYS_API_ON_USE_FLG   bool not null comment 'ϵͳAPI�Ƿ�ͣ��',
   SYS_API_OWNR_NM      varchar(100) not null comment 'ϵͳAPI����������',
   SYS_API_CRT_DT       date not null comment 'ϵͳ����API��Ϣ��������',
   SYS_API_UPDT_DT      date not null comment 'ϵͳAPI��Ϣ��������',
   primary key (SYS_API_ID)
);

alter table SYS_API_INFO comment 'ϵͳ����API��Ϣ';

alter table SYS_API_INFO add unique UNIQ_SYS_API_CD(SYS_API_CD);

/*==============================================================*/
/* Table: SYS_API_REQ_PARM	ϵͳ����API���������Ϣ							*/
/*==============================================================*/
create table SYS_API_REQ_PARM
(
   SYS_API_REQ_PARM_ID  int not null,
   SYS_API_ID           int not null comment 'ϵͳ����API��ʶ',
   SYS_API_REQ_PARM_NM  varchar(100) not null comment 'ϵͳ����API�����������',
   SYS_API_REQ_PARM_DATA_TYP_NM varchar(100) not null comment 'ϵͳAPI�������������������',
   SYS_API_REQ_PARM_DESC varchar(1024) not null comment 'ϵͳ����API�������������Ϣ',
   SYS_API_REQ_PARM_ON_USE_FLG bool not null comment 'ϵͳ����API��������Ƿ�ͣ��',
   SYS_API_REQ_PARM_OWNR_NM varchar(100) not null comment 'ϵͳ����API�����������������',
   SYS_API_REQ_PARM_CRT_DT date not null comment 'ϵͳAPI���������Ϣ��������',
   SYS_API_REQ_PARM_UPDT_DT date not null comment 'ϵͳAPI���������Ϣ��������',
   primary key (SYS_API_REQ_PARM_ID)
);

alter table SYS_API_REQ_PARM comment 'ϵͳ����API���������Ϣ';

alter table SYS_API_REQ_PARM add index INDX_SYS_API_ID_REQ_PARM_NM(SYS_API_ID,SYS_API_REQ_PARM_NM);

/*==============================================================*/
/* Table: SYS_API_RESP_PARM	ϵͳ����API���ز�����Ϣ							*/
/*==============================================================*/
create table SYS_API_RESP_PARM
(
   SYS_API_RESP_PARM_ID int not null comment 'ϵͳ����API���ز�����ʶ',
   SYS_API_ID           int not null comment 'ϵͳ����API��ʶ',
   SYS_API_RESP_PARM_NM varchar(100) not null comment 'ϵͳ����API���ز�������',
   SYS_API_RESP_PARM_DATA_TYP_NM varchar(100) not null comment 'ϵͳ����API���ز���������������',
   SYS_API_RESP_PARM_DESC varchar(1024) not null comment 'ϵͳ����API���ز���������Ϣ',
   SYS_API_RESP_PARM_ON_USE_FLG bool not null,
   SYS_API_RESP_PARM_OWNR_NM varchar(100) not null comment 'ϵͳ����API���ز�������������',
   SYS_API_RESP_PARM_CRT_DT date not null comment 'ϵͳAPI���ز�����Ϣ��������',
   SYS_API_RESP_PARM_UPDT_DT date not null comment 'ϵͳ����API���ز�����Ϣ��������',
   primary key (SYS_API_RESP_PARM_ID)
);

alter table SYS_API_RESP_PARM comment 'ϵͳ����API���ز�����Ϣ';

alter table SYS_API_RESP_PARM add index INDX_SYS_API_ID_RRSP_PARM_NM(SYS_API_ID,SYS_API_RESP_PARM_NM);

/*==============================================================*/
/* Table: SYS_API_SRVC_SYS	ϵͳ����API����ϵͳ��Ϣ							*/
/*==============================================================*/
create table SYS_API_SRVC_SYS
(
   SYS_API_SRVC_SYS_ID  int not null comment 'ϵͳAPI����ϵͳ��ʶ',
   SYS_API_SRVC_SYS_NM  varchar(100) not null comment 'ϵͳAPI����ϵͳ����',
   SYS_API_SRVC_SYS_URI_ADDR varchar(500) not null comment 'ϵͳAPI����ϵͳURI��ַ��Ϣ',
   SYS_API_SRVC_SYS_ON_USE_FLG bool not null comment 'ϵͳAPI����ϵͳ�Ƿ�ͣ��',
   SYS_API_SRVC_SYS_OWNR_NM varchar(100) not null comment 'ϵͳAPI����ϵͳ����������',
   SYS_API_SRVC_SYS_CRT_DT date not null comment 'ϵͳAPI����ϵͳ��Ϣ��������',
   SYS_API_SRVC_SYS_UPDT_DT date not null comment 'ϵͳAPI����ϵͳ��Ϣ��������',
   primary key (SYS_API_SRVC_SYS_ID)
);

alter table SYS_API_SRVC_SYS comment 'ϵͳ����API����ϵͳ��Ϣ';


/*=========================================================================*/
/* Table: THRD_PRT_DATA_PRVD_API_CHRG_RULE	�����������ṩ��API�շѹ�����Ϣ*/
/*=========================================================================*/
create table THRD_PRT_DATA_PRVD_API_CHRG_RULE
(
   THRD_PRT_DATA_PRVD_API_ID int not null comment '�����������ṩ��API��ʶ',
   THRD_PRT_DATA_PRVD_API_CHRG_TYP_NM varchar(100) not null comment '�����������ṩ��API�շѷ������',
   THRD_PRT_DATA_PRVD_API_CHRG_PRC_NR numeric(12,4) not null comment '�����������ṩ��API�շѼ۸�',
   THRD_PRT_DATA_PRVD_API_CHRG_LOGIC_TXT varchar(1024) not null comment '�����������ṩ��API�շ��߼�',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_ON_USE_FLG bool not null comment '�����������ṩ��API�շѹ����Ƿ�ͣ��',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_OWNR_NM varchar(100) not null comment '�����������ṩ��API�շѹ�����������',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_CRT_DT date not null comment '�����������ṩ��API�շѹ�����Ϣ��������',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_UPDT_DT date not null comment '�����������ṩ��API�շѹ�����Ϣ��������',
   primary key (THRD_PRT_DATA_PRVD_API_ID)
);

alter table THRD_PRT_DATA_PRVD_API_CHRG_RULE comment '�����������ṩ��API�շѹ�����Ϣ';

/*===========================================================================*/
/* Table: THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM	�����������ṩ��API�շ�����Ϣ*/
/*===========================================================================*/
create table THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM
(
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM_ID int not null comment '�����������ṩ��API�շѲ�����ʶ',
   THRD_PRT_DATA_PRVD_API_ID int not null comment '�����������ṩ��API��ʶ',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM_NM varchar(100) not null comment '�����������ṩ��API�շѲ�������',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM_VAL_TXT varchar(1024) not null comment '�����������ṩ��API�շѲ���ֵ',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM_ON_USE_FLG bool not null comment '�����������ṩ��API�շѲ����Ƿ�ͣ��',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM_OWNR_NM varchar(100) not null comment '�����������ṩ��API�շѲ�������������',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM_CRT_DT date not null comment '�����������ṩ��API�շѲ�����Ϣ��������',
   THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM_UPDT_DT date not null comment '�����������ṩ��API�շѲ�����Ϣ��������',
   primary key (THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM_ID)
);

alter table THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM comment '�����������ṩ��API�շ�����Ϣ';

alter table THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM add index INDX_THRD_PRT_DATA_PRVD_API_ID_CHRG_PARM_NM(THRD_PRT_DATA_PRVD_API_ID,THRD_PRT_DATA_PRVD_API_CHRG_RULE_PARM_NM);

/*==============================================================*/
/* Table: THRD_PRT_DATA_PRVD_API_INFO	�����������ṩ��API��Ϣ		*/
/*==============================================================*/
create table THRD_PRT_DATA_PRVD_API_INFO
(
   THRD_PRT_DATA_PRVD_API_ID int not null comment '�����������ṩ��API��ʶ',
   THRD_PRT_DATA_PRVD_ID int not null comment '�����������ṩ�̱�ʶ',
   THRD_PRT_DATA_PRVD_API_CD varchar(100) not null comment '�����������ṩ��API����',
   THRD_PRT_DATA_PRVD_API_NM varchar(100) not null comment '�����������ṩ��API����',
   THRD_PRT_DATA_PRVD_API_URI_ADDR varchar(500) not null comment '�����������ṩ��API URI��ַ��Ϣ',
   THRD_PRT_DATA_PRVD_API_REQ_TYP_NM varchar(100) not null comment '�����������ṩ��API������������',
   THRD_PRT_DATA_PRVD_API_REQ_METH_NM varchar(100) not null comment '�����������ṩ��API���󷽷�����',
   THRD_PRT_DATA_PRVD_API_BUS_TYP_NM varchar(100) not null comment '�����������ṩ��APIҵ���������',
   THRD_PRT_DATA_PRVD_API_DESC varchar(1024) not null comment '�����������ṩ��API������Ϣ',
   THRD_PRT_DATA_PRVD_API_ON_USE_FLG bool not null comment '�����������ṩ��API�Ƿ�ͣ��',
   THRD_PRT_DATA_PRVD_API_UPDT_PD_NR numeric(12,4) not null comment '�����������ṩ��API��������(��)',
   THRD_PRT_DATA_PRVD_API_OWNR_NM varchar(100) not null comment '�����������ṩ��API����������',
   THRD_PRT_DATA_PRVD_API_CRT_DT date not null comment '�����������ṩ��API��Ϣ��������',
   THRD_PRT_DATA_PRVD_API_UPDT_DT date not null comment '�����������ṩ��API��Ϣ��������',
   primary key (THRD_PRT_DATA_PRVD_API_ID)
);

alter table THRD_PRT_DATA_PRVD_API_INFO comment '�����������ṩ��API��Ϣ';


alter table THRD_PRT_DATA_PRVD_API_INFO add unique UNIQ_THRD_PRT_DATA_PRVD_API_CD(THRD_PRT_DATA_PRVD_API_CD);

/*=======================================================================*/
/* Table: THRD_PRT_DATA_PRVD_API_REQ_PARM	�����������ṩ��API���������Ϣ*/
/*=======================================================================*/
create table THRD_PRT_DATA_PRVD_API_REQ_PARM
(
   THRD_PRT_DATA_PRVD_API_REQ_PARM_ID int not null comment '�����������ṩ��API���������ʶ',
   THRD_PRT_DATA_PRVD_API_ID int not null comment '�����������ṩ��API��ʶ',
   THRD_PRT_DATA_PRVD_API_REQ_PARM_NM varchar(100) not null comment '�����������ṩ��API�����������',
   THRD_PRT_DATA_PRVD_API_REQ_PARM_DATA_TYP_NM varchar(100) not null comment '�����������ṩ��API����������������',
   THRD_PRT_DATA_PRVD_API_REQ_PARM_DESC varchar(1024) not null comment '�����������ṩ��API�������������Ϣ',
   THRD_PRT_DATA_PRVD_API_REQ_PARM_ON_USE_FLG bool not null comment '�����������ṩ��API��������Ƿ�ͣ��',
   THRD_PRT_DATA_PRVD_API_REQ_PARM_OWNR_NM varchar(100) not null comment '�����������ṩ��API�����������������',
   THRD_PRT_DATA_PRVD_API_REQ_PARM_CRT_DT date not null comment '�����������ṩ��API���������Ϣ��������',
   THRD_PRT_DATA_PRVD_API_REQ_PARM_UPDT_DT date not null comment '�����������ṩ��API���������Ϣ��������',
   primary key (THRD_PRT_DATA_PRVD_API_REQ_PARM_ID)
);

alter table THRD_PRT_DATA_PRVD_API_REQ_PARM comment '�����������ṩ��API���������Ϣ';

alter table THRD_PRT_DATA_PRVD_API_REQ_PARM add index INDX_THRD_PRT_DATA_PRVD_API_ID_REQ_PARM_NM(THRD_PRT_DATA_PRVD_API_ID,THRD_PRT_DATA_PRVD_API_REQ_PARM_NM);


/*=========================================================================*/
/* Table: THRD_PRT_DATA_PRVD_API_RESP_PARM	�����������ṩ��API���ز�����Ϣ*/
/*=========================================================================*/
create table THRD_PRT_DATA_PRVD_API_RESP_PARM
(
   THRD_PRT_DATA_PRVD_API_RESP_PARM_ID int not null comment '�����������ṩ��API���ز�����ʶ',
   THRD_PRT_DATA_PRVD_API_ID int not null comment '�����������ṩ��API��ʶ',
   THRD_PRT_DATA_PRVD_API_RESP_PARM_NM varchar(100) not null comment '�����������ṩ��API���ز�������',
   THRD_PRT_DATA_PRVD_API_RESP_PARM_DATA_TYP_NM varchar(100) not null comment '�����������ṩ��API���ز���������������',
   THRD_PRT_DATA_PRVD_API_RESP_PARM_DESC varchar(1024) not null comment '�����������ṩ��API���ز���������Ϣ',
   THRD_PRT_DATA_PRVD_API_RESP_PARM_ON_USE_FLG bool not null comment '�����������ṩ��API���ز����Ƿ�ͣ��',
   THRD_PRT_DATA_PRVD_API_RESP_PARM_OWNR_NM varchar(100) not null comment '�����������ṩ��API���ز�������������',
   THRD_PRT_DATA_PRVD_API_RESP_PARM_CRT_DT date not null comment '�����������ṩ��API���ز�����Ϣ��������',
   THRD_PRT_DATA_PRVD_API_RESP_PARM_UPDT_DT date not null comment '�����������ṩ��API���ز�����Ϣ��������',
   primary key (THRD_PRT_DATA_PRVD_API_RESP_PARM_ID)
);

alter table THRD_PRT_DATA_PRVD_API_RESP_PARM comment '�����������ṩ��API���ز�����Ϣ';

alter table THRD_PRT_DATA_PRVD_API_RESP_PARM add index INDX_THRD_PRT_DATA_PRVD_API_ID_RESP_PARM_NM(THRD_PRT_DATA_PRVD_API_ID,THRD_PRT_DATA_PRVD_API_RESP_PARM_NM);


/*==============================================================*/
/* Table: THRD_PRT_DATA_PRVD_INFO	���������ݷ����ṩ����Ϣ			*/
/*==============================================================*/
create table THRD_PRT_DATA_PRVD_INFO
(
   THRD_PRT_DATA_PRVD_ID int not null comment '�����������ṩ�̱�ʶ',
   THRD_PRT_DATA_PRVD_NM varchar(100) not null comment '�����������ṩ������',
   THRD_PRT_DATA_PRVD_URI_ADDR varchar(500) not null comment '�����������ṩ��URI��ַ',
   THRD_PRT_DATA_PRVD_USR_NM varchar(100) not null comment '�����������ṩ���û���',
   THRD_PRT_DATA_PRVD_PWD varchar(100) not null comment '�����������ṩ������',
   THRD_PRT_DATA_PRVD_CERT_ATCH blob comment '�����������ṩ��֤�鸽��',
   THRD_PRT_DATA_PRVD_ON_USE_FLG bool not null comment '�����������ṩ���Ƿ�ͣ��',
   THRD_PRT_DATA_PRVD_BUS_OWNR_NM varchar(100) not null comment '�����������ṩ��ҵ����������',
   THRD_PRT_DATA_PRVD_TECH_OWNR_NM varchar(100) not null comment '�����������ṩ�̼�������������',
   THRD_PRT_DATA_PRVD_CRT_DT date not null comment '�����������ṩ����Ϣ��������',
   THRD_PRT_DATA_PRVD_UPDT_DT date not null comment '�����������ṩ����Ϣ��������',
   primary key (THRD_PRT_DATA_PRVD_ID)
);

alter table THRD_PRT_DATA_PRVD_INFO comment '���������ݷ����ṩ����Ϣ';



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


