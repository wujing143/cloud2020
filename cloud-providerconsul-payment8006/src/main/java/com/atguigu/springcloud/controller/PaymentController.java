package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.common.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @Author: wujing
 * @Description:
 * @Date: 2020/10/23 14:16
 * @Version: 1.0
 */

@RestController
@Slf4j
@Api("支付服务8006")
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/consul")
    @ApiOperation("测试Consul服务注册中心")
    public String paymentConsul(){
        return "springcloud with consul: "+serverPort+"\t"+ UUID.randomUUID().toString();
    }

}

