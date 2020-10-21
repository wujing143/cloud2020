package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.applet.Main;

/**
 * @ClassName: OrderApplication
 * @Author: wujing
 * @Description: order服务主启动类
 * @Date: 2020/10/21 14:01
 * @Version: 1.0
 */
@SpringBootApplication
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
