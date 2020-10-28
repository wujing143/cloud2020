package com.atguigu.springcloud.service;

import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @Author: wujing
 * @Description:
 * @Date: 2020/10/26 17:43
 * @Version: 1.0
 */
//@Component
//@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT")
//public interface OrderHystrixService {
//
//    @ApiOperation("成功OK")
//    @GetMapping("/payment/hystrix/ok/{id}")
//    public String paymentInfo_OK(@PathVariable("id") Integer id);
//
//    @ApiOperation("超时3秒")
//    @GetMapping("/payment/hystrix/timeout/{id}")
//    public String paymentInfo_TimeOut(@PathVariable("id") Integer id);
//
//}

