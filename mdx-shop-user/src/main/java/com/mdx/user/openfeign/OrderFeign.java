package com.mdx.user.openfeign;

import com.mdx.user.handler.OrderFeignHandler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Classname OrderFeign
 * @Description TODO
 * @Date 2023/3/25 18:07
 * @Created by baiyang
 */
@FeignClient(value = "mdx-shop-order",fallback = OrderFeignHandler.class )
@Component
public interface OrderFeign {

    @GetMapping("order/orderTest")
    String order(@RequestParam String orderId,@RequestParam String userId);
}
