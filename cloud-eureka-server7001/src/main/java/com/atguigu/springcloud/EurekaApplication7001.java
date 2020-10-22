package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: wujing
 * @Description: 单机模式：Eurka服务注册中心
 * @Date: 2020/10/21 16:18
 * @Version: 1.0
 */
@EnableEurekaServer   //表示 7001这个服务 就是注册中心 ，我来管理配置、登记、注册
@SpringBootApplication
public class EurekaApplication7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication7001.class, args);
    }
}
