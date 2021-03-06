package com.joy.modules.sys.dao;

import com.joy.modules.common.dao.BaseDao;
import com.joy.modules.sys.entity.UserRoleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户角色关系表
 *
 */
@Mapper
public interface UserRoleDao extends BaseDao<UserRoleEntity> {

    /**
     * 根据用户ID，获取角色ID列表
     */
    List<String> queryRoleIdList(String userId);

    /**
     * 根据用户list批量删除用户角色中间表
     * @param users
     * @return
     */
    int deleteBatchByUserId(String[] users);

    /**
     * 根据角色list批量删除用户角色中间表
     * @param roles
     * @return
     */
    int deleteBatchByRoleId(String[] roles);

	
}
