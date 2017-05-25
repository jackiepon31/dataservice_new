package com.fosun.fin.data.dao;

import com.fosun.fin.data.entity.DataApiRespParm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by pengyk on 17-5-22.
 */
@Mapper
public interface DataApiRespDao {

    int add(@Param("response") DataApiRespParm response);

    void delete(String name);

    void update(@Param("response") DataApiRespParm response);

    DataApiRespParm query(@Param("response") DataApiRespParm response);

}
