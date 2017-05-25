package com.fosun.fin.data.dao;

import com.fosun.fin.data.entity.EsIndxTypInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by pengyk on 17-5-22.
 */
@Mapper
public interface EsTypeDao {

    int add(@Param("indexType") EsIndxTypInfo indexType);

    void delete(String name);

    void update(@Param("indexType") EsIndxTypInfo indexType);

    EsIndxTypInfo query(@Param("indexType") EsIndxTypInfo indexType);

}
