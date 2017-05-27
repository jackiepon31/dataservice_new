package com.fosun.fin.data.service.internal;

import com.alibaba.fastjson.JSONObject;
import com.fosun.fin.data.util.common.JsonResult;

/**
 * Created by pengyk on 2017/5/22.
 */
public interface IInternalService {

    /**
     * 内部接口数据查询
     * @param request
     */
    public JsonResult query(JSONObject request) throws Exception;

}
