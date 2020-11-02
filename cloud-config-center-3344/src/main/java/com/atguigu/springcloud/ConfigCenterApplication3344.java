package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: wujing
 * @Description: Config配置服务端
 * @Date: 2020/11/2 9:52
 * @Version: 1.0
 */
@SpringBootApplication
@EnableConfigServer         //Config 服务端
public class ConfigCenterApplication3344 {
    public static void main(String[] args) {

        SpringApplication.run(ConfigCenterApplication3344.class, args);
    }
}
