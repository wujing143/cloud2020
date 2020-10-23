package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import sun.applet.Main;

/**
 * @Author: wujing
 * @Description: Consul服务注册  主启动类
 * @Date: 2020/10/23 14:14
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
//该微服务 启动前提，Consul 要打开
public class PaymentApplication8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8006.class, args);
    }
}
