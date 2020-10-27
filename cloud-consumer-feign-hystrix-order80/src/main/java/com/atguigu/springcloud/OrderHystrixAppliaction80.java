package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: wujing
 * @Description: feign-hystrix
 * @Date: 2020/10/26 14:13
 * @Version: 1.0
 */

@SpringBootApplication
@EnableFeignClients    //开启 Feigen，{IPC接口}
public class OrderHystrixAppliaction80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixAppliaction80.class, args);
    }
}
