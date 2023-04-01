package com.mdx.order.service.impl;

import com.mdx.common.exception.BizException;
import com.mdx.order.entity.OrderTbl;
import com.mdx.order.feign.StorageFeign;
import com.mdx.order.repository.OrderRepository;
import com.mdx.order.service.OrderService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname OderTestServiceImpl
 * @Description TODO
 * @Date 2023/3/25 13:20
 * @Created by baiyang
 */
@Service(value = "orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    StorageFeign storageFeign;

    @Autowired
    OrderRepository orderRepository;

    @Override
    public String order(String orderId, String userId) {
        if(orderId.equals("11111".trim()) && userId.equals("user-dev-1111".trim())){
            System.out.println(orderId=="11111");
            return "下单成功!";
        }else {
            throw new IllegalArgumentException("下单失败！");
        }
    }

    @GlobalTransactional
    @Override
    public String createOrder(String userId, String commodityCode) {
        try {
            System.out.println("事务id---------------------->" + RootContext.getXID());
            OrderTbl orderTbl = new OrderTbl();
            orderTbl.setUserId(userId);
            orderTbl.setCommodityCode(commodityCode);
            orderTbl.setCount(1); // 假设为1件
            orderTbl.setMoney(10); // 假设为十元
            orderRepository.save(orderTbl);
            storageFeign.deduct(commodityCode,orderTbl.getCount());
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            throw new BizException("创建订单失败");
        }
    }
}
