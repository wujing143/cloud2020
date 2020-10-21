package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: wujing
 * @Description: 集群模式：Eurka服务注册中心   这个也是一个 EurekaServer
 * @Date: 2020/10/21 16:18
 * @Version: 1.0
 */
@EnableEurekaServer   //表示 7002这个服务 就是注册中心 ，我来管理配置、登记、注册
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
