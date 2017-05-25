package com.fosun.fin.data.entity;

import java.sql.Date;
import java.util.Arrays;

/**
 * Created by root on 17-5-25.
 */
public class ThrdPrtDataPrvdInfo {
    private int thrdPrtDataPrvdId;
    private String thrdPrtDataPrvdNm;
    private String thrdPrtDataPrvdUriAddr;
    private String thrdPrtDataPrvdUsrNm;
    private String thrdPrtDataPrvdPwd;
    private byte[] thrdPrtDataPrvdCertAtch;
    private byte thrdPrtDataPrvdOnUseFlg;
    private String thrdPrtDataPrvdBusOwnrNm;
    private String thrdPrtDataPrvdTechOwnrNm;
    private Date thrdPrtDataPrvdCrtDt;
    private Date thrdPrtDataPrvdUpdtDt;

    public int getThrdPrtDataPrvdId() {
        return thrdPrtDataPrvdId;
    }

    public void setThrdPrtDataPrvdId(int thrdPrtDataPrvdId) {
        this.thrdPrtDataPrvdId = thrdPrtDataPrvdId;
    }

    public String getThrdPrtDataPrvdNm() {
        return thrdPrtDataPrvdNm;
    }

    public void setThrdPrtDataPrvdNm(String thrdPrtDataPrvdNm) {
        this.thrdPrtDataPrvdNm = thrdPrtDataPrvdNm;
    }

    public String getThrdPrtDataPrvdUriAddr() {
        return thrdPrtDataPrvdUriAddr;
    }

    public void setThrdPrtDataPrvdUriAddr(String thrdPrtDataPrvdUriAddr) {
        this.thrdPrtDataPrvdUriAddr = thrdPrtDataPrvdUriAddr;
    }

    public String getThrdPrtDataPrvdUsrNm() {
        return thrdPrtDataPrvdUsrNm;
    }

    public void setThrdPrtDataPrvdUsrNm(String thrdPrtDataPrvdUsrNm) {
        this.thrdPrtDataPrvdUsrNm = thrdPrtDataPrvdUsrNm;
    }

    public String getThrdPrtDataPrvdPwd() {
        return thrdPrtDataPrvdPwd;
    }

    public void setThrdPrtDataPrvdPwd(String thrdPrtDataPrvdPwd) {
        this.thrdPrtDataPrvdPwd = thrdPrtDataPrvdPwd;
    }

    public byte[] getThrdPrtDataPrvdCertAtch() {
        return thrdPrtDataPrvdCertAtch;
    }

    public void setThrdPrtDataPrvdCertAtch(byte[] thrdPrtDataPrvdCertAtch) {
        this.thrdPrtDataPrvdCertAtch = thrdPrtDataPrvdCertAtch;
    }

    public byte getThrdPrtDataPrvdOnUseFlg() {
        return thrdPrtDataPrvdOnUseFlg;
    }

    public void setThrdPrtDataPrvdOnUseFlg(byte thrdPrtDataPrvdOnUseFlg) {
        this.thrdPrtDataPrvdOnUseFlg = thrdPrtDataPrvdOnUseFlg;
    }

    public String getThrdPrtDataPrvdBusOwnrNm() {
        return thrdPrtDataPrvdBusOwnrNm;
    }

    public void setThrdPrtDataPrvdBusOwnrNm(String thrdPrtDataPrvdBusOwnrNm) {
        this.thrdPrtDataPrvdBusOwnrNm = thrdPrtDataPrvdBusOwnrNm;
    }

    public String getThrdPrtDataPrvdTechOwnrNm() {
        return thrdPrtDataPrvdTechOwnrNm;
    }

    public void setThrdPrtDataPrvdTechOwnrNm(String thrdPrtDataPrvdTechOwnrNm) {
        this.thrdPrtDataPrvdTechOwnrNm = thrdPrtDataPrvdTechOwnrNm;
    }

