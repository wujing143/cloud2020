package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: PaymentMain
 * @Author: wujing
 * @Description: 支付服务主启动类
 * @Date: 2020/10/20 13:41
 * @Version: 1.0
 */

@SpringBootApplication
@EnableEurekaClient    //Enable 客户端
@MapperScan(value = "com.atguigu.springcloud.mapper")
public class PaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }


}
