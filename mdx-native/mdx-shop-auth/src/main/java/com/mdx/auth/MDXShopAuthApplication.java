package com.mdx.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.swing.*;

/**
 * @Classname MDXShopAuthApplication
 * @Description TODO
 * @Date 2023/3/28 17:02
 * @Created by baiyang
 */

@SpringBootApplication
@EnableFeignClients
public class MDXShopAuthApplication {
 public static void main(String[] args) {
  SpringApplication.run(MDXShopAuthApplication.class,args);
 }
}
