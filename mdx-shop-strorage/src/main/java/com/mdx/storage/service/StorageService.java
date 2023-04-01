package com.mdx.storage.service;

/**
 * @Classname StorageService
 * @Description TODO
 * @Date 2023/3/27 12:37
 * @Created by baiyang
 */

public interface StorageService {

 /**
  * 扣除存储数量
  */
 void deduct(String commodityCode, int count);
}
