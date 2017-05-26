package com.fosun.fin.data.dao;

import com.fosun.fin.data.entity.DataApiReqParm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by pengyk on 17-5-22.
 */
@Mapper
public interface DataApiReqDao {

    int add(@Param("request") DataApiReqParm request);

    void delete(String name);

    void update(@Param("request") DataApiReqParm request);

    DataApiReqParm query(@Param("request") DataApiReqParm request);

    List<String> queryByApiCd(@Param("apiCd") String apiCd);

}
