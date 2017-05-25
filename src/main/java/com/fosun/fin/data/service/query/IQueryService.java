package com.fosun.fin.data.service.query;

import com.fosun.fin.data.dto.RequestParamDTO;

import java.io.IOException;

/**
 * Created by pengyk on 2017/5/22.
 */
public interface IQueryService {

    /**
     * 查询数据
     * @param requestParamDTO
     * @return String
     */
    public String queryData(RequestParamDTO requestParamDTO) throws IOException;

}
