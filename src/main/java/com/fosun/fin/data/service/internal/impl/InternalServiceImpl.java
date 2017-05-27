package com.fosun.fin.data.service.internal.impl;

import com.alibaba.fastjson.JSONObject;
import com.fosun.fin.data.constant.SystemConstant;
import com.fosun.fin.data.dao.DataApiInfoDao;
import com.fosun.fin.data.entity.DataApiInfo;
import com.fosun.fin.data.service.common.IValidateService;
import com.fosun.fin.data.service.internal.IESRestService;
import com.fosun.fin.data.service.internal.IInternalService;
import com.fosun.fin.data.util.common.JsonResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pengyk on 2017/5/22.
 */
@Service
public class InternalServiceImpl implements IInternalService {

    @Autowired
    private IValidateService validateService;
    @Autowired
    private IESRestService esRestService;
    @Autowired
    private DataApiInfoDao dataApiInfoDao;

    /**
     * 外部接口数据查询
     *
     * @param request
     */
    @Override
    public JsonResult query(JSONObject request) throws Exception {
        //校验
        JsonResult jsonResult = null;
        Map map = new HashMap();
        //系统配置&参数可用性校验
        String message = validateService.validate(SystemConstant.ApiType.INTERNAL_API.getValue(),request);
        if(StringUtils.isEmpty(message)){
            //获取内部接口请求参数
            JSONObject param = request.getJSONObject(SystemConstant.KeyName.PRAM_MAP.getValue());
            //获取内部接口代码
            String apiCd = request.getString(SystemConstant.KeyName.DATA_API_CD.getValue());
            //获取内部接口信息
            DataApiInfo apiInfo = dataApiInfoDao.queryByCode(apiCd);
            if(apiInfo != null){
                //todo 拼接URL核参数，开始访问内部ES接口服务

            }
        }else {
            //返回报错信息
            jsonResult = new JsonResult(JsonResult.JSON_RESULT_TYPE.failure,message,map);
        }
        return jsonResult;
    }

    /**
     * 外部接口服务信息校验
     *
     * @param appId
     * @return bool
     */
    public boolean validate(String appId) throws IOException {
        return false;
    }
}
