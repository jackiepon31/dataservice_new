package com.fosun.fin.data.entity;

import java.sql.Date;

/**
 * Created by root on 17-5-25.
 */
public class SysApiRespParm {
    private int sysApiRespParmId;
    private int sysApiId;
    private String sysApiRespParmNm;
    private String sysApiRespParmDataTypNm;
    private String sysApiRespParmDesc;
    private byte sysApiRespParmOnUseFlg;
    private String sysApiRespParmOwnrNm;
    private Date sysApiRespParmCrtDt;
    private Date sysApiRespParmUpdtDt;

    public int getSysApiRespParmId() {
        return sysApiRespParmId;
    }

    public void setSysApiRespParmId(int sysApiRespParmId) {
        this.sysApiRespParmId = sysApiRespParmId;
    }

    public int getSysApiId() {
        return sysApiId;
    }

    public void setSysApiId(int sysApiId) {
        this.sysApiId = sysApiId;
    }

    public String getSysApiRespParmNm() {
        return sysApiRespParmNm;
    }

    public void setSysApiRespParmNm(String sysApiRespParmNm) {
        this.sysApiRespParmNm = sysApiRespParmNm;
    }

    public String getSysApiRespParmDataTypNm() {
        return sysApiRespParmDataTypNm;
    }

    public void setSysApiRespParmDataTypNm(String sysApiRespParmDataTypNm) {
        this.sysApiRespParmDataTypNm = sysApiRespParmDataTypNm;
    }

    public String getSysApiRespParmDesc() {
        return sysApiRespParmDesc;
    }

    public void setSysApiRespParmDesc(String sysApiRespParmDesc) {
        this.sysApiRespParmDesc = sysApiRespParmDesc;
    }

    public byte getSysApiRespParmOnUseFlg() {
        return sysApiRespParmOnUseFlg;
    }

    public void setSysApiRespParmOnUseFlg(byte sysApiRespParmOnUseFlg) {
        this.sysApiRespParmOnUseFlg = sysApiRespParmOnUseFlg;
    }

    public String getSysApiRespParmOwnrNm() {
        return sysApiRespParmOwnrNm;
    }

    public void setSysApiRespParmOwnrNm(String sysApiRespParmOwnrNm) {
        this.sysApiRespParmOwnrNm = sysApiRespParmOwnrNm;
    }

    public Date getSysApiRespParmCrtDt() {
        return sysApiRespParmCrtDt;
    }

    public void setSysApiRespParmCrtDt(Date sysApiRespParmCrtDt) {
        this.sysApiRespParmCrtDt = sysApiRespParmCrtDt;
    }

    public Date getSysApiRespParmUpdtDt() {
        return sysApiRespParmUpdtDt;
    }

    public void setSysApiRespParmUpdtDt(Date sysApiRespParmUpdtDt) {
        this.sysApiRespParmUpdtDt = sysApiRespParmUpdtDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysApiRespParm that = (SysApiRespParm) o;

        if (sysApiRespParmId != that.sysApiRespParmId) return false;
        if (sysApiId != that.sysApiId) return false;
        if (sysApiRespParmOnUseFlg != that.sysApiRespParmOnUseFlg) return false;
        if (sysApiRespParmNm != null ? !sysApiRespParmNm.equals(that.sysApiRespParmNm) : that.sysApiRespParmNm != null)
            return false;
        if (sysApiRespParmDataTypNm != null ? !sysApiRespParmDataTypNm.equals(that.sysApiRespParmDataTypNm) : that.sysApiRespParmDataTypNm != null)
            return false;
        if (sysApiRespParmDesc != null ? !sysApiRespParmDesc.equals(that.sysApiRespParmDesc) : that.sysApiRespParmDesc != null)
            return false;
        if (sysApiRespParmOwnrNm != null ? !sysApiRespParmOwnrNm.equals(that.sysApiRespParmOwnrNm) : that.sysApiRespParmOwnrNm != null)
            return false;
        if (sysApiRespParmCrtDt != null ? !sysApiRespParmCrtDt.equals(that.sysApiRespParmCrtDt) : that.sysApiRespParmCrtDt != null)
            return false;
        if (sysApiRespParmUpdtDt != null ? !sysApiRespParmUpdtDt.equals(that.sysApiRespParmUpdtDt) : that.sysApiRespParmUpdtDt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sysApiRespParmId;
        result = 31 * result + sysApiId;
        result = 31 * result + (sysApiRespParmNm != null ? sysApiRespParmNm.hashCode() : 0);
        result = 31 * result + (sysApiRespParmDataTypNm != null ? sysApiRespParmDataTypNm.hashCode() : 0);
        result = 31 * result + (sysApiRespParmDesc != null ? sysApiRespParmDesc.hashCode() : 0);
        result = 31 * result + (int) sysApiRespParmOnUseFlg;
        result = 31 * result + (sysApiRespParmOwnrNm != null ? sysApiRespParmOwnrNm.hashCode() : 0);
        result = 31 * result + (sysApiRespParmCrtDt != null ? sysApiRespParmCrtDt.hashCode() : 0);
        result = 31 * result + (sysApiRespParmUpdtDt != null ? sysApiRespParmUpdtDt.hashCode() : 0);
        return result;
    }
}
