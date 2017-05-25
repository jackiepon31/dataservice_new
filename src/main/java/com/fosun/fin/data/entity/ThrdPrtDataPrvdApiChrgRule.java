package com.fosun.fin.data.entity;

import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by root on 17-5-25.
 */
public class ThrdPrtDataPrvdApiChrgRule {
    private int thrdPrtDataPrvdApiId;
    private String thrdPrtDataPrvdApiChrgTypNm;
    private BigDecimal thrdPrtDataPrvdApiChrgPrcNr;
    private String thrdPrtDataPrvdApiChrgLogicTxt;
    private byte thrdPrtDataPrvdApiChrgRuleOnUseFlg;
    private String thrdPrtDataPrvdApiChrgRuleOwnrNm;
    private Date thrdPrtDataPrvdApiChrgRuleCrtDt;
    private Date thrdPrtDataPrvdApiChrgRuleUpdtDt;

    public int getThrdPrtDataPrvdApiId() {
        return thrdPrtDataPrvdApiId;
    }

    public void setThrdPrtDataPrvdApiId(int thrdPrtDataPrvdApiId) {
        this.thrdPrtDataPrvdApiId = thrdPrtDataPrvdApiId;
    }

    public String getThrdPrtDataPrvdApiChrgTypNm() {
        return thrdPrtDataPrvdApiChrgTypNm;
    }

    public void setThrdPrtDataPrvdApiChrgTypNm(String thrdPrtDataPrvdApiChrgTypNm) {
        this.thrdPrtDataPrvdApiChrgTypNm = thrdPrtDataPrvdApiChrgTypNm;
    }

    public BigDecimal getThrdPrtDataPrvdApiChrgPrcNr() {
        return thrdPrtDataPrvdApiChrgPrcNr;
    }

    public void setThrdPrtDataPrvdApiChrgPrcNr(BigDecimal thrdPrtDataPrvdApiChrgPrcNr) {
        this.thrdPrtDataPrvdApiChrgPrcNr = thrdPrtDataPrvdApiChrgPrcNr;
    }

    public String getThrdPrtDataPrvdApiChrgLogicTxt() {
        return thrdPrtDataPrvdApiChrgLogicTxt;
    }

    public void setThrdPrtDataPrvdApiChrgLogicTxt(String thrdPrtDataPrvdApiChrgLogicTxt) {
        this.thrdPrtDataPrvdApiChrgLogicTxt = thrdPrtDataPrvdApiChrgLogicTxt;
    }

    public byte getThrdPrtDataPrvdApiChrgRuleOnUseFlg() {
        return thrdPrtDataPrvdApiChrgRuleOnUseFlg;
    }

    public void setThrdPrtDataPrvdApiChrgRuleOnUseFlg(byte thrdPrtDataPrvdApiChrgRuleOnUseFlg) {
        this.thrdPrtDataPrvdApiChrgRuleOnUseFlg = thrdPrtDataPrvdApiChrgRuleOnUseFlg;
    }

    public String getThrdPrtDataPrvdApiChrgRuleOwnrNm() {
        return thrdPrtDataPrvdApiChrgRuleOwnrNm;
    }

    public void setThrdPrtDataPrvdApiChrgRuleOwnrNm(String thrdPrtDataPrvdApiChrgRuleOwnrNm) {
        this.thrdPrtDataPrvdApiChrgRuleOwnrNm = thrdPrtDataPrvdApiChrgRuleOwnrNm;
    }

    public Date getThrdPrtDataPrvdApiChrgRuleCrtDt() {
        return thrdPrtDataPrvdApiChrgRuleCrtDt;
    }

    public void setThrdPrtDataPrvdApiChrgRuleCrtDt(Date thrdPrtDataPrvdApiChrgRuleCrtDt) {
        this.thrdPrtDataPrvdApiChrgRuleCrtDt = thrdPrtDataPrvdApiChrgRuleCrtDt;
    }

    public Date getThrdPrtDataPrvdApiChrgRuleUpdtDt() {
        return thrdPrtDataPrvdApiChrgRuleUpdtDt;
    }

    public void setThrdPrtDataPrvdApiChrgRuleUpdtDt(Date thrdPrtDataPrvdApiChrgRuleUpdtDt) {
        this.thrdPrtDataPrvdApiChrgRuleUpdtDt = thrdPrtDataPrvdApiChrgRuleUpdtDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThrdPrtDataPrvdApiChrgRule that = (ThrdPrtDataPrvdApiChrgRule) o;

        if (thrdPrtDataPrvdApiId != that.thrdPrtDataPrvdApiId) return false;
        if (thrdPrtDataPrvdApiChrgRuleOnUseFlg != that.thrdPrtDataPrvdApiChrgRuleOnUseFlg) return false;
        if (thrdPrtDataPrvdApiChrgTypNm != null ? !thrdPrtDataPrvdApiChrgTypNm.equals(that.thrdPrtDataPrvdApiChrgTypNm) : that.thrdPrtDataPrvdApiChrgTypNm != null)
            return false;
        if (thrdPrtDataPrvdApiChrgPrcNr != null ? !thrdPrtDataPrvdApiChrgPrcNr.equals(that.thrdPrtDataPrvdApiChrgPrcNr) : that.thrdPrtDataPrvdApiChrgPrcNr != null)
            return false;
        if (thrdPrtDataPrvdApiChrgLogicTxt != null ? !thrdPrtDataPrvdApiChrgLogicTxt.equals(that.thrdPrtDataPrvdApiChrgLogicTxt) : that.thrdPrtDataPrvdApiChrgLogicTxt != null)
            return false;
        if (thrdPrtDataPrvdApiChrgRuleOwnrNm != null ? !thrdPrtDataPrvdApiChrgRuleOwnrNm.equals(that.thrdPrtDataPrvdApiChrgRuleOwnrNm) : that.thrdPrtDataPrvdApiChrgRuleOwnrNm != null)
            return false;
        if (thrdPrtDataPrvdApiChrgRuleCrtDt != null ? !thrdPrtDataPrvdApiChrgRuleCrtDt.equals(that.thrdPrtDataPrvdApiChrgRuleCrtDt) : that.thrdPrtDataPrvdApiChrgRuleCrtDt != null)
            return false;
        if (thrdPrtDataPrvdApiChrgRuleUpdtDt != null ? !thrdPrtDataPrvdApiChrgRuleUpdtDt.equals(that.thrdPrtDataPrvdApiChrgRuleUpdtDt) : that.thrdPrtDataPrvdApiChrgRuleUpdtDt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = thrdPrtDataPrvdApiId;
        result = 31 * result + (thrdPrtDataPrvdApiChrgTypNm != null ? thrdPrtDataPrvdApiChrgTypNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiChrgPrcNr != null ? thrdPrtDataPrvdApiChrgPrcNr.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiChrgLogicTxt != null ? thrdPrtDataPrvdApiChrgLogicTxt.hashCode() : 0);
        result = 31 * result + (int) thrdPrtDataPrvdApiChrgRuleOnUseFlg;
        result = 31 * result + (thrdPrtDataPrvdApiChrgRuleOwnrNm != null ? thrdPrtDataPrvdApiChrgRuleOwnrNm.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiChrgRuleCrtDt != null ? thrdPrtDataPrvdApiChrgRuleCrtDt.hashCode() : 0);
        result = 31 * result + (thrdPrtDataPrvdApiChrgRuleUpdtDt != null ? thrdPrtDataPrvdApiChrgRuleUpdtDt.hashCode() : 0);
        return result;
    }
}
