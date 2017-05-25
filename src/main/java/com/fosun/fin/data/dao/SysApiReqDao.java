package com.fosun.fin.data.dao;

import com.fosun.fin.data.entity.SysApiReqParm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by pengyk on 17-5-22.
 */
@Mapper
public interface SysApiReqDao {

    int add(@Param("request") SysApiReqParm request);

    void delete(String name);

    void update(@Param("request") SysApiReqParm request);

    SysApiReqParm query(@Param("request") SysApiReqParm request);

}
