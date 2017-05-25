package com.fosun.fin.data.dao;

import com.fosun.fin.data.entity.SysApiInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by pengyk on 17-5-22.
 */
@Mapper
public interface SysApiInfoDao {

    int add(@Param("sysApiInfo") SysApiInfo sysApiInfo);

    void delete(String name);

    void update(@Param("sysApiInfo") SysApiInfo sysApiInfo);

    SysApiInfo query(@Param("sysInterface") SysApiInfo sysApiInfo);

}
