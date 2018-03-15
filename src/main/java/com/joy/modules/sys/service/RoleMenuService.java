package com.joy.modules.sys.service;

import java.util.List;
import java.util.Map;

/**
 * 权限角色表
 */
public interface RoleMenuService {

	
	List<String> queryListByRoleId(String id);

	void save(Map<String, Object> map);
	
	void delete(String roleId);
	
	void deleteBatch(String[] roleIds);
}
