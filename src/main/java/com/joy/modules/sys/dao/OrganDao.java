package com.joy.modules.sys.dao;

import com.joy.modules.common.dao.BaseDao;
import com.joy.modules.sys.entity.OrganEntity;
import com.joy.modules.sys.entity.UserWindowDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 组织表
 * 
 *
 */
@Mapper
public interface OrganDao extends BaseDao<OrganEntity> {
    /**
     * 根据实体条件查询
     * @return
     */
    List<UserWindowDto> queryPageByDto(UserWindowDto userWindowDto);
}
