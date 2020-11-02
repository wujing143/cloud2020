package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: wujing
 * @Description: 复制3355
 * @Date: 2020/11/2 16:06
 * @Version: 1.0
 */

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication3366.class,args);
    }
}
