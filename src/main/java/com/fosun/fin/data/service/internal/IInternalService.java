package com.fosun.fin.data.service.internal;

import com.alibaba.fastjson.JSONObject;
import com.fosun.fin.data.dto.RequestParamDTO;
import com.fosun.fin.data.util.common.JsonResult;
import org.apache.http.HttpEntity;
import org.elasticsearch.client.Response;

import java.io.IOException;

/**
 * Created by pengyk on 2017/5/22.
 */
public interface IInternalService {

    /**
     * 内部接口服务信息校验
     * @param index
     * @param type
     * @return bool
     */
    public boolean validate(String appId) throws IOException;


    /**
     * 内部接口数据查询
     * @param request
     */
    public JsonResult query(JSONObject request) throws IOException;

}
