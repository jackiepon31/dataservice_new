package com.fosun.fin.data.dao;

import com.fosun.fin.data.entity.SysApiRespParm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by pengyk on 17-5-22.
 */
@Mapper
public interface SysApiRespParmDao {

    int add(@Param("response") SysApiRespParm response);

    void delete(String name);

    void update(@Param("response") SysApiRespParm response);

    SysApiRespParm query(@Param("response") SysApiRespParm response);

}
