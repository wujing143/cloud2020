package com.atguigu.springcloud.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: wujing
 * @Description: spring配置类
 * @Date: 2020/10/21 15:36
 * @Version: 1.0
 */

@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced   //使用 @LoadBalanced 注解赋予 RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
