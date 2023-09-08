package com.mdx.storage;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Classname MDXShopStorageApplication
 * @Description TODO
 * @Date 2023/3/27 12:10
 * @Created by baiyang
 */
@SpringBootApplication
@EnableAutoDataSourceProxy
@EnableFeignClients
public class MDXShopStorageApplication {
 public static void main(String[] args) {
  SpringApplication.run(MDXShopStorageApplication.class,args);
 }
}
