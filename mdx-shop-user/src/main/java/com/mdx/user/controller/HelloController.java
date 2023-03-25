package com.mdx.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2023/3/25 0:31
 * @Created by baiyang
 */
@RestController
@RefreshScope
@RequestMapping("test")
public class HelloController {

    @Value("${mdx-shop-user.test.userId}")
    private String userId;

    @Value("${mdx-shop-user.test.username}")
    private String username;

    @GetMapping("queryUserName")
    public String queryUserName(){
        return userId+":"+username;
    }
}
