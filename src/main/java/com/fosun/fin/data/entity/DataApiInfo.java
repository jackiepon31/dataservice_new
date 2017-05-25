package com.fosun.fin.data.entity;

import java.sql.Date;

/**
 * Created by root on 17-5-25.
 */
public class DataApiInfo {
    private int dataApiId;
    //Es索引类型标识
    private int esIndxTypId;
    //内部数据服务API编码
    private String dataApiCd;
    //内部数据服务API名称
    private String dataApiNm;
    private String dataApiUriAddr;
    private String dataApiReqTypNm;
    private String dataApiReqMethNm;
    private String dataApiRespTypNm;
    private String dataApiDesc;
    private String dataApiDmnSpecLngQueryTxt;
    private byte dataApiOnUseFlg;
    private String dataApiOwnrNm;
    private Date dataApiCrtDt;
    private Date dataApiUpdtDt;

    public int getDataApiId() {
        return dataApiId;
    }

    public void setDataApiId(int dataApiId) {
        this.dataApiId = dataApiId;
    }

    public int getEsIndxTypId() {
        return esIndxTypId;
    }

    public void setEsIndxTypId(int esIndxTypId) {
        this.esIndxTypId = esIndxTypId;
    }

    public String getDataApiCd() {
        return dataApiCd;
    }

    public void setDataApiCd(String dataApiCd) {
        this.dataApiCd = dataApiCd;
    }

    public String getDataApiNm() {
        return dataApiNm;
    }

    public void setDataApiNm(String dataApiNm) {
        this.dataApiNm = dataApiNm;
    }

    public String getDataApiUriAddr() {
        return dataApiUriAddr;
    }

    public void setDataApiUriAddr(String dataApiUriAddr) {
        this.dataApiUriAddr = dataApiUriAddr;
    }

    public String getDataApiReqTypNm() {
        return dataApiReqTypNm;
    }

    public void setDataApiReqTypNm(String dataApiReqTypNm) {
        this.dataApiReqTypNm = dataApiReqTypNm;
    }

    public String getDataApiReqMethNm() {
        return dataApiReqMethNm;
    }

    public void setDataApiReqMethNm(String dataApiReqMethNm) {
        this.dataApiReqMethNm = dataApiReqMethNm;
    }

    public String getDataApiRespTypNm() {
        return dataApiRespTypNm;
    }

    public void setDataApiRespTypNm(String dataApiRespTypNm) {
        this.dataApiRespTypNm = dataApiRespTypNm;
    }

    public String getDataApiDesc() {
        return dataApiDesc;
    }

    public void setDataApiDesc(String dataApiDesc) {
        this.dataApiDesc = dataApiDesc;
    }

    public String getDataApiDmnSpecLngQueryTxt() {
        return dataApiDmnSpecLngQueryTxt;
    }

    public void setDataApiDmnSpecLngQueryTxt(String dataApiDmnSpecLngQueryTxt) {
        this.dataApiDmnSpecLngQueryTxt = dataApiDmnSpecLngQueryTxt;
    }

    public byte getDataApiOnUseFlg() {
        return dataApiOnUseFlg;
    }

    public void setDataApiOnUseFlg(byte dataApiOnUseFlg) {
        this.dataApiOnUseFlg = dataApiOnUseFlg;
    }

    public String getDataApiOwnrNm() {
        return dataApiOwnrNm;
    }

    public void setDataApiOwnrNm(String dataApiOwnrNm) {
        this.dataApiOwnrNm = dataApiOwnrNm;
    }

    public Date getDataApiCrtDt() {
        return dataApiCrtDt;
    }

    public void setDataApiCrtDt(Date dataApiCrtDt) {
        this.dataApiCrtDt = dataApiCrtDt;
    }

    public Date getDataApiUpdtDt() {
        return dataApiUpdtDt;
    }

    public void setDataApiUpdtDt(Date dataApiUpdtDt) {
        this.dataApiUpdtDt = dataApiUpdtDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataApiInfo that = (DataApiInfo) o;

        if (dataApiId != that.dataApiId) return false;
        if (esIndxTypId != that.esIndxTypId) return false;
        if (dataApiOnUseFlg != that.dataApiOnUseFlg) return false;
        if (dataApiCd != null ? !dataApiCd.equals(that.dataApiCd) : that.dataApiCd != null) return false;
        if (dataApiNm != null ? !dataApiNm.equals(that.dataApiNm) : that.dataApiNm != null) return false;
        if (dataApiUriAddr != null ? !dataApiUriAddr.equals(that.dataApiUriAddr) : that.dataApiUriAddr != null)
            return false;
        if (dataApiReqTypNm != null ? !dataApiReqTypNm.equals(that.dataApiReqTypNm) : that.dataApiReqTypNm != null)
            return false;
        if (dataApiReqMethNm != null ? !dataApiReqMethNm.equals(that.dataApiReqMethNm) : that.dataApiReqMethNm != null)
            return false;
        if (dataApiRespTypNm != null ? !dataApiRespTypNm.equals(that.dataApiRespTypNm) : that.dataApiRespTypNm != null)
            return false;
        if (dataApiDesc != null ? !dataApiDesc.equals(that.dataApiDesc) : that.dataApiDesc != null) return false;
        if (dataApiDmnSpecLngQueryTxt != null ? !dataApiDmnSpecLngQueryTxt.equals(that.dataApiDmnSpecLngQueryTxt) : that.dataApiDmnSpecLngQueryTxt != null)
            return false;
        if (dataApiOwnrNm != null ? !dataApiOwnrNm.equals(that.dataApiOwnrNm) : that.dataApiOwnrNm != null)
            return false;
        if (dataApiCrtDt != null ? !dataApiCrtDt.equals(that.dataApiCrtDt) : that.dataApiCrtDt != null) return false;
        if (dataApiUpdtDt != null ? !dataApiUpdtDt.equals(that.dataApiUpdtDt) : that.dataApiUpdtDt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dataApiId;
        result = 31 * result + esIndxTypId;
        result = 31 * result + (dataApiCd != null ? dataApiCd.hashCode() : 0);
        result = 31 * result + (dataApiNm != null ? dataApiNm.hashCode() : 0);
        result = 31 * result + (dataApiUriAddr != null ? dataApiUriAddr.hashCode() : 0);
        result = 31 * result + (dataApiReqTypNm != null ? dataApiReqTypNm.hashCode() : 0);
        result = 31 * result + (dataApiReqMethNm != null ? dataApiReqMethNm.hashCode() : 0);
        result = 31 * result + (dataApiRespTypNm != null ? dataApiRespTypNm.hashCode() : 0);
        result = 31 * result + (dataApiDesc != null ? dataApiDesc.hashCode() : 0);
        result = 31 * result + (dataApiDmnSpecLngQueryTxt != null ? dataApiDmnSpecLngQueryTxt.hashCode() : 0);
        result = 31 * result + (int) dataApiOnUseFlg;
        result = 31 * result + (dataApiOwnrNm != null ? dataApiOwnrNm.hashCode() : 0);
        result = 31 * result + (dataApiCrtDt != null ? dataApiCrtDt.hashCode() : 0);
        result = 31 * result + (dataApiUpdtDt != null ? dataApiUpdtDt.hashCode() : 0);
        return result;
    }
}
