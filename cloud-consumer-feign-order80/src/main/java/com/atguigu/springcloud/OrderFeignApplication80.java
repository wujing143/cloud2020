package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: wujing
 * @Description: OpenFeign 实现服务调用
 * @Date: 2020/10/26 9:37
 * @Version: 1.0
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix      //开启 80 fallback 服务降级  [8001服务降级用注解：@EnableCircuitBreaker ]
public class OrderFeignApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignApplication80.class,args);
    }
}
