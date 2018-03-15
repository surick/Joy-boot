package com.joy.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 权限角色表
 *
 */
@Mapper
public interface RoleMenuDao {
    int delete(Map<String, Object> map);

    int deleteBatch(Object[] ids);

    int delete(Object id);

    void save(Map<String, Object> map);

    List<String> queryListByRoleId(String roleId);
}
