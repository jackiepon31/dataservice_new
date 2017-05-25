package com.fosun.fin.data.entity;

/**
 * Created by root on 17-5-25.
 */
public class DataApiBusSysMapping {
    //业务系统ID
    private int busSysId;
    //数据ApiId
    private int dataApiId;

    public int getBusSysId() {
        return busSysId;
    }

    public void setBusSysId(int busSysId) {
        this.busSysId = busSysId;
    }

    public int getDataApiId() {
        return dataApiId;
    }

    public void setDataApiId(int dataApiId) {
        this.dataApiId = dataApiId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataApiBusSysMapping that = (DataApiBusSysMapping) o;

        if (busSysId != that.busSysId) return false;
        if (dataApiId != that.dataApiId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = busSysId;
        result = 31 * result + dataApiId;
        return result;
    }
}
