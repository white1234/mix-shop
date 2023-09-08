package com.mdx.user.handler;

import com.mdx.user.openfeign.OrderFeign;
import org.springframework.stereotype.Component;

/**
 * @Classname OrderFeignHandler
 * @Description TODO
 * @Date 2023/3/25 19:00
 * @Created by baiyang
 */
@Component
public class OrderFeignHandler implements OrderFeign {
 @Override
  public String order(String orderId, String userId) {
   String fallback = "当前人数过多,休息一会再试";
   return fallback;
  }
}
