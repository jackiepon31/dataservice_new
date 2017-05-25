package com.fosun.fin.data.entity;

import java.sql.Date;

/**
 * Created by root on 17-5-25.
 */
public class EsClusterInfo {
    private int esClstrId;
    private String esClstrNm;
    private String esClstrUriAddr;
    private String esClstrUsrNm;
    private String esClstrPwd;
    private byte esClstrOnUseFlg;
    private String esClstrOwnrNm;
    private Date esClstrCrtDt;
    private Date esClstrUpdtDt;

    public int getEsClstrId() {
        return esClstrId;
    }

    public void setEsClstrId(int esClstrId) {
        this.esClstrId = esClstrId;
    }

    public String getEsClstrNm() {
        return esClstrNm;
    }

    public void setEsClstrNm(String esClstrNm) {
        this.esClstrNm = esClstrNm;
    }

    public String getEsClstrUriAddr() {
        return esClstrUriAddr;
    }

    public void setEsClstrUriAddr(String esClstrUriAddr) {
        this.esClstrUriAddr = esClstrUriAddr;
    }

    public String getEsClstrUsrNm() {
        return esClstrUsrNm;
    }

    public void setEsClstrUsrNm(String esClstrUsrNm) {
        this.esClstrUsrNm = esClstrUsrNm;
    }

    public String getEsClstrPwd() {
        return esClstrPwd;
    }

    public void setEsClstrPwd(String esClstrPwd) {
        this.esClstrPwd = esClstrPwd;
    }

    public byte getEsClstrOnUseFlg() {
        return esClstrOnUseFlg;
    }

    public void setEsClstrOnUseFlg(byte esClstrOnUseFlg) {
        this.esClstrOnUseFlg = esClstrOnUseFlg;
    }

    public String getEsClstrOwnrNm() {
        return esClstrOwnrNm;
    }

    public void setEsClstrOwnrNm(String esClstrOwnrNm) {
        this.esClstrOwnrNm = esClstrOwnrNm;
    }

    public Date getEsClstrCrtDt() {
        return esClstrCrtDt;
    }

    public void setEsClstrCrtDt(Date esClstrCrtDt) {
        this.esClstrCrtDt = esClstrCrtDt;
    }

    public Date getEsClstrUpdtDt() {
        return esClstrUpdtDt;
    }

    public void setEsClstrUpdtDt(Date esClstrUpdtDt) {
        this.esClstrUpdtDt = esClstrUpdtDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EsClusterInfo that = (EsClusterInfo) o;

        if (esClstrId != that.esClstrId) return false;
        if (esClstrOnUseFlg != that.esClstrOnUseFlg) return false;
        if (esClstrNm != null ? !esClstrNm.equals(that.esClstrNm) : that.esClstrNm != null) return false;
        if (esClstrUriAddr != null ? !esClstrUriAddr.equals(that.esClstrUriAddr) : that.esClstrUriAddr != null)
            return false;
        if (esClstrUsrNm != null ? !esClstrUsrNm.equals(that.esClstrUsrNm) : that.esClstrUsrNm != null) return false;
        if (esClstrPwd != null ? !esClstrPwd.equals(that.esClstrPwd) : that.esClstrPwd != null) return false;
        if (esClstrOwnrNm != null ? !esClstrOwnrNm.equals(that.esClstrOwnrNm) : that.esClstrOwnrNm != null)
            return false;
        if (esClstrCrtDt != null ? !esClstrCrtDt.equals(that.esClstrCrtDt) : that.esClstrCrtDt != null) return false;
        if (esClstrUpdtDt != null ? !esClstrUpdtDt.equals(that.esClstrUpdtDt) : that.esClstrUpdtDt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = esClstrId;
        result = 31 * result + (esClstrNm != null ? esClstrNm.hashCode() : 0);
        result = 31 * result + (esClstrUriAddr != null ? esClstrUriAddr.hashCode() : 0);
        result = 31 * result + (esClstrUsrNm != null ? esClstrUsrNm.hashCode() : 0);
        result = 31 * result + (esClstrPwd != null ? esClstrPwd.hashCode() : 0);
        result = 31 * result + (int) esClstrOnUseFlg;
        result = 31 * result + (esClstrOwnrNm != null ? esClstrOwnrNm.hashCode() : 0);
        result = 31 * result + (esClstrCrtDt != null ? esClstrCrtDt.hashCode() : 0);
        result = 31 * result + (esClstrUpdtDt != null ? esClstrUpdtDt.hashCode() : 0);
        return result;
    }
}
