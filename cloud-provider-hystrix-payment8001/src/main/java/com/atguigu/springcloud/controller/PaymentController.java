package com.atguigu.springcloud.controller;

import cn.hutool.core.util.IdUtil;
import com.atguigu.springcloud.service.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: wujing
 * @Description:
 * @Date: 2020/10/26 10:40
 * @Version: 1.0
 */
@RestController
@Slf4j
@Api(description="Hystrix 熔断限流")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    @ApiOperation("成功OK")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_OK(id);
        log.info("*******result:"+result);
        return result;
    }

    @ApiOperation("超时3秒")
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_TimeOut(id);
        log.info("*******result:"+result);
        return result;
    }

    @GetMapping("/payment/hystrix/uuid/{id}")
    @ApiOperation("生产UUID")
    public String paymentUUID(@PathVariable("id") Integer id){
        String simpleUUID = IdUtil.simpleUUID();
        log.info("*******result:"+simpleUUID);
        return "id:"+id+"====="+simpleUUID;
    }


    @GetMapping("/payment/circuit/{id}")
    @ApiOperation("服务熔断,正数正常，负数异常")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("*******result:"+result);
        return result;
    }





}
