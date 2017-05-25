package com.fosun.fin.data.entity;

import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by root on 17-5-25.
 */
public class ThrdPrtDataPrvdApiInfo {
    private int thrdPrtDataPrvdApiId;
    private int thrdPrtDataPrvdId;
    private String thrdPrtDataPrvdApiCd;
    private String thrdPrtDataPrvdApiNm;
    private String thrdPrtDataPrvdApiUriAddr;
    private String thrdPrtDataPrvdApiReqTypNm;
    private String thrdPrtDataPrvdApiReqMethNm;
    private String thrdPrtDataPrvdApiBusTypNm;
    private String thrdPrtDataPrvdApiDesc;
    private byte thrdPrtDataPrvdApiOnUseFlg;
    private BigDecimal thrdPrtDataPrvdApiUpdtPdNr;
    private String thrdPrtDataPrvdApiOwnrNm;
    private Date thrdPrtDataPrvdApiCrtDt;
    private Date thrdPrtDataPrvdApiUpdtDt;

    public int getThrdPrtDataPrvdApiId() {
        return thrdPrtDataPrvdApiId;
    }

    public void setThrdPrtDataPrvdApiId(int thrdPrtDataPrvdApiId) {
        this.thrdPrtDataPrvdApiId = thrdPrtDataPrvdApiId;
    }

    public int getThrdPrtDataPrvdId() {
        return thrdPrtDataPrvdId;
    }

    public void setThrdPrtDataPrvdId(int thrdPrtDataPrvdId) {
        this.thrdPrtDataPrvdId = thrdPrtDataPrvdId;
    }

    public String getThrdPrtDataPrvdApiCd() {
        return thrdPrtDataPrvdApiCd;
    }

    public void setThrdPrtDataPrvdApiCd(String thrdPrtDataPrvdApiCd) {
        this.thrdPrtDataPrvdApiCd = thrdPrtDataPrvdApiCd;
    }

    public String getThrdPrtDataPrvdApiNm() {
        return thrdPrtDataPrvdApiNm;
    }

    public void setThrdPrtDataPrvdApiNm(String thrdPrtDataPrvdApiNm) {
        this.thrdPrtDataPrvdApiNm = thrdPrtDataPrvdApiNm;
    }

    public String getThrdPrtDataPrvdApiUriAddr() {
        return thrdPrtDataPrvdApiUriAddr;
    }

    public void setThrdPrtDataPrvdApiUriAddr(String thrdPrtDataPrvdApiUriAddr) {
        this.thrdPrtDataPrvdApiUriAddr = thrdPrtDataPrvdApiUriAddr;
    }

    public String getThrdPrtDataPrvdApiReqTypNm() {
        return thrdPrtDataPrvdApiReqTypNm;
    }

    public void setThrdPrtDataPrvdApiReqTypNm(String thrdPrtDataPrvdApiReqTypNm) {
        this.thrdPrtDataPrvdApiReqTypNm = thrdPrtDataPrvdApiReqTypNm;
    }

    public String getThrdPrtDataPrvdApiReqMethNm() {
        return thrdPrtDataPrvdApiReqMethNm;
    }

    public void setThrdPrtDataPrvdApiReqMethNm(String thrdPrtDataPrvdApiReqMethNm) {
        this.thrdPrtDataPrvdApiReqMethNm = thrdPrtDataPrvdApiReqMethNm;
    }

    public String getThrdPrtDataPrvdApiBusTypNm() {
        return thrdPrtDataPrvdApiBusTypNm;
    }

    public void setThrdPrtDataPrvdApiBusTypNm(String thrdPrtDataPrvdApiBusTypNm) {
        this.thrdPrtDataPrvdApiBusTypNm = thrdPrtDataPrvdApiBusTypNm;
    }

    public String getThrdPrtDataPrvdApiDesc() {
        return thrdPrtDataPrvdApiDesc;
    }

    public void setThrdPrtDataPrvdApiDesc(String thrdPrtDataPrvdApiDesc) {
        this.thrdPrtDataPrvdApiDesc = thrdPrtDataPrvdApiDesc;
    }

    public byte getThrdPrtDataPrvdApiOnUseFlg() {
        return thrdPrtDataPrvdApiOnUseFlg;
    }

    public void setThrdPrtDataPrvdApiOnUseFlg(byte thrdPrtDataPrvdApiOnUseFlg) {
        this.thrdPrtDataPrvdApiOnUseFlg = thrdPrtDataPrvdApiOnUseFlg;
    }

    public BigDecimal getThrdPrtDataPrvdApiUpdtPdNr() {
        return thrdPrtDataPrvdApiUpdtPdNr;
    }

    public void setThrdPrtDataPrvdApiUpdtPdNr(BigDecimal thrdPrtDataPrvdApiUpdtPdNr) {
        this.thrdPrtDataPrvdApiUpdtPdNr = thrdPrtDataPrvdApiUpdtPdNr;
    }

    public String getThrdPrtDataPrvdApiOwnrNm() {
        return thrdPrtDataPrvdApiOwnrNm;
    }

    public void setThrdPrtDataPrvdApiOwnrNm(String thrdPrtDataPrvdApiOwnrNm) {
        this.thrdPrtDataPrvdApiOwnrNm = thrdPrtDataPrvdApiOwnrNm;
    }

