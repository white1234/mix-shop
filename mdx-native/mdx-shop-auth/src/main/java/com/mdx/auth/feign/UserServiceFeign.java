package com.mdx.auth.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Classname UserServiceFeign
 * @Description TODO
 * @Date 2023/4/1 20:22
 * @Created by baiyang
 */
@FeignClient(name = "mdx-shop-user")
public interface UserServiceFeign {
}
