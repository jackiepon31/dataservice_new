package com.fosun.fin.data.entity;

import java.sql.Date;

/**
 * Created by root on 17-5-25.
 */
public class ThrdPrtDataPrvdApiReqParm {
    private int thrdPrtDataPrvdApiReqParmId;
    private int thrdPrtDataPrvdApiId;
    private String thrdPrtDataPrvdApiReqParmNm;
    private String thrdPrtDataPrvdApiReqParmDataTypNm;
    private String thrdPrtDataPrvdApiReqParmDesc;
    private byte thrdPrtDataPrvdApiReqParmOnUseFlg;
    private String thrdPrtDataPrvdApiReqParmOwnrNm;
    private Date thrdPrtDataPrvdApiReqParmCrtDt;
    private Date thrdPrtDataPrvdApiReqParmUpdtDt;

    public int getThrdPrtDataPrvdApiReqParmId() {
        return thrdPrtDataPrvdApiReqParmId;
    }

    public void setThrdPrtDataPrvdApiReqParmId(int thrdPrtDataPrvdApiReqParmId) {
        this.thrdPrtDataPrvdApiReqParmId = thrdPrtDataPrvdApiReqParmId;
    }

    public int getThrdPrtDataPrvdApiId() {
        return thrdPrtDataPrvdApiId;
    }

    public void setThrdPrtDataPrvdApiId(int thrdPrtDataPrvdApiId) {
        this.thrdPrtDataPrvdApiId = thrdPrtDataPrvdApiId;
    }

    public String getThrdPrtDataPrvdApiReqParmNm() {
        return thrdPrtDataPrvdApiReqParmNm;
    }

    public void setThrdPrtDataPrvdApiReqParmNm(String thrdPrtDataPrvdApiReqParmNm) {
        this.thrdPrtDataPrvdApiReqParmNm = thrdPrtDataPrvdApiReqParmNm;
    }

    public String getThrdPrtDataPrvdApiReqParmDataTypNm() {
        return thrdPrtDataPrvdApiReqParmDataTypNm;
    }

    public void setThrdPrtDataPrvdApiReqParmDataTypNm(String thrdPrtDataPrvdApiReqParmDataTypNm) {
        this.thrdPrtDataPrvdApiReqParmDataTypNm = thrdPrtDataPrvdApiReqParmDataTypNm;
    }

    public String getThrdPrtDataPrvdApiReqParmDesc() {
        return thrdPrtDataPrvdApiReqParmDesc;
    }

    public void setThrdPrtDataPrvdApiReqParmDesc(String thrdPrtDataPrvdApiReqParmDesc) {
        this.thrdPrtDataPrvdApiReqParmDesc = thrdPrtDataPrvdApiReqParmDesc;
    }

    public byte getThrdPrtDataPrvdApiReqParmOnUseFlg() {
        return thrdPrtDataPrvdApiReqParmOnUseFlg;
    }

    public void setThrdPrtDataPrvdApiReqParmOnUseFlg(byte thrdPrtDataPrvdApiReqParmOnUseFlg) {
        this.thrdPrtDataPrvdApiReqParmOnUseFlg = thrdPrtDataPrvdApiReqParmOnUseFlg;
    }

    public String getThrdPrtDataPrvdApiReqParmOwnrNm() {
        return thrdPrtDataPrvdApiReqParmOwnrNm;
    }

    public void setThrdPrtDataPrvdApiReqParmOwnrNm(String thrdPrtDataPrvdApiReqParmOwnrNm) {
        this.thrdPrtDataPrvdApiReqParmOwnrNm = thrdPrtDataPrvdApiReqParmOwnrNm;
    }

    public Date getThrdPrtDataPrvdApiReqParmCrtDt() {
        return thrdPrtDataPrvdApiReqParmCrtDt;
    }

    public void setThrdPrtDataPrvdApiReqParmCrtDt(Date thrdPrtDataPrvdApiReqParmCrtDt) {
        this.thrdPrtDataPrvdApiReqParmCrtDt = thrdPrtDataPrvdApiReqParmCrtDt;
    }

    public Date getThrdPrtDataPrvdApiReqParmUpdtDt() {
        return thrdPrtDataPrvdApiReqParmUpdtDt;
    }

    public void setThrdPrtDataPrvdApiReqParmUpdtDt(Date thrdPrtDataPrvdApiReqParmUpdtDt) {
        this.thrdPrtDataPrvdApiReqParmUpdtDt = thrdPrtDataPrvdApiReqParmUpdtDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThrdPrtDataPrvdApiReqParm that = (ThrdPrtDataPrvdApiReqParm) o;

        if (thrdPrtDataPrvdApiReqParmId != that.thrdPrtDataPrvdApiReqParmId) return false;
        if (thrdPrtDataPrvdApiId != that.thrdPrtDataPrvdApiId) return false;
        if (thrdPrtDataPrvdApiReqParmOnUseFlg != that.thrdPrtDataPrvdApiReqParmOnUseFlg) return false;
        if (thrdPrtDataPrvdApiReqParmNm != null ? !thrdPrtDataPrvdApiReqParmNm.equals(that.thrdPrtDataPrvdApiReqParmNm) : that.thrdPrtDataPrvdApiReqParmNm != null)
            return false;
        if (thrdPrtDataPrvdApiReqParmDataTypNm != null ? !thrdPrtDataPrvdApiReqParmDataTypNm.equals(that.thrdPrtDataPrvdApiReqParmDataTypNm) : that.thrdPrtDataPrvdApiReqParmDataTypNm != null)
            return false;
        if (thrdPrtDataPrvdApiReqParmDesc != null ? !thrdPrtDataPrvdApiReqParmDesc.equals(that.thrdPrtDataPrvdApiReqParmDesc) : that.thrdPrtDataPrvdApiReqParmDesc != null)
            return false;
        if (thrdPrtDataPrvdApiReqParmOwnrNm != null ? !thrdPrtDataPrvdApiReqParmOwnrNm.equals(that.thrdPrtDataPrvdApiReqParmOwnrNm) : that.thrdPrtDataPrvdApiReqParmOwnrNm != null)
            return false;
        if (thrdPrtDataPrvdApiReqParmCrtDt != null ? !thrdPrtDataPrvdApiReqParmCrtDt.equals(that.thrdPrtDataPrvdApiReqParmCrtDt) : that.thrdPrtDataPrvdApiReqParmCrtDt != null)
            return false;
        if (thrdPrtDataPrvdApiReqParmUpdtDt != null ? !thrdPrtDataPrvdApiReqParmUpdtDt.equals(that.thrdPrtDataPrvdApiReqParmUpdtDt) : that.thrdPrtDataPrvdApiReqParmUpdtDt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = thrdPrtDataPrvdApiReqParmId;
        result = 31 * result + thrdPrtDataPrvdApiId;
        result = 31 * result + (thrdPrtDataPrvdApiReqParmNm != null ? thrdPrtDataPrvdApiReqParmNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiReqParmDataTypNm != null ? thrdPrtDataPrvdApiReqParmDataTypNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiReqParmDesc != null ? thrdPrtDataPrvdApiReqParmDesc.hashCode() : 0);
        result = 31 * result + (int) thrdPrtDataPrvdApiReqParmOnUseFlg;
        result = 31 * result + (thrdPrtDataPrvdApiReqParmOwnrNm != null ? thrdPrtDataPrvdApiReqParmOwnrNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiReqParmCrtDt != null ? thrdPrtDataPrvdApiReqParmCrtDt.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiReqParmUpdtDt != null ? thrdPrtDataPrvdApiReqParmUpdtDt.hashCode() : 0);
        return result;
    }
}
