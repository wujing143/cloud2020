package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: wujing
 * @Description: 运行健康检查  8001端口的服务
 * @Date: 2020/10/28 11:06
 * @Version: 1.0
 */

@SpringBootApplication
@EnableHystrixDashboard  //开启 服务监控hystrixDashboard
public class HystrixDashboardApplication9001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication9001.class, args);
    }

}
