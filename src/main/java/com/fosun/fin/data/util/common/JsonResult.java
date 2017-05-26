package com.fosun.fin.data.util.common;


import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * JSON Data Reslut
 */
public class JsonResult<T> {

    public enum JSON_RESULT_TYPE {
        success, failure;
    }

    private String type;
    private String message;
    private Long id;
    private String action;
    private T data;

    public JsonResult() {
        super();
    }

    public JsonResult(JSON_RESULT_TYPE type, String message) {
        this.type = type.name();
        this.message = message;
    }

    public JsonResult(JSON_RESULT_TYPE type, String message, T data) {
        this.type = type.name();
        this.message = message;
        this.data = data;
    }

    public JsonResult(JSON_RESULT_TYPE type, Long sid, String action, String message) {
        this.type = type.name();
        this.id = sid;
        this.action = action;
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message
     *            the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}