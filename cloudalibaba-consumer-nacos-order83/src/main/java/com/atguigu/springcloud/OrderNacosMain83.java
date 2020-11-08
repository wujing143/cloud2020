package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description : Nacos 消费者调用9001/9002，证明负载均衡
 * @Author : wujing
 * @Date: 2020-11-08 16:46
 */

@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain83{

    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain83.class, args);
    }


    /**
     * @Description: 给 RestTemplate 实例添加 @LoadBalanced 注解，开启 @LoadBalanced 与 Ribbon 的集成
     * @return: org.springframework.web.client.RestTemplate
     */
    @Configuration
    class ApplicationContextConfig
    {
        @Bean
        @LoadBalanced  //开启负载均衡的功能
        public RestTemplate getRestTemplate()
        {
            return new RestTemplate();
        }
    }


}
