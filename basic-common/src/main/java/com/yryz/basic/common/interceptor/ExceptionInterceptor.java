package com.yryz.basic.common.interceptor;

import com.alibaba.dubbo.rpc.*;
import com.yryz.basic.common.constant.ExceptionEnum;
import com.yryz.basic.common.exception.BasicException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 统一异常处理
 * */
public class ExceptionInterceptor implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionInterceptor.class);
    
    /**
     * 将异常统一抛出，转换成ServiceException
     * */
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        try {
        	Result result = invoker.invoke(invocation);
        	if(result != null && result.getException() != null){
        		throw result.getException();
        	}
        	
            return result;
        } catch (BasicException be) {
            logger.error("[Throwable]：", be);
            return new RpcResult(new BasicException(be.getCode(),
                    be.getMsg()));
        } catch (Throwable e) {
            logger.error("[Throwable]：", e);
            return new RpcResult(new BasicException(ExceptionEnum.Exception.getCode(),
                    ExceptionEnum.Exception.getMsg()));
        }
    }

}
