package com.fosun.fin.data.constant;

/**
 * Created by pengyk on 17-5-26.
 */
public class SystemConstant {
    /**
     * 基础常量定义
    * */

    // 服务接口枚举类型
    public static enum ApiType {
        // 系统平台服务接口
        SYSTEM_API("system_api","系统平台服务接口"),
        // 内部数据服务接口
        INTERNAL_API("internal_api","内部数据服务接口"),
        // 外部数据服务接口
        EXTERNAL_API("external_api","外部数据服务接口");
        private String name;
        private String value;
        private ApiType(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }



    // 参数类型
    public static enum KeyName {
        // 系统平台服务接口编码
        SYSTEM_API_CD("systemApiCd","系统平台服务接口编码"),
        // 内部数据服务接口
        DATA_API_CD("dataApiCd","内部数据服务接口编码"),
        // 外部数据服务接口
        THRD_PRT_DATA_PRVD_API_CD("thrdPrtDataPrvdApiCd","外部数据服务接口编码"),
        // 接口参数
        PRAM_MAP("pramMap","数据服务接口编码");

        private String name;
        private String value;
        private KeyName(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    // 常见报错
    public static enum ValidateMsg {
        // 参数个数不一致
        MSG_COUNT_ERROR("MSG_COUNT_ERROR","请求参数和系统元数据个数不一致，请核实!"),
        // 参数错误
        MSG_KEY_ERROR("MSG_PARAM_ERROR","参数名称有误,请核实参数名和DMP系统的配置是否一致!"),
        // 参数非空
        MSG_NULL_ERROR("MSG_NULL_ERROR","接口编码不能为空!");

        private String name;
        private String value;
        private ValidateMsg(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

}