    public Date getThrdPrtDataPrvdApiCrtDt() {
        return thrdPrtDataPrvdApiCrtDt;
    }

    public void setThrdPrtDataPrvdApiCrtDt(Date thrdPrtDataPrvdApiCrtDt) {
        this.thrdPrtDataPrvdApiCrtDt = thrdPrtDataPrvdApiCrtDt;
    }

    public Date getThrdPrtDataPrvdApiUpdtDt() {
        return thrdPrtDataPrvdApiUpdtDt;
    }

    public void setThrdPrtDataPrvdApiUpdtDt(Date thrdPrtDataPrvdApiUpdtDt) {
        this.thrdPrtDataPrvdApiUpdtDt = thrdPrtDataPrvdApiUpdtDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThrdPrtDataPrvdApiInfo that = (ThrdPrtDataPrvdApiInfo) o;

        if (thrdPrtDataPrvdApiId != that.thrdPrtDataPrvdApiId) return false;
        if (thrdPrtDataPrvdId != that.thrdPrtDataPrvdId) return false;
        if (thrdPrtDataPrvdApiOnUseFlg != that.thrdPrtDataPrvdApiOnUseFlg) return false;
        if (thrdPrtDataPrvdApiCd != null ? !thrdPrtDataPrvdApiCd.equals(that.thrdPrtDataPrvdApiCd) : that.thrdPrtDataPrvdApiCd != null)
            return false;
        if (thrdPrtDataPrvdApiNm != null ? !thrdPrtDataPrvdApiNm.equals(that.thrdPrtDataPrvdApiNm) : that.thrdPrtDataPrvdApiNm != null)
            return false;
        if (thrdPrtDataPrvdApiUriAddr != null ? !thrdPrtDataPrvdApiUriAddr.equals(that.thrdPrtDataPrvdApiUriAddr) : that.thrdPrtDataPrvdApiUriAddr != null)
            return false;
        if (thrdPrtDataPrvdApiReqTypNm != null ? !thrdPrtDataPrvdApiReqTypNm.equals(that.thrdPrtDataPrvdApiReqTypNm) : that.thrdPrtDataPrvdApiReqTypNm != null)
            return false;
        if (thrdPrtDataPrvdApiReqMethNm != null ? !thrdPrtDataPrvdApiReqMethNm.equals(that.thrdPrtDataPrvdApiReqMethNm) : that.thrdPrtDataPrvdApiReqMethNm != null)
            return false;
        if (thrdPrtDataPrvdApiBusTypNm != null ? !thrdPrtDataPrvdApiBusTypNm.equals(that.thrdPrtDataPrvdApiBusTypNm) : that.thrdPrtDataPrvdApiBusTypNm != null)
            return false;
        if (thrdPrtDataPrvdApiDesc != null ? !thrdPrtDataPrvdApiDesc.equals(that.thrdPrtDataPrvdApiDesc) : that.thrdPrtDataPrvdApiDesc != null)
            return false;
        if (thrdPrtDataPrvdApiUpdtPdNr != null ? !thrdPrtDataPrvdApiUpdtPdNr.equals(that.thrdPrtDataPrvdApiUpdtPdNr) : that.thrdPrtDataPrvdApiUpdtPdNr != null)
            return false;
        if (thrdPrtDataPrvdApiOwnrNm != null ? !thrdPrtDataPrvdApiOwnrNm.equals(that.thrdPrtDataPrvdApiOwnrNm) : that.thrdPrtDataPrvdApiOwnrNm != null)
            return false;
        if (thrdPrtDataPrvdApiCrtDt != null ? !thrdPrtDataPrvdApiCrtDt.equals(that.thrdPrtDataPrvdApiCrtDt) : that.thrdPrtDataPrvdApiCrtDt != null)
            return false;
        if (thrdPrtDataPrvdApiUpdtDt != null ? !thrdPrtDataPrvdApiUpdtDt.equals(that.thrdPrtDataPrvdApiUpdtDt) : that.thrdPrtDataPrvdApiUpdtDt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = thrdPrtDataPrvdApiId;
        result = 31 * result + thrdPrtDataPrvdId;
        result = 31 * result + (thrdPrtDataPrvdApiCd != null ? thrdPrtDataPrvdApiCd.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiNm != null ? thrdPrtDataPrvdApiNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiUriAddr != null ? thrdPrtDataPrvdApiUriAddr.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiReqTypNm != null ? thrdPrtDataPrvdApiReqTypNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiReqMethNm != null ? thrdPrtDataPrvdApiReqMethNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiBusTypNm != null ? thrdPrtDataPrvdApiBusTypNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiDesc != null ? thrdPrtDataPrvdApiDesc.hashCode() : 0);
        result = 31 * result + (int) thrdPrtDataPrvdApiOnUseFlg;
        result = 31 * result + (thrdPrtDataPrvdApiUpdtPdNr != null ? thrdPrtDataPrvdApiUpdtPdNr.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiOwnrNm != null ? thrdPrtDataPrvdApiOwnrNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiCrtDt != null ? thrdPrtDataPrvdApiCrtDt.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiUpdtDt != null ? thrdPrtDataPrvdApiUpdtDt.hashCode() : 0);
        return result;
    }
}
