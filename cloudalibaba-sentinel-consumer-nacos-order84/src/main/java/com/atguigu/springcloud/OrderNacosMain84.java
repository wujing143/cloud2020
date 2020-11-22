package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: wujing
 * @Description: Sentinel + ribbon + openFeign +fallback
 * @Date: 2020/11/20 17:42
 * @Version: 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients    //openfeign 开启
public class OrderNacosMain84
{
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain84.class, args);
    }


    // RestTemplate 实现服务之间调用
    @Configuration
    public class ApplicationContextConfig
    {
        @Bean
        @LoadBalanced
        public RestTemplate getRestTemplate()
        {
            return new RestTemplate();
        }
    }


}


