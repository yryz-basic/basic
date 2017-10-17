package com.yryz.basic.common.dao;

import java.io.Serializable;

/**
 * 
 * @param <T> 接收所有Id类型的实体对象
 * @param <PK> 接收所有Serializable类型的主键
 */
public interface BaseDao<T extends Serializable> extends GenericDao<T> {

}
