package com.fosun.fin.data.entity;

import java.sql.Date;

/**
 * Created by root on 17-5-25.
 */
public class SysApiReqParm {
    private int sysApiReqParmId;
    private int sysApiId;
    private String sysApiReqParmNm;
    private String sysApiReqParmDataTypNm;
    private String sysApiReqParmDesc;
    private byte sysApiReqParmOnUseFlg;
    private String sysApiReqParmOwnrNm;
    private Date sysApiReqParmCrtDt;
    private Date sysApiReqParmUpdtDt;

    public int getSysApiReqParmId() {
        return sysApiReqParmId;
    }

    public void setSysApiReqParmId(int sysApiReqParmId) {
        this.sysApiReqParmId = sysApiReqParmId;
    }

    public int getSysApiId() {
        return sysApiId;
    }

    public void setSysApiId(int sysApiId) {
        this.sysApiId = sysApiId;
    }

    public String getSysApiReqParmNm() {
        return sysApiReqParmNm;
    }

    public void setSysApiReqParmNm(String sysApiReqParmNm) {
        this.sysApiReqParmNm = sysApiReqParmNm;
    }

    public String getSysApiReqParmDataTypNm() {
        return sysApiReqParmDataTypNm;
    }

    public void setSysApiReqParmDataTypNm(String sysApiReqParmDataTypNm) {
        this.sysApiReqParmDataTypNm = sysApiReqParmDataTypNm;
    }

    public String getSysApiReqParmDesc() {
        return sysApiReqParmDesc;
    }

    public void setSysApiReqParmDesc(String sysApiReqParmDesc) {
        this.sysApiReqParmDesc = sysApiReqParmDesc;
    }

    public byte getSysApiReqParmOnUseFlg() {
        return sysApiReqParmOnUseFlg;
    }

    public void setSysApiReqParmOnUseFlg(byte sysApiReqParmOnUseFlg) {
        this.sysApiReqParmOnUseFlg = sysApiReqParmOnUseFlg;
    }

    public String getSysApiReqParmOwnrNm() {
        return sysApiReqParmOwnrNm;
    }

    public void setSysApiReqParmOwnrNm(String sysApiReqParmOwnrNm) {
        this.sysApiReqParmOwnrNm = sysApiReqParmOwnrNm;
    }

    public Date getSysApiReqParmCrtDt() {
        return sysApiReqParmCrtDt;
    }

    public void setSysApiReqParmCrtDt(Date sysApiReqParmCrtDt) {
        this.sysApiReqParmCrtDt = sysApiReqParmCrtDt;
    }

    public Date getSysApiReqParmUpdtDt() {
        return sysApiReqParmUpdtDt;
    }

    public void setSysApiReqParmUpdtDt(Date sysApiReqParmUpdtDt) {
        this.sysApiReqParmUpdtDt = sysApiReqParmUpdtDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysApiReqParm that = (SysApiReqParm) o;

        if (sysApiReqParmId != that.sysApiReqParmId) return false;
        if (sysApiId != that.sysApiId) return false;
        if (sysApiReqParmOnUseFlg != that.sysApiReqParmOnUseFlg) return false;
        if (sysApiReqParmNm != null ? !sysApiReqParmNm.equals(that.sysApiReqParmNm) : that.sysApiReqParmNm != null)
            return false;
        if (sysApiReqParmDataTypNm != null ? !sysApiReqParmDataTypNm.equals(that.sysApiReqParmDataTypNm) : that.sysApiReqParmDataTypNm != null)
            return false;
        if (sysApiReqParmDesc != null ? !sysApiReqParmDesc.equals(that.sysApiReqParmDesc) : that.sysApiReqParmDesc != null)
            return false;
        if (sysApiReqParmOwnrNm != null ? !sysApiReqParmOwnrNm.equals(that.sysApiReqParmOwnrNm) : that.sysApiReqParmOwnrNm != null)
            return false;
        if (sysApiReqParmCrtDt != null ? !sysApiReqParmCrtDt.equals(that.sysApiReqParmCrtDt) : that.sysApiReqParmCrtDt != null)
            return false;
        if (sysApiReqParmUpdtDt != null ? !sysApiReqParmUpdtDt.equals(that.sysApiReqParmUpdtDt) : that.sysApiReqParmUpdtDt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sysApiReqParmId;
        result = 31 * result + sysApiId;
        result = 31 * result + (sysApiReqParmNm != null ? sysApiReqParmNm.hashCode() : 0);
        result = 31 * result + (sysApiReqParmDataTypNm != null ? sysApiReqParmDataTypNm.hashCode() : 0);
        result = 31 * result + (sysApiReqParmDesc != null ? sysApiReqParmDesc.hashCode() : 0);
        result = 31 * result + (int) sysApiReqParmOnUseFlg;
        result = 31 * result + (sysApiReqParmOwnrNm != null ? sysApiReqParmOwnrNm.hashCode() : 0);
        result = 31 * result + (sysApiReqParmCrtDt != null ? sysApiReqParmCrtDt.hashCode() : 0);
        result = 31 * result + (sysApiReqParmUpdtDt != null ? sysApiReqParmUpdtDt.hashCode() : 0);
        return result;
    }
}
