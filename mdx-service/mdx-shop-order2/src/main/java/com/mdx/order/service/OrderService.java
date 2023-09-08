package com.mdx.order.service;

/**
 * @Classname OderTestService
 * @Description TODO
 * @Date 2023/3/25 13:19
 * @Created by baiyang
 */
public interface OrderService {
    String order(String orderId,String userId);
    /**
     * 下单接口
     * @param userId 用户id
     * @param commodityCode 商品代码
     * @return
     */
    String createOrder(String userId, String commodityCode);

}
