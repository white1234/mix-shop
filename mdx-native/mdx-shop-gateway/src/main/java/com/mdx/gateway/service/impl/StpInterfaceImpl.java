package com.mdx.gateway.service.impl;

import cn.dev33.satoken.stp.StpInterface;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname StpInterfaceImpl
 * @Description TODO
 * @Date 2023/4/1 23:33
 * @Created by baiyang
 */
@Component
public class StpInterfaceImpl implements StpInterface {
     /**
      *当前全部是模拟数据，真实情况使用根据loginId动态查询对应角色和权限
      */
     @Override
     public List<String> getPermissionList(Object loginId, String loginType) {
      // 返回此 loginId 拥有的权限列表
      List<String> strs = new ArrayList<>();
      strs.add("system");
      strs.add("orders");
      return strs;
     }

     @Override
     public List<String> getRoleList(Object loginId, String loginType) {
      // 返回此 loginId 拥有的角色列表
      List<String> strs = new ArrayList<>();
      strs.add("admin");
      return strs;
     }

}
