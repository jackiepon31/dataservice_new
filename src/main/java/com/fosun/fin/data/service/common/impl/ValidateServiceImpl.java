package com.fosun.fin.data.service.common.impl;

import com.alibaba.fastjson.JSONObject;
import com.fosun.fin.data.constant.SystemConstant;
import com.fosun.fin.data.dao.*;
import com.fosun.fin.data.entity.*;
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
    private BusSysInfoDao busSysInfoDao;

    @Autowired
    private SysApiSrvcSysDao sysApiSrvcSysDao;

    @Autowired
    private SysApiInfoDao sysApiInfoDao;

    @Autowired
    private SysApiReqDao sysApiReqDao;

    @Autowired
    private ThrdPrtDataPrvdInfoDao thrdPrtDataPrvdInfoDao;

    @Autowired
    private ThrdPrtDataPrvdApiInfoDao thrdPrtDataPrvdApiInfoDao;

    @Autowired
    private ThrdPrtDataPrvdApiReqDao thrdPrtDataPrvdApiReqDao;

    @Autowired
    private DataApiInfoDao dataApiInfoDao;
    @Autowired
    private DataApiReqDao dataApiReqDao;

    /**
     * 校验入口
     *
     * @param validateType
     * @param requestParam
     * @return String
     */
    @Override
    public String validate(String validateType, JSONObject requestParam) throws Exception {
        //校验业务系统的可用性
        String validateMsg = validateSystem(requestParam);
        //校验参数的可用性
        if(StringUtils.isEmpty(validateMsg)){
            validateMsg = validateParam(validateType,requestParam);
        }else if(StringUtils.isEmpty(validateMsg)){
            //再校验Api服务的可用性
            validateMsg = validateApi(validateType,requestParam);
        }
        return validateMsg;
    }

    /**
     * API可用性信息校验
     *
     * @param requestParam
     * @return String
     */
    public String validateSystem(JSONObject requestParam){
        String validateMsg = "";
        String systemName = requestParam.getString(SystemConstant.KeyName.BUS_SYS_NM.getValue());
        if (StringUtils.isEmpty(systemName)){
            validateMsg = "systemName"+SystemConstant.ValidateMsg.MSG_NULL_ERROR.getValue();
        }else{
            BusSysInfo busSysInfo = busSysInfoDao.queryByName(systemName);
            if(busSysInfo == null){
                validateMsg = SystemConstant.ValidateMsg.MSG_SYSTEM_ERROR.getValue();
            }else{
                String useFlag = Byte.toString(busSysInfo.getBusSysOnUseFlg());
                if(SystemConstant.UseFlag.UN_USEABLE.equals(useFlag)){
                    validateMsg = SystemConstant.ValidateMsg.MSG_SYSTEM_ERROR.getValue();
                }
            }
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
            validateMsg = ""+SystemConstant.ValidateMsg.MSG_NULL_ERROR.getValue();
        }else{
            List<String> reqKeyList = this.getReqKeyList(validateType,requestParam);
            List<String> apiKeyList = this.getApiKeyList(validateType,apiCd);
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

    /**
     * 校验接口服务可用性
     *
     * @param validateType
     * @param requestParam
     * @return String
     */
    private String validateApi(String validateType, JSONObject requestParam) throws Exception {
        String validateMsg = "";
        String apiCode = this.getApiCode(validateType,requestParam);
        if(SystemConstant.ApiType.SYSTEM_API.getValue().equals(validateType)){
            SysApiSrvcSys sysApiSrvcSys = sysApiSrvcSysDao.queryByCode(apiCode);
            SysApiInfo sysApiInfo = sysApiInfoDao.queryByCode(apiCode);
            if(sysApiSrvcSys!=null && sysApiInfo!=null){
                String srvcFlag = Byte.toString(sysApiSrvcSys.getSysApiSrvcSysOnUseFlg());
                String apiFlag = Byte.toString(sysApiInfo.getSysApiOnUseFlg());
                if(SystemConstant.UseFlag.UN_USEABLE.getValue().equals(srvcFlag)||SystemConstant.UseFlag.UN_USEABLE.getValue().equals(apiFlag)){
                    validateMsg = SystemConstant.ValidateMsg.MSG_API_ERROR.getValue();
                }
            }else{
                validateMsg = SystemConstant.ValidateMsg.MSG_API_ERROR.getValue();
            }
        }else if(SystemConstant.ApiType.INTERNAL_API.getValue().equals(validateType)){
            DataApiInfo dataApiInfo = dataApiInfoDao.queryByCode(apiCode);
            if(dataApiInfo!=null){
                String apiFlag = Byte.toString(dataApiInfo.getDataApiOnUseFlg());
                if(SystemConstant.UseFlag.UN_USEABLE.getValue().equals(apiFlag)){
                    validateMsg = SystemConstant.ValidateMsg.MSG_API_ERROR.getValue();
                }
            }else{
                validateMsg = SystemConstant.ValidateMsg.MSG_API_ERROR.getValue();
            }
        }else if(SystemConstant.ApiType.EXTERNAL_API.getValue().equals(validateType)){
            ThrdPrtDataPrvdInfo thrdPrtDataPrvdInfo = thrdPrtDataPrvdInfoDao.queryByCode(apiCode);
            ThrdPrtDataPrvdApiInfo thrdPrtDataPrvdApiInfo = thrdPrtDataPrvdApiInfoDao.queryByCode(apiCode);
            if(thrdPrtDataPrvdInfo!=null && thrdPrtDataPrvdApiInfo!=null){
                String srvcFlag = Byte.toString(thrdPrtDataPrvdInfo.getThrdPrtDataPrvdOnUseFlg());
                String apiFlag = Byte.toString(thrdPrtDataPrvdApiInfo.getThrdPrtDataPrvdApiOnUseFlg());
                if(SystemConstant.UseFlag.UN_USEABLE.getValue().equals(srvcFlag)||SystemConstant.UseFlag.UN_USEABLE.getValue().equals(apiFlag)){
                    validateMsg = SystemConstant.ValidateMsg.MSG_API_ERROR.getValue();
                }
            }else{
                validateMsg = SystemConstant.ValidateMsg.MSG_API_ERROR.getValue();
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

    /*获取请求参数信息*/
    private List<String> getReqKeyList(String validateType,JSONObject requestParam){
        List<String> reqKeyList = new ArrayList<String>();
        if(SystemConstant.ApiType.SYSTEM_API.getValue().equals(validateType)){
            reqKeyList = new ArrayList<String>(requestParam.keySet());
        }else if(SystemConstant.ApiType.INTERNAL_API.getValue().equals(validateType)
                || SystemConstant.ApiType.INTERNAL_API.getValue().equals(validateType)){
            JSONObject paramJson = requestParam.getJSONObject(SystemConstant.KeyName.PRAM_MAP.getValue());
            reqKeyList = new ArrayList<String>(paramJson.keySet());
        }
        return reqKeyList;
    }

    /*获取请求参数对应的配置信息*/
    private List<String> getApiKeyList(String validateType, String apiCd){
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



}
