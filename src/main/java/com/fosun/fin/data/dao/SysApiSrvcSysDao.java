package com.fosun.fin.data.dao;

import com.fosun.fin.data.entity.SysApiSrvcSys;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by pengyk on 17-5-22.
 */
@Mapper
public interface SysApiSrvcSysDao {

    int add(@Param("sysApiSrvcSys") SysApiSrvcSys sysApiSrvcSys);

    void delete(String name);

    void update(@Param("sysApiSrvcSys") SysApiSrvcSys sysApiSrvcSys);

    SysApiSrvcSys query(@Param("sysApiSrvcSys") SysApiSrvcSys sysApiSrvcSys);

    SysApiSrvcSys queryByCode(@Param("apiCode") String apiCode);
}
