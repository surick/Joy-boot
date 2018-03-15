package com.joy.modules.quartz.dao;


import com.joy.modules.common.dao.BaseDao;
import com.joy.modules.quartz.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 */
@Mapper
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
}
