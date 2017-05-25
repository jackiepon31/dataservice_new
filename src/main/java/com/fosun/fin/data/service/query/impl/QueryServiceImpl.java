package com.fosun.fin.data.service.query.impl;

import com.fosun.fin.data.dto.RequestParamDTO;
import com.fosun.fin.data.service.external.IExternalService;
import com.fosun.fin.data.service.internal.IInternalService;
import com.fosun.fin.data.service.query.IQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by pengyk on 2017/5/22.
 */
@Service
public class QueryServiceImpl implements IQueryService {

    @Autowired
    private IExternalService externalService;
    @Autowired
    private IInternalService internalService;

    /**
     * 查询数据
     *
     * @param requestParamDTO
     * @return String
     */
    @Override
    public String queryData(RequestParamDTO requestParamDTO) throws IOException {
        /**
         * 先调用内部服务接口,如果有数据，直接返回客户端，
         * 如果内部服务接口没有，则调用外部服务接口，查
         * 询成功，外部服务接口返回数据给客户端，另外异
         * 步存入ES中
         *
         *
         * */
        //先对参数类型做校验
        return null;
    }

    private Boolean validateParam(RequestParamDTO requestParamDTO) throws Exception{
        Boolean flag = false;
        return flag;
    }
}
