package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description:
 * @ClassName: SeataStorageApplication2002
 * @Author: Wu
 * @Date: 2020/11/23 21:45
 */
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.atguigu.springcloud.controller"})
@MapperScan(value = "com.atguigu.springcloud.mapper")
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//取消数据源自动创建的配置
@SpringBootApplication
public class SeataStorageApplication2002 {
    public static void main(String[] args) {
        SpringApplication.run(SeataStorageApplication2002.class, args);
    }
}
