package com.joy.modules.demo.dao;

import com.joy.modules.common.dao.BaseDao;
import com.joy.modules.demo.entity.LeaveEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 请假流程测试
 */
@Mapper
public interface LeaveDao extends BaseDao<LeaveEntity> {
	
}
