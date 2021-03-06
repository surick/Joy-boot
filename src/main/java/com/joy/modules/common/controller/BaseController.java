package com.joy.modules.common.controller;



import com.joy.modules.common.utils.UserUtils;
import com.joy.modules.sys.entity.UserEntity;
import org.apache.log4j.Logger;

/**
 * 公共的控件器，可在类中实现一些共同的方法和属性 持续更新中
 */
public class BaseController {

    private Logger logger = Logger.getLogger(getClass());

    /**
     * 获取当前登陆用户
     * @return
     */
    public UserEntity getUser(){
        return UserUtils.getCurrentUser();
    }

    /**
     * 获取当前登陆用户Id
     * @return
     */
    public String getUserId(){
        UserEntity user = getUser();
        if(null != user && null !=user.getId()){
            return user.getId();
        }
        return "";
    }


}
