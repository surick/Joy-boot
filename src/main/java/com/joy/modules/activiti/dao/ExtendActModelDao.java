package com.joy.modules.activiti.dao;

import com.joy.modules.activiti.entity.ExtendActModelEntity;
import com.joy.modules.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 流程模板扩展表
 */
@Mapper
public interface ExtendActModelDao extends BaseDao<ExtendActModelEntity> {

    /**
     * 根据模型id获取流程模型和业务相关信息
      * @param modelId
     * @return
     */
    ExtendActModelEntity getModelAndBusInfo(String modelId);

	
}
