package com.fosun.fin.data.service.internal.impl;

import com.fosun.fin.data.service.internal.IInternalService;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by pengyk on 2017/5/22.
 */
@Service
public class InternalServiceImpl implements IInternalService {
    /**
     * 外部接口服务信息校验
     *
     * @param appId
     * @return bool
     */
    @Override
    public boolean validate(String appId) throws IOException {
        return false;
    }

    /**
     * 外部接口数据查询
     *
     * @param request
     */
    @Override
    public void query(String request) throws IOException {

    }
}