package com.fosun.fin.data.entity;

import java.sql.Date;

/**
 * Created by root on 17-5-25.
 */
public class EsIndxInfo {
    private int esIndxId;
    private int esClstrId;
    private String esIndxNm;
    private byte esIndxOnUseFlg;
    private int esIndxShrdNr;
    private int esIndxRplcNr;
    private String esIndxOwnrNm;
    private Date esIndxCrtDt;
    private Date esIndxUpdtDt;

    public int getEsIndxId() {
        return esIndxId;
    }

    public void setEsIndxId(int esIndxId) {
        this.esIndxId = esIndxId;
    }

    public int getEsClstrId() {
        return esClstrId;
    }

    public void setEsClstrId(int esClstrId) {
        this.esClstrId = esClstrId;
    }

    public String getEsIndxNm() {
        return esIndxNm;
    }

    public void setEsIndxNm(String esIndxNm) {
        this.esIndxNm = esIndxNm;
    }

    public byte getEsIndxOnUseFlg() {
        return esIndxOnUseFlg;
    }

    public void setEsIndxOnUseFlg(byte esIndxOnUseFlg) {
        this.esIndxOnUseFlg = esIndxOnUseFlg;
    }

    public int getEsIndxShrdNr() {
        return esIndxShrdNr;
    }

    public void setEsIndxShrdNr(int esIndxShrdNr) {
        this.esIndxShrdNr = esIndxShrdNr;
    }

    public int getEsIndxRplcNr() {
        return esIndxRplcNr;
    }

    public void setEsIndxRplcNr(int esIndxRplcNr) {
        this.esIndxRplcNr = esIndxRplcNr;
    }

    public String getEsIndxOwnrNm() {
        return esIndxOwnrNm;
    }

    public void setEsIndxOwnrNm(String esIndxOwnrNm) {
        this.esIndxOwnrNm = esIndxOwnrNm;
    }

    public Date getEsIndxCrtDt() {
        return esIndxCrtDt;
    }

    public void setEsIndxCrtDt(Date esIndxCrtDt) {
        this.esIndxCrtDt = esIndxCrtDt;
    }

    public Date getEsIndxUpdtDt() {
        return esIndxUpdtDt;
    }

    public void setEsIndxUpdtDt(Date esIndxUpdtDt) {
        this.esIndxUpdtDt = esIndxUpdtDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EsIndxInfo that = (EsIndxInfo) o;

        if (esIndxId != that.esIndxId) return false;
        if (esClstrId != that.esClstrId) return false;
        if (esIndxOnUseFlg != that.esIndxOnUseFlg) return false;
        if (esIndxShrdNr != that.esIndxShrdNr) return false;
        if (esIndxRplcNr != that.esIndxRplcNr) return false;
        if (esIndxNm != null ? !esIndxNm.equals(that.esIndxNm) : that.esIndxNm != null) return false;
        if (esIndxOwnrNm != null ? !esIndxOwnrNm.equals(that.esIndxOwnrNm) : that.esIndxOwnrNm != null) return false;
        if (esIndxCrtDt != null ? !esIndxCrtDt.equals(that.esIndxCrtDt) : that.esIndxCrtDt != null) return false;
        if (esIndxUpdtDt != null ? !esIndxUpdtDt.equals(that.esIndxUpdtDt) : that.esIndxUpdtDt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = esIndxId;
        result = 31 * result + esClstrId;
        result = 31 * result + (esIndxNm != null ? esIndxNm.hashCode() : 0);
        result = 31 * result + (int) esIndxOnUseFlg;
        result = 31 * result + esIndxShrdNr;
        result = 31 * result + esIndxRplcNr;
        result = 31 * result + (esIndxOwnrNm != null ? esIndxOwnrNm.hashCode() : 0);
        result = 31 * result + (esIndxCrtDt != null ? esIndxCrtDt.hashCode() : 0);
        result = 31 * result + (esIndxUpdtDt != null ? esIndxUpdtDt.hashCode() : 0);
        return result;
    }
}
