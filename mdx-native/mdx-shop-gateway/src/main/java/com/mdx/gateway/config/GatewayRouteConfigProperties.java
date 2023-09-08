package com.mdx.gateway.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Classname GatewayConfig
 * @Description TODO
 * @Date 2023/3/28 11:19
 * @Created by baiyang
 */
@Data
@Component
@ConfigurationProperties("gateway.routes.config")
public class GatewayRouteConfigProperties  {
 private String dataId;

 private String group;

 private String namespace;
}
