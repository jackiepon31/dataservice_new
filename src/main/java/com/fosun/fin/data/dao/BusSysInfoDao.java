package com.fosun.fin.data.dao;

import com.fosun.fin.data.entity.BusSysInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by pengyk on 17-5-22.
 */
@Mapper
public interface BusSysInfoDao {

    int add(@Param("busSysInfo") BusSysInfo busSysInfo);

    void delete(String name);

    void update(@Param("busSysInfo") BusSysInfo busSysInfo);

    BusSysInfo query(@Param("busSysInfo") BusSysInfo busSysInfo);

    BusSysInfo queryByName(@Param("busSysNm") String busSysNm);

}
