package com.fosun.fin.data.dao;

import com.fosun.fin.data.entity.ThrdPrtDataPrvdApiRespParm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by pengyk on 17-5-22.
 */
@Mapper
public interface ThrdPrtDataPrvdApiRespDao {

    int add(@Param("response") ThrdPrtDataPrvdApiRespParm response);

    void delete(String name);

    void update(@Param("response") ThrdPrtDataPrvdApiRespParm response);

    ThrdPrtDataPrvdApiRespParm query(@Param("response") ThrdPrtDataPrvdApiRespParm response);

}
