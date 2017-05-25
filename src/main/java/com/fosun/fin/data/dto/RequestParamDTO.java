package com.fosun.fin.data.dto;

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
    //Api编码
    private String key;
    //参数内容（JSON格式）
    private String param;

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
