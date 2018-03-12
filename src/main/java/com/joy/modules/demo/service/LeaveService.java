package com.joy.modules.demo.service;


import com.joy.modules.common.page.Page;
import com.joy.modules.demo.entity.LeaveEntity;

import java.util.List;
import java.util.Map;

/**
 * 请假流程测试
 *
 */
public interface LeaveService {
	
	LeaveEntity queryObject(String id);
	
	List<LeaveEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(LeaveEntity leave);
	
	void update(LeaveEntity leave);
	
	int delete(String id);
	
	void deleteBatch(String[] ids);

	Page<LeaveEntity> findPage(LeaveEntity leaveEntity, int pageNum);
}
