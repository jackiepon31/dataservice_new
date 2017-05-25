package com.fosun.fin.data.entity;

import java.sql.Date;

/**
 * Created by root on 17-5-25.
 */
public class ThrdPrtDataPrvdApiRespParm {
    private int thrdPrtDataPrvdApiRespParmId;
    private int thrdPrtDataPrvdApiId;
    private String thrdPrtDataPrvdApiRespParmNm;
    private String thrdPrtDataPrvdApiRespParmDataTypNm;
    private String thrdPrtDataPrvdApiRespParmDesc;
    private byte thrdPrtDataPrvdApiRespParmOnUseFlg;
    private String thrdPrtDataPrvdApiRespParmOwnrNm;
    private Date thrdPrtDataPrvdApiRespParmCrtDt;
    private Date thrdPrtDataPrvdApiRespParmUpdtDt;

    public int getThrdPrtDataPrvdApiRespParmId() {
        return thrdPrtDataPrvdApiRespParmId;
    }

    public void setThrdPrtDataPrvdApiRespParmId(int thrdPrtDataPrvdApiRespParmId) {
        this.thrdPrtDataPrvdApiRespParmId = thrdPrtDataPrvdApiRespParmId;
    }

    public int getThrdPrtDataPrvdApiId() {
        return thrdPrtDataPrvdApiId;
    }

    public void setThrdPrtDataPrvdApiId(int thrdPrtDataPrvdApiId) {
        this.thrdPrtDataPrvdApiId = thrdPrtDataPrvdApiId;
    }

    public String getThrdPrtDataPrvdApiRespParmNm() {
        return thrdPrtDataPrvdApiRespParmNm;
    }

    public void setThrdPrtDataPrvdApiRespParmNm(String thrdPrtDataPrvdApiRespParmNm) {
        this.thrdPrtDataPrvdApiRespParmNm = thrdPrtDataPrvdApiRespParmNm;
    }

    public String getThrdPrtDataPrvdApiRespParmDataTypNm() {
        return thrdPrtDataPrvdApiRespParmDataTypNm;
    }

    public void setThrdPrtDataPrvdApiRespParmDataTypNm(String thrdPrtDataPrvdApiRespParmDataTypNm) {
        this.thrdPrtDataPrvdApiRespParmDataTypNm = thrdPrtDataPrvdApiRespParmDataTypNm;
    }

    public String getThrdPrtDataPrvdApiRespParmDesc() {
        return thrdPrtDataPrvdApiRespParmDesc;
    }

    public void setThrdPrtDataPrvdApiRespParmDesc(String thrdPrtDataPrvdApiRespParmDesc) {
        this.thrdPrtDataPrvdApiRespParmDesc = thrdPrtDataPrvdApiRespParmDesc;
    }

    public byte getThrdPrtDataPrvdApiRespParmOnUseFlg() {
        return thrdPrtDataPrvdApiRespParmOnUseFlg;
    }

    public void setThrdPrtDataPrvdApiRespParmOnUseFlg(byte thrdPrtDataPrvdApiRespParmOnUseFlg) {
        this.thrdPrtDataPrvdApiRespParmOnUseFlg = thrdPrtDataPrvdApiRespParmOnUseFlg;
    }

    public String getThrdPrtDataPrvdApiRespParmOwnrNm() {
        return thrdPrtDataPrvdApiRespParmOwnrNm;
    }

    public void setThrdPrtDataPrvdApiRespParmOwnrNm(String thrdPrtDataPrvdApiRespParmOwnrNm) {
        this.thrdPrtDataPrvdApiRespParmOwnrNm = thrdPrtDataPrvdApiRespParmOwnrNm;
    }

    public Date getThrdPrtDataPrvdApiRespParmCrtDt() {
        return thrdPrtDataPrvdApiRespParmCrtDt;
    }

