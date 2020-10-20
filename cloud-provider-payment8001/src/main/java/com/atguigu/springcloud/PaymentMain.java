package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

/**
 * @ClassName: PaymentMain
 * @Author: wujing
 * @Description: 支付服务主启动类
 * @Date: 2020/10/20 13:41
 * @Version: 1.0
 */


@MapperScan(value = "com.atguigu.springcloud.mapper")
public interface PaymentMain {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain.class, args);
    }


}
