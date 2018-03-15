package com.joy.modules.sys.dao;


import com.joy.modules.common.dao.BaseDao;
import com.joy.modules.sys.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * 系统日志
 *
 */
@Mapper
public interface SysLogDao extends BaseDao<SysLogEntity> {
	
}
