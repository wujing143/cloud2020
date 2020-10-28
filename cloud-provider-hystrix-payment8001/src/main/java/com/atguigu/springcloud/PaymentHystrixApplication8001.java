package com.atguigu.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @Author: wujing
 * @Description: Hystrix 带熔断器的8001服务
 * @Date: 2020/10/26 10:36
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient      //注册到Eureka服务中心
@EnableCircuitBreaker  //开启 8001 fallback 服务降级
public class PaymentHystrixApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixApplication8001.class,args);
    }

//    注意：新版本Hystrix需要在主启动类MainAppHystrix8001中指定监控路径，
//    不然监控显示找不到Unable to connect to Command Metric Stream.
    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream"); //http://localhost:8001/hystrix.stream
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }


}
