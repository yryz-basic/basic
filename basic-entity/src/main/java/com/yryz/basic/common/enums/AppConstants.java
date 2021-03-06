package com.yryz.basic.common.enums;

public interface AppConstants {
    /**
     * 平台用户ID
     */
    public static final String CUST_ID = "custId";
    /**
     * 赊购通用户ID
     */
    public static final String USER_ID = "userId";
    /**
     * 令牌
     */
    public static final String TOKEN = "token";
    /**
     * 未登录
     */
    public final static Integer UNLOGIN = -1;
    /**
     * 成功
     */
    public final static Integer SUCCESS = 1;
    /**
     * 后端提醒
     */
    public final static Integer WARN = 2;
    /**
     * 系统错误
     */
    public final static Integer ERROR = 3;
    /**
     * 登录超时
     */
    public final static Integer TOKEN_OUT = 4;
    /**
     * 加密签名错误
     */
    public final static Integer SIGN_ERROR = 5;
    /**
     * 默认前缀昵称
     */
    public static final String NICK_NAME_PREFIX = "赊购呗";
    /**
     * 邀请码错误
     */
    public static final Integer INVITE_CODE_ERROR = 6;
}
