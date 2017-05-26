package com.fosun.fin.data.dto;

import com.alibaba.fastjson.JSONObject;

/**
 *
 * <p>
 * 入参类
 * <p>
 *
 * @author pengyk
 * @since 2017-05-22 13:27:43
 * @see
 */

public class RequestParamDTO {

    //调用系统名称
    private String systemName;
    //内部系统服务API编码
    private String systemApiCd;
    //内部数据服务API编码
    private String dataApiCd;
    //请求参数内容（JSON格式）
    private JSONObject param;

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemApiCd() {
        return systemApiCd;
    }

    public void setSystemApiCd(String systemApiCd) {
        this.systemApiCd = systemApiCd;
    }

    public String getDataApiCd() {
        return dataApiCd;
    }

    public void setDataApiCd(String dataApiCd) {
        this.dataApiCd = dataApiCd;
    }

    public JSONObject getParam() {
        return param;
    }

    public void setParam(JSONObject param) {
        this.param = param;
    }
}
