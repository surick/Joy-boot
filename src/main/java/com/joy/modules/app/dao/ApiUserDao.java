package com.joy.modules.app.dao;

import com.joy.modules.app.entity.ApiUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 系统用户表
 */
@Mapper
public interface ApiUserDao{
    /**
     * 根据id获取用户相关信息
     * @param id
     * @return
     */
    ApiUserEntity userInfo(String id);
}
