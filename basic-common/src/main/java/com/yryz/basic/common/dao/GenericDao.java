package com.yryz.basic.common.dao;

import org.springframework.stereotype.Repository;

import java.io.Serializable;


/**
 * 通用dao接口封装，提供基础的增删查改操作
 *
 * @param <T> 接收所有标记接口Pojo类型的实体对象
 * @param <PK> 接收所有Serializable类型的主键
 */
@Repository
public interface GenericDao<T extends Serializable> {
	
	/**
	 * 插入记录操作，返回主键值
	 * @param record
	 * @return
	 */
	void insert(T record) throws Exception;
	
	/**
	 * 根据主键删除一条记录
	 * @param id
	 * @return
	 */
	int deleteById(Long id) throws Exception;
	
	/**
	 * 根据主键查单条记录
	 * @param id
	 * @return
	 */
	T selectById(Long id) throws Exception;
	
	/**
	 * 修改记录
	 * @param record
	 * @return
	 */
	int update(T record) throws Exception;
	
}