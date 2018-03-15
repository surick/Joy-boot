package com.joy.modules.activiti.service;

import com.joy.modules.activiti.entity.ExtendActModelEntity;
import com.joy.modules.common.page.Page;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 流程模板扩展表
 */
public interface ExtendActModelerService {
	
	ExtendActModelEntity queryObject(String id);
	
	List<ExtendActModelEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	String save(ExtendActModelEntity extendActModel) throws Exception;

	int update(ExtendActModelEntity extendActModel);

	int delete(String id);

	int deleteBatch(String[] ids);

	/**
	 * 分页列表
	 * @param riskMarEntity
	 * @param pageNum
	 * @return
	 */
	Page<ExtendActModelEntity> findPage(ExtendActModelEntity riskMarEntity, int pageNum);

	/**
	 * 部署流程
	 * @param modelId 模型id
	 */
	void deploy(String modelId) throws IOException;






}
