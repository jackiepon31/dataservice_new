package com.fosun.fin.data.service.external;

import com.alibaba.fastjson.JSONObject;
import com.fosun.fin.data.util.common.JsonResult;
import org.apache.http.HttpEntity;
import org.elasticsearch.client.Response;

import java.io.IOException;

/**
 * Created by pengyk on 2017/5/22.
 */
public interface IExternalService {



    /**
     * 外部接口服务信息校验
     * @param index
     * @param type
     * @return bool
     */
    public boolean validate(String appId) throws IOException;


    /**
     * 外部接口数据查询
     * @param request
     */
    public JsonResult query(JSONObject request) throws IOException;




}
