package com.joy.modules.activiti.dao;

import com.joy.modules.activiti.entity.ExtendActTasklogEntity;
import com.joy.modules.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExtendActTasklogDao extends BaseDao<ExtendActTasklogEntity> {
    /**
     * 根据任务id 更改日志
     * @param extendActTasklogEntity
     * @return
     */
    int updateByTaskId(ExtendActTasklogEntity extendActTasklogEntity);

    /**
     * 转办任务时更新任务日志，有可能会存在多次转办，就会产生多条任务日志，所有这里用 taskId+appAction为空 作唯一
     * @param extendActTasklogEntity
     * @return
     */
    int updateByTaskIdOpinion(ExtendActTasklogEntity extendActTasklogEntity);
}
