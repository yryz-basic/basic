package com.yryz.basic.common.exception;


import com.yryz.basic.common.enums.AppConstants;

/**
 * rpc服务异常基类，所有服务业务异常必须继承此异常
 *
 * @author xiepeng
 *         <p>
 *         <p>
 *         业务异常码定义规范为<code, msg> ：operate.serviceName.model.action.type 用户异常：
 *         yryz.cust 好友异常： yryz.relation IM异常： yryz.im 资金异常： yryz.order 红包异常：
 *         yryz.redpacket 打赏异常： yryz.reward 广告异常： yryz.advert 抽奖异常： yryz.lottery
 *         圈子异常： yryz.circle 随手晒异常：yryz.shine
 */
@SuppressWarnings("serial")
public class BasicException extends RuntimeException {

    /* MSG信息描述 */
    public static final String MSG_PARAM_MISSING = "参数类型错误或为空";
    public static final String MSG_PARAM_INVALID = "参数有误";

    public static final String RPC_INVOKE_ERROR = "RPC调用异常";


    /* 系统性异常 */
    public static final String CODE_SYS_ERROR = "1";
    public static final String MSG_SYS_ERROR = "系统异常";

    public static final String CODE_PARAMS_ERROR = "1000";
    public static final String MSG_PARAMS_ERROR = "参数错误";

    public static final String CODE_BUSI_ERROR = "2000";
    public static final String MSG_BUSI_ERROR = "业务逻辑异常";

    public static final String CODE_DISTRIBUTED_LOCK_ERROR = "3000";
    public static final String MSG_DISTRIBUTED_LOCK_ERROR = "分布式锁异常";

    public static final String CODE_USERCREATE_PHONE_EXIST = "4000";
    public static final String CODE_USERCREATE_PHONE_EXIST_EXCEPTION = "该手机号已注册";

    private String code;
    private String msg;
    private Object validate;
    private Integer ret = AppConstants.ERROR; //系统错误

    public BasicException(String code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public BasicException(String code, String msg, Integer ret) {
        super(msg);
        this.code = code;
        this.msg = msg;
        if (ret != null) {
            this.ret = ret;
        }
    }

    public BasicException(String code, String msg, Object validate) {
        super(msg);
        this.code = code;
        this.msg = msg;
        this.validate = validate;
    }

    public Integer getRet() {
        return ret;
    }

    public void setRet(Integer ret) {
        this.ret = ret;
    }

    public BasicException() {
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getValidate() {
        return validate;
    }

    public void setValidate(Object validate) {
        this.validate = validate;
    }

    private static String parseMsg(String msg, String... params) {
        StringBuilder sb = new StringBuilder(msg);
        if (null == params || params.length < 1) {
            return sb.toString();
        }
        sb.append("{");
        for (int i = 0; i < params.length; i++) {
            if (i > 0)
                sb.append(",");
            sb.append(params[i]);
        }
        sb.append("}");
        return sb.toString();
    }

    public static BasicException sysError(String... params) {
        return new BasicException(CODE_SYS_ERROR, parseMsg(MSG_SYS_ERROR, params));
    }

    public static BasicException busiError(String... params) {
        return new BasicException(CODE_BUSI_ERROR, parseMsg(MSG_BUSI_ERROR, params));
    }

    public static BasicException busiException(String code, String msg) {
        return new BasicException(code, msg);
    }

    public static BasicException paramsError(String... params) {
        return new BasicException(CODE_PARAMS_ERROR, parseMsg(MSG_PARAMS_ERROR, params));
    }

    public static BasicException distributedLockError(String... params) {
        return new BasicException(CODE_DISTRIBUTED_LOCK_ERROR, parseMsg(MSG_DISTRIBUTED_LOCK_ERROR, params));
    }

    /**
     * Avoid Dubbo ExceptionFilter
     *
     * @param e
     * @return
     */
    public static BasicException parse(BasicException e) {
        return new BasicException(e.getCode(), e.getMsg());
    }

}
