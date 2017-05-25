package com.fosun.fin.data.dao;

import com.fosun.fin.data.entity.EsClusterInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by pengyk on 17-5-22.
 */
@Mapper
public interface EsClusterDao {

    int add(@Param("cluster") EsClusterInfo cluster);

    void delete(String name);

    void update(@Param("cluster") EsClusterInfo cluster);

    EsClusterInfo query(@Param("cluster") EsClusterInfo cluster);

}