    public void setThrdPrtDataPrvdApiRespParmCrtDt(Date thrdPrtDataPrvdApiRespParmCrtDt) {
        this.thrdPrtDataPrvdApiRespParmCrtDt = thrdPrtDataPrvdApiRespParmCrtDt;
    }

    public Date getThrdPrtDataPrvdApiRespParmUpdtDt() {
        return thrdPrtDataPrvdApiRespParmUpdtDt;
    }

    public void setThrdPrtDataPrvdApiRespParmUpdtDt(Date thrdPrtDataPrvdApiRespParmUpdtDt) {
        this.thrdPrtDataPrvdApiRespParmUpdtDt = thrdPrtDataPrvdApiRespParmUpdtDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThrdPrtDataPrvdApiRespParm that = (ThrdPrtDataPrvdApiRespParm) o;

        if (thrdPrtDataPrvdApiRespParmId != that.thrdPrtDataPrvdApiRespParmId) return false;
        if (thrdPrtDataPrvdApiId != that.thrdPrtDataPrvdApiId) return false;
        if (thrdPrtDataPrvdApiRespParmOnUseFlg != that.thrdPrtDataPrvdApiRespParmOnUseFlg) return false;
        if (thrdPrtDataPrvdApiRespParmNm != null ? !thrdPrtDataPrvdApiRespParmNm.equals(that.thrdPrtDataPrvdApiRespParmNm) : that.thrdPrtDataPrvdApiRespParmNm != null)
            return false;
        if (thrdPrtDataPrvdApiRespParmDataTypNm != null ? !thrdPrtDataPrvdApiRespParmDataTypNm.equals(that.thrdPrtDataPrvdApiRespParmDataTypNm) : that.thrdPrtDataPrvdApiRespParmDataTypNm != null)
            return false;
        if (thrdPrtDataPrvdApiRespParmDesc != null ? !thrdPrtDataPrvdApiRespParmDesc.equals(that.thrdPrtDataPrvdApiRespParmDesc) : that.thrdPrtDataPrvdApiRespParmDesc != null)
            return false;
        if (thrdPrtDataPrvdApiRespParmOwnrNm != null ? !thrdPrtDataPrvdApiRespParmOwnrNm.equals(that.thrdPrtDataPrvdApiRespParmOwnrNm) : that.thrdPrtDataPrvdApiRespParmOwnrNm != null)
            return false;
        if (thrdPrtDataPrvdApiRespParmCrtDt != null ? !thrdPrtDataPrvdApiRespParmCrtDt.equals(that.thrdPrtDataPrvdApiRespParmCrtDt) : that.thrdPrtDataPrvdApiRespParmCrtDt != null)
            return false;
        if (thrdPrtDataPrvdApiRespParmUpdtDt != null ? !thrdPrtDataPrvdApiRespParmUpdtDt.equals(that.thrdPrtDataPrvdApiRespParmUpdtDt) : that.thrdPrtDataPrvdApiRespParmUpdtDt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = thrdPrtDataPrvdApiRespParmId;
        result = 31 * result + thrdPrtDataPrvdApiId;
        result = 31 * result + (thrdPrtDataPrvdApiRespParmNm != null ? thrdPrtDataPrvdApiRespParmNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiRespParmDataTypNm != null ? thrdPrtDataPrvdApiRespParmDataTypNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiRespParmDesc != null ? thrdPrtDataPrvdApiRespParmDesc.hashCode() : 0);
        result = 31 * result + (int) thrdPrtDataPrvdApiRespParmOnUseFlg;
        result = 31 * result + (thrdPrtDataPrvdApiRespParmOwnrNm != null ? thrdPrtDataPrvdApiRespParmOwnrNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiRespParmCrtDt != null ? thrdPrtDataPrvdApiRespParmCrtDt.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiRespParmUpdtDt != null ? thrdPrtDataPrvdApiRespParmUpdtDt.hashCode() : 0);
        return result;
    }
}
