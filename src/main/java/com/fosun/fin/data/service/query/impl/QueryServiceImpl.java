package com.fosun.fin.data.service.query.impl;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.fosun.fin.data.constant.SystemConstant;
import com.fosun.fin.data.service.common.IValidateService;
import com.fosun.fin.data.service.external.IExternalService;
import com.fosun.fin.data.service.internal.IInternalService;
import com.fosun.fin.data.service.query.IQueryService;
import com.fosun.fin.data.util.common.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pengyk on 2017/5/22.
 */
@Service
public class QueryServiceImpl implements IQueryService {

    @Autowired
    private IExternalService externalService;
    @Autowired
    private IInternalService internalService;
    @Autowired
    private IValidateService validateService;
    /**
     * 查询数据
     *
     * @param requestParam
     * @return JsonResult
     */
    @Override
    public JsonResult queryData(JSONObject requestParam) throws Exception {
        //校验
        JsonResult jsonResult = null;
        Map map = new HashMap();
        //系统配置&参数可用性校验
        String message = validateService.validate(SystemConstant.ApiType.SYSTEM_API.getValue(),requestParam);
        if(StringUtils.isEmpty(message)){
            //校验通过，开始访问接口

        }else {
            //返回报错信息
            jsonResult = new JsonResult(JsonResult.JSON_RESULT_TYPE.failure,message,map);
        }

        return jsonResult;
    }


}
