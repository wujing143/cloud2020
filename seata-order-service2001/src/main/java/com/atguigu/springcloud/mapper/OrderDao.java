package com.atguigu.springcloud.mapper;

import com.atguigu.springcloud.entities.seata.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @ClassName: OrderDao
 * @Author: Wu
 * @Date: 2020/11/23 21:16
 */
public interface OrderDao
{
    //新建订单
    void create(Order order);

    //修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}