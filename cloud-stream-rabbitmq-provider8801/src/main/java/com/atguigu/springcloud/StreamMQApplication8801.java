package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: wujing
 * @Description: Spring Cloud Stream  是一个构建消息驱动微服务的框架
 *
 * StreamMQApplication8801： 消息的发送者
 *
 * @Date: 2020/11/4 13:52
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQApplication8801 {

    public static void main(String[] args) {
        SpringApplication.run(StreamMQApplication8801.class, args);
    }
}
