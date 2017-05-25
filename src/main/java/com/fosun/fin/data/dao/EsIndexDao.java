package com.fosun.fin.data.dao;

import com.fosun.fin.data.entity.EsIndxInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by pengyk on 17-5-22.
 */
@Mapper
public interface EsIndexDao {

    int add(@Param("index") EsIndxInfo index);

    void delete(String name);

    void update(@Param("index") EsIndxInfo index);

    EsIndxInfo query(@Param("index") EsIndxInfo index);

}
