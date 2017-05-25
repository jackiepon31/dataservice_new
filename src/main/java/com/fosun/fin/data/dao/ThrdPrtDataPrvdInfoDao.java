package com.fosun.fin.data.dao;

import com.fosun.fin.data.entity.ThrdPrtDataPrvdInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by pengyk on 17-5-22.
 */
@Mapper
public interface ThrdPrtDataPrvdInfoDao {

    int add(@Param("provider") ThrdPrtDataPrvdInfo provider);

    void delete(String name);

    void update(@Param("provider") ThrdPrtDataPrvdInfo provider);

    ThrdPrtDataPrvdInfo query(@Param("provider") ThrdPrtDataPrvdInfo provider);

}
