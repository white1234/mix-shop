package com.mdx.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Classname com.mdx.user.MDXShopUserApplication
 * @Description TODO
 * @Date 2023/3/24 18:50
 * @Created by baiyang
 */
@EnableFeignClients
@SpringBootApplication
public class MDXShopUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(MDXShopUserApplication.class, args);
    }
}
