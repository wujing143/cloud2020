package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.common.CommonResult;
import com.atguigu.springcloud.entities.seata.Order;
import com.atguigu.springcloud.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @ClassName: OrderController
 * @Author: Wu
 * @Date: 2020/11/23 22:14
 */
@RestController
@Api
public class OrderController{
    @Resource
    private OrderService orderService;


    @ApiOperation("创建订单")
    @PostMapping("/order/create")
    public CommonResult create(@RequestBody Order order)
    {
        orderService.create(order);
        return new CommonResult("200","订单创建成功");
    }
}
