package com.mdx.user.service.impl;

import com.mdx.user.openfeign.OrderFeign;
import com.mdx.user.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname UserOrderServiceImpl
 * @Description TODO
 * @Date 2023/3/25 18:16
 * @Created by baiyang
 */
@Service("userOrderService")
public class UserOrderServiceImpl implements UserOrderService {
 @Autowired
 private OrderFeign orderFeign;

 @Override
 public String getOrder(String orderId, String userId) {
   return orderFeign.order(orderId,userId);
 }
}
