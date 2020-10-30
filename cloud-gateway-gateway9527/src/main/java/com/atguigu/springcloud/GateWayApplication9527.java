package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: wujing
 * @Description: Gate网关
 *    三大核心概念： 【Route(路由)。Predicate（断言）。Filter(过滤)】
 * @Date: 2020/10/28 15:06
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient   //注册到Eureka中心
public class GateWayApplication9527 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication9527.class, args);
    }
}
