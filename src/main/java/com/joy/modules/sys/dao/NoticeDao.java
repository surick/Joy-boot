package com.joy.modules.sys.dao;


import com.joy.modules.common.dao.BaseDao;
import com.joy.modules.sys.entity.NoticeEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 通知
 */
@Mapper
public interface NoticeDao extends BaseDao<NoticeEntity> {

    /**
     * 我的通知列表
     * @param noticeEntity
     * @return
     */
    List<NoticeEntity> findMyNotice(NoticeEntity noticeEntity);
}
