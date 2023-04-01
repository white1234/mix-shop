package com.mdx.storage.controller;

/**
 * @Classname StrorageController
 * @Description TODO
 * @Date 2023/3/27 12:39
 * @Created by baiyang
 */

import com.mdx.common.base.CommonResponse;
import com.mdx.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : jiagang
 * @date : Created in 2022/7/1 18:42
 */
@RestController
@RefreshScope
@RequestMapping("/storage")
public class StorageController {

 @Autowired
 private StorageService service;

 @Value("${mdx-shop-user.test.userId}")
 private String my_test_tx_group;

 @GetMapping("/deduct")
 public CommonResponse deduct(String commodityCode, int count){
  service.deduct(commodityCode, count);
  return CommonResponse.success();
 }

 @GetMapping("getGroupMapping")
 public String getGroupMapping(){
  return my_test_tx_group;
 }


}
