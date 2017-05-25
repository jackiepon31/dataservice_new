package com.fosun.fin.data.entity;

import java.sql.Date;

/**
 * Created by root on 17-5-25.
 */
public class SysApiSrvcSys {
    private int sysApiSrvcSysId;
    private String sysApiSrvcSysNm;
    private String sysApiSrvcSysUriAddr;
    private byte sysApiSrvcSysOnUseFlg;
    private String sysApiSrvcSysOwnrNm;
    private Date sysApiSrvcSysCrtDt;
    private Date sysApiSrvcSysUpdtDt;

    public int getSysApiSrvcSysId() {
        return sysApiSrvcSysId;
    }

    public void setSysApiSrvcSysId(int sysApiSrvcSysId) {
        this.sysApiSrvcSysId = sysApiSrvcSysId;
    }

    public String getSysApiSrvcSysNm() {
        return sysApiSrvcSysNm;
    }

    public void setSysApiSrvcSysNm(String sysApiSrvcSysNm) {
        this.sysApiSrvcSysNm = sysApiSrvcSysNm;
    }

    public String getSysApiSrvcSysUriAddr() {
        return sysApiSrvcSysUriAddr;
    }

    public void setSysApiSrvcSysUriAddr(String sysApiSrvcSysUriAddr) {
        this.sysApiSrvcSysUriAddr = sysApiSrvcSysUriAddr;
    }

    public byte getSysApiSrvcSysOnUseFlg() {
        return sysApiSrvcSysOnUseFlg;
    }

    public void setSysApiSrvcSysOnUseFlg(byte sysApiSrvcSysOnUseFlg) {
        this.sysApiSrvcSysOnUseFlg = sysApiSrvcSysOnUseFlg;
    }

    public String getSysApiSrvcSysOwnrNm() {
        return sysApiSrvcSysOwnrNm;
    }

    public void setSysApiSrvcSysOwnrNm(String sysApiSrvcSysOwnrNm) {
        this.sysApiSrvcSysOwnrNm = sysApiSrvcSysOwnrNm;
    }

    public Date getSysApiSrvcSysCrtDt() {
        return sysApiSrvcSysCrtDt;
    }

    public void setSysApiSrvcSysCrtDt(Date sysApiSrvcSysCrtDt) {
        this.sysApiSrvcSysCrtDt = sysApiSrvcSysCrtDt;
    }

    public Date getSysApiSrvcSysUpdtDt() {
        return sysApiSrvcSysUpdtDt;
    }

    public void setSysApiSrvcSysUpdtDt(Date sysApiSrvcSysUpdtDt) {
        this.sysApiSrvcSysUpdtDt = sysApiSrvcSysUpdtDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysApiSrvcSys that = (SysApiSrvcSys) o;

        if (sysApiSrvcSysId != that.sysApiSrvcSysId) return false;
        if (sysApiSrvcSysOnUseFlg != that.sysApiSrvcSysOnUseFlg) return false;
        if (sysApiSrvcSysNm != null ? !sysApiSrvcSysNm.equals(that.sysApiSrvcSysNm) : that.sysApiSrvcSysNm != null)
            return false;
        if (sysApiSrvcSysUriAddr != null ? !sysApiSrvcSysUriAddr.equals(that.sysApiSrvcSysUriAddr) : that.sysApiSrvcSysUriAddr != null)
            return false;
        if (sysApiSrvcSysOwnrNm != null ? !sysApiSrvcSysOwnrNm.equals(that.sysApiSrvcSysOwnrNm) : that.sysApiSrvcSysOwnrNm != null)
            return false;
        if (sysApiSrvcSysCrtDt != null ? !sysApiSrvcSysCrtDt.equals(that.sysApiSrvcSysCrtDt) : that.sysApiSrvcSysCrtDt != null)
            return false;
        if (sysApiSrvcSysUpdtDt != null ? !sysApiSrvcSysUpdtDt.equals(that.sysApiSrvcSysUpdtDt) : that.sysApiSrvcSysUpdtDt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sysApiSrvcSysId;
        result = 31 * result + (sysApiSrvcSysNm != null ? sysApiSrvcSysNm.hashCode() : 0);
        result = 31 * result + (sysApiSrvcSysUriAddr != null ? sysApiSrvcSysUriAddr.hashCode() : 0);
        result = 31 * result + (int) sysApiSrvcSysOnUseFlg;
        result = 31 * result + (sysApiSrvcSysOwnrNm != null ? sysApiSrvcSysOwnrNm.hashCode() : 0);
        result = 31 * result + (sysApiSrvcSysCrtDt != null ? sysApiSrvcSysCrtDt.hashCode() : 0);
        result = 31 * result + (sysApiSrvcSysUpdtDt != null ? sysApiSrvcSysUpdtDt.hashCode() : 0);
        return result;
    }
}
