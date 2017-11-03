package com.yryz.basic.modules.id.api;



import com.yryz.service.api.api.exception.ServiceException;

import java.util.List;

/**
 * @author zhangkun
 * @version 1.0
 * @date 2017/8/15
 * @description 发号器服务
 */
public interface IdAPI {

    /**
     * 根据type获取id
     * @param type
     * @return
     * @throws ServiceException
     */
    Long getId(String type) throws ServiceException;


    /**
     * 基于Twitter的分布式自增ID算法Snowflake实现分布式有序
     * @return 返回18位的自增ID
     * @throws ServiceException
     */
    Long getSnowflakeId() throws ServiceException;

    /**
     * 返回指定个数的id
     * 基于Twitter的分布式自增ID算法Snowflake实现分布式有序
     * @param num
     * @return
     * @throws ServiceException
     */
    List<Long> getSnowflakeIds(Integer num) throws ServiceException;


}
