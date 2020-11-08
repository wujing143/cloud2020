package springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Description : Nacos
 * @Author : wujing
 * @Date: 2020-11-08 15:33
 */


@SpringBootApplication
@EnableDiscoveryClient  //开启服务注册发现功能
public class PaymentMain9002{

    public static void main(String[] args) {
       SpringApplication.run(PaymentMain9002.class, args);
    }


}
