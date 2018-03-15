package com.joy.modules.quartz.dao;


import com.joy.modules.common.dao.BaseDao;
import com.joy.modules.quartz.entity.ScheduleJobEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 *
 * 定时任务
 *
 */
@Mapper
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
