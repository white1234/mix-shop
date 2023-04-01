package com.mdx.user.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.mdx.user.handler.userOrderBlockHandler;
import com.mdx.user.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Classname UserOrderController
 * @Description TODO
 * @Date 2023/3/25 18:15
 * @Created by baiyang
 */
@RestController
@RequestMapping("userOrder")
public class UserOrderController {
    @Autowired
    @Qualifier("userOrderService")
    private UserOrderService userOrderService;

    @GetMapping("getOrder")
    @SentinelResource(value = "getOrderResource",blockHandlerClass = userOrderBlockHandler.class,blockHandler = "getOrderBlockHandler")
    public String getOrder(@RequestParam String orderId,@RequestParam String userId, HttpServletRequest request){
        return userOrderService.getOrder(orderId,userId);
    }

    @GetMapping("sentinelRel")
    public String sentinelRel(){
        System.out.println("1111");
        return "我是关联接口";
    }




}
