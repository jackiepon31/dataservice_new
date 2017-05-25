package com.fosun.fin.data.entity;

import java.sql.Date;

/**
 * Created by pengyk on 17-5-24.
 * 内部业务系统信息
 */
public class BusSysInfo {
    private int busSysId;
    //系统名称
    private String busSysNm;
    //业务域
    private String busSysDmnNm;
    private byte busSysOnUseFlg;
    private String busSysOwnrNm;
    private Date busSysCrtDt;
    private Date busSysUpdtDt;

    public int getBusSysId() {
        return busSysId;
    }

    public void setBusSysId(int busSysId) {
        this.busSysId = busSysId;
    }

    public String getBusSysNm() {
        return busSysNm;
    }

    public void setBusSysNm(String busSysNm) {
        this.busSysNm = busSysNm;
    }

    public String getBusSysDmnNm() {
        return busSysDmnNm;
    }

    public void setBusSysDmnNm(String busSysDmnNm) {
        this.busSysDmnNm = busSysDmnNm;
    }

    public byte getBusSysOnUseFlg() {
        return busSysOnUseFlg;
    }

    public void setBusSysOnUseFlg(byte busSysOnUseFlg) {
        this.busSysOnUseFlg = busSysOnUseFlg;
    }

    public String getBusSysOwnrNm() {
        return busSysOwnrNm;
    }

    public void setBusSysOwnrNm(String busSysOwnrNm) {
        this.busSysOwnrNm = busSysOwnrNm;
    }

    public Date getBusSysCrtDt() {
        return busSysCrtDt;
    }

    public void setBusSysCrtDt(Date busSysCrtDt) {
        this.busSysCrtDt = busSysCrtDt;
    }

    public Date getBusSysUpdtDt() {
        return busSysUpdtDt;
    }

    public void setBusSysUpdtDt(Date busSysUpdtDt) {
        this.busSysUpdtDt = busSysUpdtDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BusSysInfo that = (BusSysInfo) o;

        if (busSysId != that.busSysId) return false;
        if (busSysOnUseFlg != that.busSysOnUseFlg) return false;
        if (busSysNm != null ? !busSysNm.equals(that.busSysNm) : that.busSysNm != null) return false;
        if (busSysDmnNm != null ? !busSysDmnNm.equals(that.busSysDmnNm) : that.busSysDmnNm != null) return false;
        if (busSysOwnrNm != null ? !busSysOwnrNm.equals(that.busSysOwnrNm) : that.busSysOwnrNm != null) return false;
        if (busSysCrtDt != null ? !busSysCrtDt.equals(that.busSysCrtDt) : that.busSysCrtDt != null) return false;
        if (busSysUpdtDt != null ? !busSysUpdtDt.equals(that.busSysUpdtDt) : that.busSysUpdtDt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = busSysId;
        result = 31 * result + (busSysNm != null ? busSysNm.hashCode() : 0);
        result = 31 * result + (busSysDmnNm != null ? busSysDmnNm.hashCode() : 0);
        result = 31 * result + (int) busSysOnUseFlg;
        result = 31 * result + (busSysOwnrNm != null ? busSysOwnrNm.hashCode() : 0);
        result = 31 * result + (busSysCrtDt != null ? busSysCrtDt.hashCode() : 0);
        result = 31 * result + (busSysUpdtDt != null ? busSysUpdtDt.hashCode() : 0);
        return result;
    }
}
