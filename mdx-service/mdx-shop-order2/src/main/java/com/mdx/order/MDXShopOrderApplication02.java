package com.mdx.order;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Classname MDXShopOrderApplication
 * @Description TODO
 * @Date 2023/3/25 13:15
 * @Created by baiyang
 */
@SpringBootApplication
@EnableAutoDataSourceProxy
@EnableFeignClients
public class MDXShopOrderApplication02 {
    public static void main(String[] args) {
        SpringApplication.run(MDXShopOrderApplication02.class,args);
    }
}
