package com.joy.modules.activiti.service;

import com.joy.modules.activiti.entity.ExtendActNodefieldEntity;

import java.util.List;
import java.util.Map;

/**
 * 流程节点对应的字段权限表
 */
public interface ExtendActNodefieldService {
	
	ExtendActNodefieldEntity queryObject(String id);
	
	List<ExtendActNodefieldEntity> queryList(Map<String, Object> map);

	int queryTotal(Map<String, Object> map);
	
	void save(ExtendActNodefieldEntity extendActNodefield);
	
	void update(ExtendActNodefieldEntity extendActNodefield);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

	/**
	 * 根据节点集合查询
	 * @param nodes
	 * @return
	 */
	List<ExtendActNodefieldEntity> queryByNodes(List<String> nodes);

}
