package com.fosun.fin.data.service.common.impl;

import com.alibaba.fastjson.JSONObject;
import com.fosun.fin.data.constant.SystemConstant;
import com.fosun.fin.data.dao.DataApiReqDao;
import com.fosun.fin.data.dao.SysApiReqDao;
import com.fosun.fin.data.dao.ThrdPrtDataPrvdApiReqDao;
import com.fosun.fin.data.service.common.IValidateService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pengyk on 2017/5/22.
 */
@Service
public class ValidateServiceImpl implements IValidateService {

    @Autowired
    private SysApiReqDao sysApiReqDao;

    @Autowired
    private DataApiReqDao dataApiReqDao;

    @Autowired
    private ThrdPrtDataPrvdApiReqDao thrdPrtDataPrvdApiReqDao;

    /**
     * 校验入口
     *
     * @param validateType
     * @param requestParam
     * @return String
     */
    @Override
    public String validate(String validateType, JSONObject requestParam) throws Exception {
        //先校验参数的可用性
        String validateMsg = validateParam(validateType,requestParam);
        if(StringUtils.isEmpty(validateMsg)){
            //再校验Api服务元的可用性
            validateMsg = validateApi(validateType,requestParam);
        }
        return validateMsg;
    }

    /**
     * 校验参数可用性
     *
     * @param validateType
     * @param requestParam
     * @return String
     */
    private String validateParam(String validateType, JSONObject requestParam) throws Exception {
        String validateMsg = "";
        String apiCd = this.getApiCode(validateType,requestParam);
        if(StringUtils.isEmpty(apiCd)){
            //apiCd不能非空
            validateMsg = SystemConstant.ValidateMsg.MSG_NULL_ERROR.getValue();
        }else{
            List<String> reqKeyList = new<String> ArrayList(requestParam.keySet());
            List<String> apiKeyList = this.getReqKeyList(validateType,apiCd);
            if(reqKeyList.size()!=apiKeyList.size()){
                //参数个数有误
                validateMsg = SystemConstant.ValidateMsg.MSG_COUNT_ERROR.getValue();
            }else {
                for (String apiKey:apiKeyList) {
                    String reqParamValue = requestParam.getString(apiKey);
                    if(StringUtils.isEmpty(reqParamValue)){
                        //参数命名有误
                        validateMsg = SystemConstant.ValidateMsg.MSG_KEY_ERROR.getValue();
                        break;
                    }
                }
            }
        }
        return validateMsg;
    }

    /*获取API编码*/
    private String getApiCode(String validateType, JSONObject requestParam){
        String apiCd = "";
        if(SystemConstant.ApiType.SYSTEM_API.getValue().equals(validateType)){
            apiCd = requestParam.getString(SystemConstant.KeyName.SYSTEM_API_CD.getValue());
        }else if(SystemConstant.ApiType.INTERNAL_API.getValue().equals(validateType)){
            apiCd = requestParam.getString(SystemConstant.KeyName.DATA_API_CD.getValue());
        }else if(SystemConstant.ApiType.EXTERNAL_API.getValue().equals(validateType)){
            apiCd = requestParam.getString(SystemConstant.KeyName.DATA_API_CD.getValue());
        }
        return apiCd;
    }

    /*获取请求参数元数据列表*/
    private List<String> getReqKeyList(String validateType, String apiCd){
        List<String> reqKeyList = new ArrayList<String>();
        if(SystemConstant.ApiType.SYSTEM_API.getValue().equals(validateType)){
            reqKeyList = dataApiReqDao.queryByApiCd(apiCd);
        }else if(SystemConstant.ApiType.INTERNAL_API.getValue().equals(validateType)){
            reqKeyList = sysApiReqDao.queryByApiCd(apiCd);
        }else if(SystemConstant.ApiType.EXTERNAL_API.getValue().equals(validateType)){
            reqKeyList = thrdPrtDataPrvdApiReqDao.queryByApiCd(apiCd);
        }
        return reqKeyList;
    }

    /**
     * 校验接口服务可用性
     *
     * @param validateType
     * @param requestParam
     * @return String
     */
    private String validateApi(String validateType, JSONObject requestParam) throws Exception {
        String validateMsg = "";

        return validateMsg;
    }
}
