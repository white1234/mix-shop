package com.mdx.gateway.config;

import com.alibaba.cloud.nacos.NacosConfigProperties;
import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.PropertyKeyConst;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @Classname GatewayConfigServiceConfig
 * @Description TODO
 * @Date 2023/3/28 11:25
 * @Created by baiyang
 */
@Configuration
public class GatewayConfigServiceConfig {
 @Autowired
 private GatewayRouteConfigProperties gatewayRouteConfigProperties;

 @Autowired
 private NacosConfigProperties nacosConfigProperties;

 @Bean
 public ConfigService configService() throws NacosException {
   Properties properties = new Properties();
   properties.setProperty(PropertyKeyConst.SERVER_ADDR,nacosConfigProperties.getServerAddr());
   properties.setProperty(PropertyKeyConst.NAMESPACE,gatewayRouteConfigProperties.getNamespace());
   return NacosFactory.createConfigService(properties);
 }
}
