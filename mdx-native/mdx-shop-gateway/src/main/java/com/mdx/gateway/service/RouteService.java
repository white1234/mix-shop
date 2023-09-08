package com.mdx.gateway.service;

import org.springframework.cloud.gateway.route.RouteDefinition;

/**
 * @Classname RouteService
 * @Description TODO
 * @Date 2023/3/28 11:34
 * @Created by baiyang
 */

public interface RouteService {
 /**
  * 更新路由配置
  *
  * @param routeDefinition
  */
 void update(RouteDefinition routeDefinition);

 /**
  * 添加路由配置
  *
  * @param routeDefinition
  */
 void add(RouteDefinition routeDefinition);
}
