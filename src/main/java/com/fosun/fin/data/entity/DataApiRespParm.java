package com.fosun.fin.data.entity;

import java.sql.Date;

/**
 * Created by root on 17-5-25.
 */
public class DataApiRespParm {
    private int dataApiRespParmId;
    private int dataApiId;
    private String dataApiRespParmNm;
    private String dataApiRespParmDataTypNm;
    private String dataApiRespParmDesc;
    private byte dataApiRespParmOnUseFlg;
    private Date dataApiRespParmCrtDt;
    private Date dataApiRespParmUpdtDt;

    public int getDataApiRespParmId() {
        return dataApiRespParmId;
    }

    public void setDataApiRespParmId(int dataApiRespParmId) {
        this.dataApiRespParmId = dataApiRespParmId;
    }

    public int getDataApiId() {
        return dataApiId;
    }

    public void setDataApiId(int dataApiId) {
        this.dataApiId = dataApiId;
    }

    public String getDataApiRespParmNm() {
        return dataApiRespParmNm;
    }

    public void setDataApiRespParmNm(String dataApiRespParmNm) {
        this.dataApiRespParmNm = dataApiRespParmNm;
    }

    public String getDataApiRespParmDataTypNm() {
        return dataApiRespParmDataTypNm;
    }

    public void setDataApiRespParmDataTypNm(String dataApiRespParmDataTypNm) {
        this.dataApiRespParmDataTypNm = dataApiRespParmDataTypNm;
    }

    public String getDataApiRespParmDesc() {
        return dataApiRespParmDesc;
    }

    public void setDataApiRespParmDesc(String dataApiRespParmDesc) {
        this.dataApiRespParmDesc = dataApiRespParmDesc;
    }

    public byte getDataApiRespParmOnUseFlg() {
        return dataApiRespParmOnUseFlg;
    }

    public void setDataApiRespParmOnUseFlg(byte dataApiRespParmOnUseFlg) {
        this.dataApiRespParmOnUseFlg = dataApiRespParmOnUseFlg;
    }

    public Date getDataApiRespParmCrtDt() {
        return dataApiRespParmCrtDt;
    }

    public void setDataApiRespParmCrtDt(Date dataApiRespParmCrtDt) {
        this.dataApiRespParmCrtDt = dataApiRespParmCrtDt;
    }

    public Date getDataApiRespParmUpdtDt() {
        return dataApiRespParmUpdtDt;
    }

    public void setDataApiRespParmUpdtDt(Date dataApiRespParmUpdtDt) {
        this.dataApiRespParmUpdtDt = dataApiRespParmUpdtDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataApiRespParm that = (DataApiRespParm) o;

        if (dataApiRespParmId != that.dataApiRespParmId) return false;
        if (dataApiId != that.dataApiId) return false;
        if (dataApiRespParmOnUseFlg != that.dataApiRespParmOnUseFlg) return false;
        if (dataApiRespParmNm != null ? !dataApiRespParmNm.equals(that.dataApiRespParmNm) : that.dataApiRespParmNm != null)
            return false;
        if (dataApiRespParmDataTypNm != null ? !dataApiRespParmDataTypNm.equals(that.dataApiRespParmDataTypNm) : that.dataApiRespParmDataTypNm != null)
            return false;
        if (dataApiRespParmDesc != null ? !dataApiRespParmDesc.equals(that.dataApiRespParmDesc) : that.dataApiRespParmDesc != null)
            return false;
        if (dataApiRespParmCrtDt != null ? !dataApiRespParmCrtDt.equals(that.dataApiRespParmCrtDt) : that.dataApiRespParmCrtDt != null)
            return false;
        if (dataApiRespParmUpdtDt != null ? !dataApiRespParmUpdtDt.equals(that.dataApiRespParmUpdtDt) : that.dataApiRespParmUpdtDt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dataApiRespParmId;
        result = 31 * result + dataApiId;
        result = 31 * result + (dataApiRespParmNm != null ? dataApiRespParmNm.hashCode() : 0);
        result = 31 * result + (dataApiRespParmDataTypNm != null ? dataApiRespParmDataTypNm.hashCode() : 0);
        result = 31 * result + (dataApiRespParmDesc != null ? dataApiRespParmDesc.hashCode() : 0);
        result = 31 * result + (int) dataApiRespParmOnUseFlg;
        result = 31 * result + (dataApiRespParmCrtDt != null ? dataApiRespParmCrtDt.hashCode() : 0);
        result = 31 * result + (dataApiRespParmUpdtDt != null ? dataApiRespParmUpdtDt.hashCode() : 0);
        return result;
    }
}
