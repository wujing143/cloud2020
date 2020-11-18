package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: wujing
 * @Description: Sentinel 服务
 *  作用：监控服务
 *  解决：服务雪崩 ，服务熔断，服务降级，服务限流
 * @Date: 2020/11/17 10:40
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelApplication8401 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelApplication8401.class, args);
    }
}
