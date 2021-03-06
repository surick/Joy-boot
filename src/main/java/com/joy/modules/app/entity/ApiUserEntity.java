package com.joy.modules.app.entity;


import com.joy.modules.sys.entity.UserEntity;

/**
 * 用户信息接口信息
 */

public class ApiUserEntity extends UserEntity {

    /**
     * 我的待办条数
     */
    private int myUpcomingCount;
    /**
     * 我的消息条数
     */
    private int myNoticeCount;

    public int getMyUpcomingCount() {
        return myUpcomingCount;
    }

    public void setMyUpcomingCount(int myUpcomingCount) {
        this.myUpcomingCount = myUpcomingCount;
    }

    public int getMyNoticeCount() {
        return myNoticeCount;
    }

    public void setMyNoticeCount(int myNoticeCount) {
        this.myNoticeCount = myNoticeCount;
    }
}
