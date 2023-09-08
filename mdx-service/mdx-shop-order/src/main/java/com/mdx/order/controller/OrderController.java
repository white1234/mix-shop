package com.mdx.order.controller;

import com.mdx.common.base.CommonResponse;
import com.mdx.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname OrderTestController
 * @Description TODO
 * @Date 2023/3/25 13:13
 * @Created by baiyang
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    @Qualifier("orderService")
    private OrderService orderService;

    @GetMapping("orderTest")
    public String orderTest(@RequestParam String orderId,@RequestParam String userId){
        return orderService.order(orderId,userId);
    }

    /**
     * 用户下单接口
     * @param userId
     * @param commodityCode
     * @return
     */
    @PostMapping("createOrder")
    public CommonResponse<String> createOrder(String userId, String commodityCode){
        return CommonResponse.success(orderService.createOrder(userId,commodityCode));
    }
}
