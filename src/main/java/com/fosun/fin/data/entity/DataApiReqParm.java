package com.fosun.fin.data.entity;

import java.sql.Date;

/**
 * Created by root on 17-5-25.
 */
public class DataApiReqParm {
    private int dataApiReqParmId;
    private int dataApiId;
    private String dataApiReqParmNm;
    private String dataApiReqParmDataTypNm;
    private String dataApiReqParmDesc;
    private byte dataApiReqParmOnUseFlg;
    private Date dataApiReqParmCrtDt;
    private Date dataApiReqParmUpdtDt;

    public int getDataApiReqParmId() {
        return dataApiReqParmId;
    }

    public void setDataApiReqParmId(int dataApiReqParmId) {
        this.dataApiReqParmId = dataApiReqParmId;
    }

    public int getDataApiId() {
        return dataApiId;
    }

    public void setDataApiId(int dataApiId) {
        this.dataApiId = dataApiId;
    }

    public String getDataApiReqParmNm() {
        return dataApiReqParmNm;
    }

    public void setDataApiReqParmNm(String dataApiReqParmNm) {
        this.dataApiReqParmNm = dataApiReqParmNm;
    }

    public String getDataApiReqParmDataTypNm() {
        return dataApiReqParmDataTypNm;
    }

    public void setDataApiReqParmDataTypNm(String dataApiReqParmDataTypNm) {
        this.dataApiReqParmDataTypNm = dataApiReqParmDataTypNm;
    }

    public String getDataApiReqParmDesc() {
        return dataApiReqParmDesc;
    }

    public void setDataApiReqParmDesc(String dataApiReqParmDesc) {
        this.dataApiReqParmDesc = dataApiReqParmDesc;
    }

    public byte getDataApiReqParmOnUseFlg() {
        return dataApiReqParmOnUseFlg;
    }

    public void setDataApiReqParmOnUseFlg(byte dataApiReqParmOnUseFlg) {
        this.dataApiReqParmOnUseFlg = dataApiReqParmOnUseFlg;
    }

    public Date getDataApiReqParmCrtDt() {
        return dataApiReqParmCrtDt;
    }

    public void setDataApiReqParmCrtDt(Date dataApiReqParmCrtDt) {
        this.dataApiReqParmCrtDt = dataApiReqParmCrtDt;
    }

    public Date getDataApiReqParmUpdtDt() {
        return dataApiReqParmUpdtDt;
    }

    public void setDataApiReqParmUpdtDt(Date dataApiReqParmUpdtDt) {
        this.dataApiReqParmUpdtDt = dataApiReqParmUpdtDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataApiReqParm that = (DataApiReqParm) o;

        if (dataApiReqParmId != that.dataApiReqParmId) return false;
        if (dataApiId != that.dataApiId) return false;
        if (dataApiReqParmOnUseFlg != that.dataApiReqParmOnUseFlg) return false;
        if (dataApiReqParmNm != null ? !dataApiReqParmNm.equals(that.dataApiReqParmNm) : that.dataApiReqParmNm != null)
            return false;
        if (dataApiReqParmDataTypNm != null ? !dataApiReqParmDataTypNm.equals(that.dataApiReqParmDataTypNm) : that.dataApiReqParmDataTypNm != null)
            return false;
        if (dataApiReqParmDesc != null ? !dataApiReqParmDesc.equals(that.dataApiReqParmDesc) : that.dataApiReqParmDesc != null)
            return false;
        if (dataApiReqParmCrtDt != null ? !dataApiReqParmCrtDt.equals(that.dataApiReqParmCrtDt) : that.dataApiReqParmCrtDt != null)
            return false;
        if (dataApiReqParmUpdtDt != null ? !dataApiReqParmUpdtDt.equals(that.dataApiReqParmUpdtDt) : that.dataApiReqParmUpdtDt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dataApiReqParmId;
        result = 31 * result + dataApiId;
        result = 31 * result + (dataApiReqParmNm != null ? dataApiReqParmNm.hashCode() : 0);
        result = 31 * result + (dataApiReqParmDataTypNm != null ? dataApiReqParmDataTypNm.hashCode() : 0);
        result = 31 * result + (dataApiReqParmDesc != null ? dataApiReqParmDesc.hashCode() : 0);
        result = 31 * result + (int) dataApiReqParmOnUseFlg;
        result = 31 * result + (dataApiReqParmCrtDt != null ? dataApiReqParmCrtDt.hashCode() : 0);
        result = 31 * result + (dataApiReqParmUpdtDt != null ? dataApiReqParmUpdtDt.hashCode() : 0);
        return result;
    }
}
