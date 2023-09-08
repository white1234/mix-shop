package com.mdx.order.repository;

import com.mdx.order.entity.OrderTbl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Classname OrderRepository
 * @Description TODO
 * @Date 2023/3/27 13:08
 * @Created by baiyang
 */
@Repository
public interface OrderRepository extends JpaRepository<OrderTbl,Integer> {
}
