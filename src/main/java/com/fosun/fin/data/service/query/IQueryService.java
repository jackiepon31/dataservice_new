package com.fosun.fin.data.service.query;

import com.alibaba.fastjson.JSONObject;
import com.fosun.fin.data.util.common.JsonResult;

/**
 * Created by pengyk on 2017/5/22.
 */
public interface IQueryService {

    /**
     * 查询数据
     * @param requestParam
     * @return String
     */
    public JsonResult queryData(JSONObject requestParam) throws Exception;

}
