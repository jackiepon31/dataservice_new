package com.fosun.fin.data.dao;

import com.fosun.fin.data.entity.DataApiInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by pengyk on 17-5-22.
 */
@Mapper
public interface DataApiInfoDao {

    int add(@Param("dataApiInfo")DataApiInfo dataApiInfo);

    void delete(String name);

    void update(@Param("dataApiInfo") DataApiInfo dataApiInfo);

    DataApiInfo query(@Param("dataApiInfo") DataApiInfo dataApiInfo);

    DataApiInfo queryByCode(@Param("apiCode") String apiCode);

}
