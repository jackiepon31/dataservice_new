package com.fosun.fin.data.entity;

import java.sql.Date;

/**
 * Created by root on 17-5-25.
 */
public class ThrdPrtDataPrvdApiChrgRuleParm {
    private int thrdPrtDataPrvdApiChrgRuleParmId;
    private int thrdPrtDataPrvdApiId;
    private String thrdPrtDataPrvdApiChrgRuleParmNm;
    private String thrdPrtDataPrvdApiChrgRuleParmValTxt;
    private byte thrdPrtDataPrvdApiChrgRuleParmOnUseFlg;
    private String thrdPrtDataPrvdApiChrgRuleParmOwnrNm;
    private Date thrdPrtDataPrvdApiChrgRuleParmCrtDt;
    private Date thrdPrtDataPrvdApiChrgRuleParmUpdtDt;

    public int getThrdPrtDataPrvdApiChrgRuleParmId() {
        return thrdPrtDataPrvdApiChrgRuleParmId;
    }

    public void setThrdPrtDataPrvdApiChrgRuleParmId(int thrdPrtDataPrvdApiChrgRuleParmId) {
        this.thrdPrtDataPrvdApiChrgRuleParmId = thrdPrtDataPrvdApiChrgRuleParmId;
    }

    public int getThrdPrtDataPrvdApiId() {
        return thrdPrtDataPrvdApiId;
    }

    public void setThrdPrtDataPrvdApiId(int thrdPrtDataPrvdApiId) {
        this.thrdPrtDataPrvdApiId = thrdPrtDataPrvdApiId;
    }

    public String getThrdPrtDataPrvdApiChrgRuleParmNm() {
        return thrdPrtDataPrvdApiChrgRuleParmNm;
    }

    public void setThrdPrtDataPrvdApiChrgRuleParmNm(String thrdPrtDataPrvdApiChrgRuleParmNm) {
        this.thrdPrtDataPrvdApiChrgRuleParmNm = thrdPrtDataPrvdApiChrgRuleParmNm;
    }

    public String getThrdPrtDataPrvdApiChrgRuleParmValTxt() {
        return thrdPrtDataPrvdApiChrgRuleParmValTxt;
    }

    public void setThrdPrtDataPrvdApiChrgRuleParmValTxt(String thrdPrtDataPrvdApiChrgRuleParmValTxt) {
        this.thrdPrtDataPrvdApiChrgRuleParmValTxt = thrdPrtDataPrvdApiChrgRuleParmValTxt;
    }

    public byte getThrdPrtDataPrvdApiChrgRuleParmOnUseFlg() {
        return thrdPrtDataPrvdApiChrgRuleParmOnUseFlg;
    }

    public void setThrdPrtDataPrvdApiChrgRuleParmOnUseFlg(byte thrdPrtDataPrvdApiChrgRuleParmOnUseFlg) {
        this.thrdPrtDataPrvdApiChrgRuleParmOnUseFlg = thrdPrtDataPrvdApiChrgRuleParmOnUseFlg;
    }

    public String getThrdPrtDataPrvdApiChrgRuleParmOwnrNm() {
        return thrdPrtDataPrvdApiChrgRuleParmOwnrNm;
    }

    public void setThrdPrtDataPrvdApiChrgRuleParmOwnrNm(String thrdPrtDataPrvdApiChrgRuleParmOwnrNm) {
        this.thrdPrtDataPrvdApiChrgRuleParmOwnrNm = thrdPrtDataPrvdApiChrgRuleParmOwnrNm;
    }

    public Date getThrdPrtDataPrvdApiChrgRuleParmCrtDt() {
        return thrdPrtDataPrvdApiChrgRuleParmCrtDt;
    }

    public void setThrdPrtDataPrvdApiChrgRuleParmCrtDt(Date thrdPrtDataPrvdApiChrgRuleParmCrtDt) {
        this.thrdPrtDataPrvdApiChrgRuleParmCrtDt = thrdPrtDataPrvdApiChrgRuleParmCrtDt;
    }

    public Date getThrdPrtDataPrvdApiChrgRuleParmUpdtDt() {
        return thrdPrtDataPrvdApiChrgRuleParmUpdtDt;
    }

    public void setThrdPrtDataPrvdApiChrgRuleParmUpdtDt(Date thrdPrtDataPrvdApiChrgRuleParmUpdtDt) {
        this.thrdPrtDataPrvdApiChrgRuleParmUpdtDt = thrdPrtDataPrvdApiChrgRuleParmUpdtDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThrdPrtDataPrvdApiChrgRuleParm that = (ThrdPrtDataPrvdApiChrgRuleParm) o;

        if (thrdPrtDataPrvdApiChrgRuleParmId != that.thrdPrtDataPrvdApiChrgRuleParmId) return false;
        if (thrdPrtDataPrvdApiId != that.thrdPrtDataPrvdApiId) return false;
        if (thrdPrtDataPrvdApiChrgRuleParmOnUseFlg != that.thrdPrtDataPrvdApiChrgRuleParmOnUseFlg) return false;
        if (thrdPrtDataPrvdApiChrgRuleParmNm != null ? !thrdPrtDataPrvdApiChrgRuleParmNm.equals(that.thrdPrtDataPrvdApiChrgRuleParmNm) : that.thrdPrtDataPrvdApiChrgRuleParmNm != null)
            return false;
        if (thrdPrtDataPrvdApiChrgRuleParmValTxt != null ? !thrdPrtDataPrvdApiChrgRuleParmValTxt.equals(that.thrdPrtDataPrvdApiChrgRuleParmValTxt) : that.thrdPrtDataPrvdApiChrgRuleParmValTxt != null)
            return false;
        if (thrdPrtDataPrvdApiChrgRuleParmOwnrNm != null ? !thrdPrtDataPrvdApiChrgRuleParmOwnrNm.equals(that.thrdPrtDataPrvdApiChrgRuleParmOwnrNm) : that.thrdPrtDataPrvdApiChrgRuleParmOwnrNm != null)
            return false;
        if (thrdPrtDataPrvdApiChrgRuleParmCrtDt != null ? !thrdPrtDataPrvdApiChrgRuleParmCrtDt.equals(that.thrdPrtDataPrvdApiChrgRuleParmCrtDt) : that.thrdPrtDataPrvdApiChrgRuleParmCrtDt != null)
            return false;
        if (thrdPrtDataPrvdApiChrgRuleParmUpdtDt != null ? !thrdPrtDataPrvdApiChrgRuleParmUpdtDt.equals(that.thrdPrtDataPrvdApiChrgRuleParmUpdtDt) : that.thrdPrtDataPrvdApiChrgRuleParmUpdtDt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = thrdPrtDataPrvdApiChrgRuleParmId;
        result = 31 * result + thrdPrtDataPrvdApiId;
        result = 31 * result + (thrdPrtDataPrvdApiChrgRuleParmNm != null ? thrdPrtDataPrvdApiChrgRuleParmNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiChrgRuleParmValTxt != null ? thrdPrtDataPrvdApiChrgRuleParmValTxt.hashCode() : 0);
        result = 31 * result + (int) thrdPrtDataPrvdApiChrgRuleParmOnUseFlg;
        result = 31 * result + (thrdPrtDataPrvdApiChrgRuleParmOwnrNm != null ? thrdPrtDataPrvdApiChrgRuleParmOwnrNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiChrgRuleParmCrtDt != null ? thrdPrtDataPrvdApiChrgRuleParmCrtDt.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiChrgRuleParmUpdtDt != null ? thrdPrtDataPrvdApiChrgRuleParmUpdtDt.hashCode() : 0);
        return result;
    }
}
