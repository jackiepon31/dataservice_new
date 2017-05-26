package com.fosun.fin.data.service.common;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by pengyk on 2017/5/22.
 */
public interface IValidateService {

    /**
     * 校验入口
     * @param validateType
     * @param requestParamDTO
     * @return String
     */
    public String validate(String validateType,JSONObject requestParam) throws Exception;


}
