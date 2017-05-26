package com.fosun.fin.data.dao;

import com.fosun.fin.data.entity.ThrdPrtDataPrvdApiInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by pengyk on 17-5-22.
 */
@Mapper
public interface ThrdPrtDataPrvdApiInfoDao {

    int add(@Param("tpInterface") ThrdPrtDataPrvdApiInfo tpInterface);

    void delete(String name);

    void update(@Param("tpInterface") ThrdPrtDataPrvdApiInfo tpInterface);

    ThrdPrtDataPrvdApiInfo query(@Param("cluster") ThrdPrtDataPrvdApiInfo tpInterface);

    ThrdPrtDataPrvdApiInfo queryByCode(@Param("apiCode") String apiCode);
}
