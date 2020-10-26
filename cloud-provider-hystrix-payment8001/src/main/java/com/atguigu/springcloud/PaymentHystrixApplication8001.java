package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: wujing
 * @Description: Hystrix 带熔断器的8001服务
 * @Date: 2020/10/26 10:36
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrixApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixApplication8001.class,args);
    }
}
