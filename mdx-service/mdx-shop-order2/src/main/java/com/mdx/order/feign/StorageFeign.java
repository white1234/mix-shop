package com.mdx.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Classname StorageFeign
 * @Description TODO
 * @Date 2023/3/27 13:01
 * @Created by baiyang
 */

@FeignClient("mdx-shop-storage")
@Component
public interface StorageFeign {
 @GetMapping("/storage/deduct")
String deduct(@RequestParam String commodityCode,@RequestParam int count);
}
