package com.fosun.fin.data.dao;

import com.fosun.fin.data.entity.ThrdPrtDataPrvdApiReqParm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by pengyk on 17-5-22.
 */
@Mapper
public interface ThrdPrtDataPrvdApiReqDao {

    int add(@Param("request") ThrdPrtDataPrvdApiReqParm request);

    void delete(String name);

    void update(@Param("request") ThrdPrtDataPrvdApiReqParm request);

    ThrdPrtDataPrvdApiReqParm query(@Param("request") ThrdPrtDataPrvdApiReqParm request);

}
