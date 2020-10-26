package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.common.CommonResult;
import com.atguigu.springcloud.entities.payment.Payment;
import com.atguigu.springcloud.service.OrderFeignService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: wujing
 * @Description:
 * @Date: 2020/10/26 9:44
 * @Version: 1.0
 */

@RestController
@Slf4j
@Api(description = "OpenFeign实现远程调用接口")
public class OrderFeignController {

    @Resource
    private OrderFeignService orderFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        //调用远程接口，
        return orderFeignService.getPayment(id);
    }
}

