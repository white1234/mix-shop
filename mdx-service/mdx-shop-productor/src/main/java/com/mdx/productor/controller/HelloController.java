package com.mdx.productor.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2023/3/25 10:24
 * @Created by baiyang
 */
@RestController
@RefreshScope
@RequestMapping("productor")
public class HelloController {
    @Value("${productor.shop.name}")
    private String name;

    @Value("${mdx-shop.productor.id}")
    private String pid;

    @GetMapping("getProductorName")
    public String getName() {
        return pid+":"+name;
    }
}
