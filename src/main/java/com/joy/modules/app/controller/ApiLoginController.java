package com.joy.modules.app.controller;


import com.joy.modules.app.service.ApiUserService;
import com.joy.modules.app.utils.JwtUtils;
import com.joy.modules.common.utils.Result;
import com.joy.modules.sys.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * APP登录授权
 */
@Controller
@RequestMapping("/app")
public class ApiLoginController {
    @Autowired
    private ApiUserService userApiService;
    @Autowired
    private JwtUtils jwtUtils;

    /**
     * 登录
     */
    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public Result login(UserEntity userEntity){
        //用户登录
        String userId = userApiService.login(userEntity);

        //生成token
        String token = jwtUtils.generateToken(userId);

        Map<String, Object> map = new HashMap<>();
        map.put("token", token);
        map.put("expire", jwtUtils.getExpire());

        return Result.ok(map);
    }

}
