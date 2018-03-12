package com.joy.modules.activiti.dao;

import com.joy.modules.activiti.entity.ExtendActNodeuserEntity;
import com.joy.modules.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 节点可选人
 * 
 * @author joy
 * @email huangxianyuan@gmail.com
 * @date 2017-07-24 13:28:51
 */
@Mapper
public interface ExtendActNodeuserDao extends BaseDao<ExtendActNodeuserEntity> {

    /**
     * 根据节点获取节点审批人员信息
     * @param nodeId
     */
    List<ExtendActNodeuserEntity> getNodeUserByNodeId(String nodeId);

    /**
     * 根据节点Id删除
     * @param nodeId
     */
    void delByNodeId(String nodeId);
	
}
