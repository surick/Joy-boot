package com.joy.modules.app.service;


import com.joy.modules.app.entity.ApiUserEntity;
import com.joy.modules.sys.entity.UserEntity;
import com.joy.modules.sys.service.UserService;

/**
 * 用户
 */
public interface ApiUserService extends UserService {

	/**
	 * 用户登录
	 * @return          返回用户ID
	 */
	String login(UserEntity userEntity);

	/**
	 * 根据id获取用户相关信息
	 * @param id
	 * @return
	 */
	ApiUserEntity userInfo(String id);

	/**
	 * 修改密码
	 * @param oldUser
	 * @param newUser
	 * @return
	 */
	int updatePassword(UserEntity newUser, UserEntity oldUser);

}
