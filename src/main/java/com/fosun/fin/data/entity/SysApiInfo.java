package com.fosun.fin.data.entity;

import java.sql.Date;

/**
 * Created by root on 17-5-25.
 */
public class SysApiInfo {
    private int sysApiId;
    private int sysApiSrvcSysId;
    private String sysApiCd;
    private String sysApiNm;
    private String sysApiUriAddr;
    private String sysApiReqTypNm;
    private String sysApiReqMethNm;
    private String sysApiRespTypNm;
    private String sysApiDesc;
    private byte sysApiOnUseFlg;
    private String sysApiOwnrNm;
    private Date sysApiCrtDt;
    private Date sysApiUpdtDt;

    public int getSysApiId() {
        return sysApiId;
    }

    public void setSysApiId(int sysApiId) {
        this.sysApiId = sysApiId;
    }

    public int getSysApiSrvcSysId() {
        return sysApiSrvcSysId;
    }

    public void setSysApiSrvcSysId(int sysApiSrvcSysId) {
        this.sysApiSrvcSysId = sysApiSrvcSysId;
    }

    public String getSysApiCd() {
        return sysApiCd;
    }

    public void setSysApiCd(String sysApiCd) {
        this.sysApiCd = sysApiCd;
    }

    public String getSysApiNm() {
        return sysApiNm;
    }

    public void setSysApiNm(String sysApiNm) {
        this.sysApiNm = sysApiNm;
    }

    public String getSysApiUriAddr() {
        return sysApiUriAddr;
    }

    public void setSysApiUriAddr(String sysApiUriAddr) {
        this.sysApiUriAddr = sysApiUriAddr;
    }

    public String getSysApiReqTypNm() {
        return sysApiReqTypNm;
    }

    public void setSysApiReqTypNm(String sysApiReqTypNm) {
        this.sysApiReqTypNm = sysApiReqTypNm;
    }

    public String getSysApiReqMethNm() {
        return sysApiReqMethNm;
    }

    public void setSysApiReqMethNm(String sysApiReqMethNm) {
        this.sysApiReqMethNm = sysApiReqMethNm;
    }

    public String getSysApiRespTypNm() {
        return sysApiRespTypNm;
    }

    public void setSysApiRespTypNm(String sysApiRespTypNm) {
        this.sysApiRespTypNm = sysApiRespTypNm;
    }

    public String getSysApiDesc() {
        return sysApiDesc;
    }

    public void setSysApiDesc(String sysApiDesc) {
        this.sysApiDesc = sysApiDesc;
    }

    public byte getSysApiOnUseFlg() {
        return sysApiOnUseFlg;
    }

    public void setSysApiOnUseFlg(byte sysApiOnUseFlg) {
        this.sysApiOnUseFlg = sysApiOnUseFlg;
    }

    public String getSysApiOwnrNm() {
        return sysApiOwnrNm;
    }

    public void setSysApiOwnrNm(String sysApiOwnrNm) {
        this.sysApiOwnrNm = sysApiOwnrNm;
    }

    public Date getSysApiCrtDt() {
        return sysApiCrtDt;
    }

    public void setSysApiCrtDt(Date sysApiCrtDt) {
        this.sysApiCrtDt = sysApiCrtDt;
    }

    public Date getSysApiUpdtDt() {
        return sysApiUpdtDt;
    }

    public void setSysApiUpdtDt(Date sysApiUpdtDt) {
        this.sysApiUpdtDt = sysApiUpdtDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysApiInfo that = (SysApiInfo) o;

        if (sysApiId != that.sysApiId) return false;
        if (sysApiSrvcSysId != that.sysApiSrvcSysId) return false;
        if (sysApiOnUseFlg != that.sysApiOnUseFlg) return false;
        if (sysApiCd != null ? !sysApiCd.equals(that.sysApiCd) : that.sysApiCd != null) return false;
        if (sysApiNm != null ? !sysApiNm.equals(that.sysApiNm) : that.sysApiNm != null) return false;
        if (sysApiUriAddr != null ? !sysApiUriAddr.equals(that.sysApiUriAddr) : that.sysApiUriAddr != null)
            return false;
        if (sysApiReqTypNm != null ? !sysApiReqTypNm.equals(that.sysApiReqTypNm) : that.sysApiReqTypNm != null)
            return false;
        if (sysApiReqMethNm != null ? !sysApiReqMethNm.equals(that.sysApiReqMethNm) : that.sysApiReqMethNm != null)
            return false;
        if (sysApiRespTypNm != null ? !sysApiRespTypNm.equals(that.sysApiRespTypNm) : that.sysApiRespTypNm != null)
            return false;
        if (sysApiDesc != null ? !sysApiDesc.equals(that.sysApiDesc) : that.sysApiDesc != null) return false;
        if (sysApiOwnrNm != null ? !sysApiOwnrNm.equals(that.sysApiOwnrNm) : that.sysApiOwnrNm != null) return false;
        if (sysApiCrtDt != null ? !sysApiCrtDt.equals(that.sysApiCrtDt) : that.sysApiCrtDt != null) return false;
        if (sysApiUpdtDt != null ? !sysApiUpdtDt.equals(that.sysApiUpdtDt) : that.sysApiUpdtDt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sysApiId;
        result = 31 * result + sysApiSrvcSysId;
        result = 31 * result + (sysApiCd != null ? sysApiCd.hashCode() : 0);
        result = 31 * result + (sysApiNm != null ? sysApiNm.hashCode() : 0);
        result = 31 * result + (sysApiUriAddr != null ? sysApiUriAddr.hashCode() : 0);
        result = 31 * result + (sysApiReqTypNm != null ? sysApiReqTypNm.hashCode() : 0);
        result = 31 * result + (sysApiReqMethNm != null ? sysApiReqMethNm.hashCode() : 0);
        result = 31 * result + (sysApiRespTypNm != null ? sysApiRespTypNm.hashCode() : 0);
        result = 31 * result + (sysApiDesc != null ? sysApiDesc.hashCode() : 0);
        result = 31 * result + (int) sysApiOnUseFlg;
        result = 31 * result + (sysApiOwnrNm != null ? sysApiOwnrNm.hashCode() : 0);
        result = 31 * result + (sysApiCrtDt != null ? sysApiCrtDt.hashCode() : 0);
        result = 31 * result + (sysApiUpdtDt != null ? sysApiUpdtDt.hashCode() : 0);
        return result;
    }
}
