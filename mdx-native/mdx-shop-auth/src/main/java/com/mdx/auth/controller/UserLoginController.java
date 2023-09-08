package com.mdx.auth.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.mdx.common.response.BaseResponse;
import com.mdx.common.response.RespGenerator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname UserLoginController
 * @Description TODO
 * @Date 2023/4/1 20:19
 * @Created by baiyang
 */
@RestController
@RequestMapping(value = "/auth")
public class UserLoginController {

    @PostMapping("/phoneLogin")
    public BaseResponse<Object> getAwardCount(String phone, String password) {
        //获取当前登录用户基本权限信息
        if(phone.equals("18874288922") && password.equals("123")){
            StpUtil.login(1001,"PC");
            return new RespGenerator().success(StpUtil.getTokenInfo());
        }
        return new RespGenerator().fail("手机号或密码错误");
    }

}
