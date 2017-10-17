package com.yryz.basic.common.constant;

public enum ExceptionEnum {

    ValidateException("1000", "数据验证失败！"),

    //	999已占用，过滤器过滤租户ID异常抛出
//	0-100:语言级逻辑处理类异常
    Exception("1", "服务器内部错误，未知异常！详细信息："),
    MongoOptException("2", "mongo操作异常！详细信息:"),
    MysqlOptException("3", "mysql操作异常！详细信息:"),
    RedisOptException("4", "redis操作异常！详细信息:"),
    DatasOptException("5", "数据库操作异常！详细信息："),
    ParseDatesException("6", "数据类型转换异常！详细信息："),
    SearchServerException("7", "查询操作异常！"),
    RPCException("100", "调用远程RPC服务异常！详细信息："),

    //	非持久层逻辑处理类异常
    IndexOutOfBoundsException("101", "下标越界异常！详细信息："),
    ClassCastException("102", "类型转换异常！详细信息："),
    ClassNotFound("103", "类加载异常！详细信息："),
    IOException("104", "IO操作异常！详细信息："),

    //	数据持久化处理类异常
    DuplicateKeyException("201", "主键或唯一索引冲突！详细信息："),
    BindingException("202", "参数绑定异常！详细信息："),
    SQLException("203", "SQL语句执行异常！详细信息："),
    MyBatisSystemException("204", "Mybatis框架内部异常！详细信息："),
    MyCatIllegalAccessException("205", "反射重写Sql分库规则异常！详细信息："),

    //自定义异常 begin
    ClientCodeIsNull("1001", "客户端编码不能为空"),
    ClientToFailure("1002", "客户端已失效"),
    ClientNotEffective("1003", "客户端未生效"),
    ClientCodeInvalid("1004", "无效的客户端编码"),

    BusiException("2000", "业务异常");
    //自定义异常 end

    private String code;

    private String msg;

    ExceptionEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
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

}
