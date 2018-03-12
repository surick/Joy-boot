package com.joy.modules.sys.dao;

import com.joy.modules.common.dao.BaseDao;
import com.joy.modules.sys.entity.NoticeUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 通知和用户关系表
 * 
 * @author joy
 * @email huangxianyuan@gmail.com
 * @date 2017-08-31 15:58:58
 */
@Mapper
public interface NoticeUserDao extends BaseDao<NoticeUserEntity> {
    /**
     * 根据通知id和用户id 更新
     * @param noticeUserEntity
     * @return
     */
    int updateByNoticeIdUserId(NoticeUserEntity noticeUserEntity);
}