    public Date getThrdPrtDataPrvdCrtDt() {
        return thrdPrtDataPrvdCrtDt;
    }

    public void setThrdPrtDataPrvdCrtDt(Date thrdPrtDataPrvdCrtDt) {
        this.thrdPrtDataPrvdCrtDt = thrdPrtDataPrvdCrtDt;
    }

    public Date getThrdPrtDataPrvdUpdtDt() {
        return thrdPrtDataPrvdUpdtDt;
    }

    public void setThrdPrtDataPrvdUpdtDt(Date thrdPrtDataPrvdUpdtDt) {
        this.thrdPrtDataPrvdUpdtDt = thrdPrtDataPrvdUpdtDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThrdPrtDataPrvdInfo that = (ThrdPrtDataPrvdInfo) o;

        if (thrdPrtDataPrvdId != that.thrdPrtDataPrvdId) return false;
        if (thrdPrtDataPrvdOnUseFlg != that.thrdPrtDataPrvdOnUseFlg) return false;
        if (thrdPrtDataPrvdNm != null ? !thrdPrtDataPrvdNm.equals(that.thrdPrtDataPrvdNm) : that.thrdPrtDataPrvdNm != null)
            return false;
        if (thrdPrtDataPrvdUriAddr != null ? !thrdPrtDataPrvdUriAddr.equals(that.thrdPrtDataPrvdUriAddr) : that.thrdPrtDataPrvdUriAddr != null)
            return false;
        if (thrdPrtDataPrvdUsrNm != null ? !thrdPrtDataPrvdUsrNm.equals(that.thrdPrtDataPrvdUsrNm) : that.thrdPrtDataPrvdUsrNm != null)
            return false;
        if (thrdPrtDataPrvdPwd != null ? !thrdPrtDataPrvdPwd.equals(that.thrdPrtDataPrvdPwd) : that.thrdPrtDataPrvdPwd != null)
            return false;
        if (!Arrays.equals(thrdPrtDataPrvdCertAtch, that.thrdPrtDataPrvdCertAtch)) return false;
        if (thrdPrtDataPrvdBusOwnrNm != null ? !thrdPrtDataPrvdBusOwnrNm.equals(that.thrdPrtDataPrvdBusOwnrNm) : that.thrdPrtDataPrvdBusOwnrNm != null)
            return false;
        if (thrdPrtDataPrvdTechOwnrNm != null ? !thrdPrtDataPrvdTechOwnrNm.equals(that.thrdPrtDataPrvdTechOwnrNm) : that.thrdPrtDataPrvdTechOwnrNm != null)
            return false;
        if (thrdPrtDataPrvdCrtDt != null ? !thrdPrtDataPrvdCrtDt.equals(that.thrdPrtDataPrvdCrtDt) : that.thrdPrtDataPrvdCrtDt != null)
            return false;
        if (thrdPrtDataPrvdUpdtDt != null ? !thrdPrtDataPrvdUpdtDt.equals(that.thrdPrtDataPrvdUpdtDt) : that.thrdPrtDataPrvdUpdtDt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = thrdPrtDataPrvdId;
        result = 31 * result + (thrdPrtDataPrvdNm != null ? thrdPrtDataPrvdNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdUriAddr != null ? thrdPrtDataPrvdUriAddr.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdUsrNm != null ? thrdPrtDataPrvdUsrNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdPwd != null ? thrdPrtDataPrvdPwd.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(thrdPrtDataPrvdCertAtch);
        result = 31 * result + (int) thrdPrtDataPrvdOnUseFlg;
        result = 31 * result + (thrdPrtDataPrvdBusOwnrNm != null ? thrdPrtDataPrvdBusOwnrNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdTechOwnrNm != null ? thrdPrtDataPrvdTechOwnrNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdCrtDt != null ? thrdPrtDataPrvdCrtDt.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdUpdtDt != null ? thrdPrtDataPrvdUpdtDt.hashCode() : 0);
        return result;
    }
}
