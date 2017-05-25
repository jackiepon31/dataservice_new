package com.fosun.fin.data.entity;

import java.sql.Date;

/**
 * Created by root on 17-5-25.
 */
public class EsIndxTypInfo {
    private int esIndxTypId;
    private int esIndxId;
    private int thrdPrtDataPrvdApiId;
    private String esIndxTypNm;
    private byte esIndxTypOnUseFlg;
    private String esIndxTypOwnrNm;
    private Date esIndxTypCrtDt;
    private Date esIndxTypUpdtDt;

    public int getEsIndxTypId() {
        return esIndxTypId;
    }

    public void setEsIndxTypId(int esIndxTypId) {
        this.esIndxTypId = esIndxTypId;
    }

    public int getEsIndxId() {
        return esIndxId;
    }

    public void setEsIndxId(int esIndxId) {
        this.esIndxId = esIndxId;
    }

    public int getThrdPrtDataPrvdApiId() {
        return thrdPrtDataPrvdApiId;
    }

    public void setThrdPrtDataPrvdApiId(int thrdPrtDataPrvdApiId) {
        this.thrdPrtDataPrvdApiId = thrdPrtDataPrvdApiId;
    }

    public String getEsIndxTypNm() {
        return esIndxTypNm;
    }

    public void setEsIndxTypNm(String esIndxTypNm) {
        this.esIndxTypNm = esIndxTypNm;
    }

    public byte getEsIndxTypOnUseFlg() {
        return esIndxTypOnUseFlg;
    }

    public void setEsIndxTypOnUseFlg(byte esIndxTypOnUseFlg) {
        this.esIndxTypOnUseFlg = esIndxTypOnUseFlg;
    }

    public String getEsIndxTypOwnrNm() {
        return esIndxTypOwnrNm;
    }

    public void setEsIndxTypOwnrNm(String esIndxTypOwnrNm) {
        this.esIndxTypOwnrNm = esIndxTypOwnrNm;
    }

    public Date getEsIndxTypCrtDt() {
        return esIndxTypCrtDt;
    }

    public void setEsIndxTypCrtDt(Date esIndxTypCrtDt) {
        this.esIndxTypCrtDt = esIndxTypCrtDt;
    }

    public Date getEsIndxTypUpdtDt() {
        return esIndxTypUpdtDt;
    }

    public void setEsIndxTypUpdtDt(Date esIndxTypUpdtDt) {
        this.esIndxTypUpdtDt = esIndxTypUpdtDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EsIndxTypInfo that = (EsIndxTypInfo) o;

        if (esIndxTypId != that.esIndxTypId) return false;
        if (esIndxId != that.esIndxId) return false;
        if (thrdPrtDataPrvdApiId != that.thrdPrtDataPrvdApiId) return false;
        if (esIndxTypOnUseFlg != that.esIndxTypOnUseFlg) return false;
        if (esIndxTypNm != null ? !esIndxTypNm.equals(that.esIndxTypNm) : that.esIndxTypNm != null) return false;
        if (esIndxTypOwnrNm != null ? !esIndxTypOwnrNm.equals(that.esIndxTypOwnrNm) : that.esIndxTypOwnrNm != null)
            return false;
        if (esIndxTypCrtDt != null ? !esIndxTypCrtDt.equals(that.esIndxTypCrtDt) : that.esIndxTypCrtDt != null)
            return false;
        if (esIndxTypUpdtDt != null ? !esIndxTypUpdtDt.equals(that.esIndxTypUpdtDt) : that.esIndxTypUpdtDt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = esIndxTypId;
        result = 31 * result + esIndxId;
        result = 31 * result + thrdPrtDataPrvdApiId;
        result = 31 * result + (esIndxTypNm != null ? esIndxTypNm.hashCode() : 0);
        result = 31 * result + (int) esIndxTypOnUseFlg;
        result = 31 * result + (esIndxTypOwnrNm != null ? esIndxTypOwnrNm.hashCode() : 0);
        result = 31 * result + (esIndxTypCrtDt != null ? esIndxTypCrtDt.hashCode() : 0);
        result = 31 * result + (esIndxTypUpdtDt != null ? esIndxTypUpdtDt.hashCode() : 0);
        return result;
    }
}
