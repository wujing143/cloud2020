package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.seata.Order;

/**
 * @Description:
 * @ClassName: OrderService
 * @Author: Wu
 * @Date: 2020/11/23 21:40
 */
public interface OrderService {
    void create(Order order);
}
