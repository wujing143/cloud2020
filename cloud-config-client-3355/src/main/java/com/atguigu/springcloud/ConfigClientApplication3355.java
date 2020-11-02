package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: wujing
 * @Description: Config-客户端，通过confg-server3344，读取到GitHub上的yml配置文件
 * @Date: 2020/11/2 11:09
 * @Version: 1.0
 *
 *  每次配置文件改变，不需要重启3355，只需要运维人员发送 Post 请求刷新3355
 *  C:\Users\PC>curl -X POST "http://localhost:3355/actuator/refresh"
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication3355 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication3355.class, args);
    }
}
