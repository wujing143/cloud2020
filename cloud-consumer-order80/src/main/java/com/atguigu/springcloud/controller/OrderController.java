package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entities.common.CommonResult;
import com.atguigu.springcloud.entities.payment.Payment;
import com.atguigu.springcloud.lb.LoadBalancer;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @ClassName: OrderController
 * @Author: wujing
 * @Description:
 * @Date: 2020/10/21 14:05
 * @Version: 1.0
 */
@Slf4j
@RestController
@RequestMapping("/order")
@Api("hahah ")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private LoadBalancer loadBalancer;  //自定义轮询规则的负载均衡
    @Resource
    private DiscoveryClient discoveryClient;



    // Payment8001 服务的地址  单机版【URL写死了，只能访问8001】
//    public static final String PAYMENT_URL = "http://localhost:8001";
    //集群版【写注册名称，负载均衡访问8001/8002，但是要开启负责均衡，不然报错】
      public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";


    /**
     postForObject  getForObject    返回对象为响应体中数据转化的对象，基本上可以理解为 Json

     postForEntity  getForEntity    返回对象为ResponseEntity对象，包含了响应中的一些重要信息，比如响应头、状态码、响应体等
     */

    @GetMapping("/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/addPayment",payment, CommonResult.class);  //写操作
    }

    @GetMapping("/getPayment/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {

        return restTemplate.getForObject(PAYMENT_URL + "/payment/getPayment/" + id, CommonResult.class);
    }


    @GetMapping("/createForEntity")
    public ResponseEntity<CommonResult> createForEntity(Payment payment){
        return restTemplate.postForEntity(PAYMENT_URL+"/payment/addPayment",payment, CommonResult.class);  //写操作
    }

    @GetMapping("/getPaymentForEntity/{id}")
    public CommonResult<Payment> getPaymentForEntity(@PathVariable("id") Long id) {
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/getPayment/" + id, CommonResult.class);
        if (entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }
        return new CommonResult<>("444","查询失败！");
    }

    /**
     * 测试自定义轮询规则的负载均衡
     * @return
     */
    @GetMapping("/lb")
    public String getPaymentLB(){
        //获取所有注册在 Erueka，名为CLOUD-PAYMENT-SERVICE 的微服务
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        if (instances == null || instances.size() <= 0){
            return null;
        }
        ServiceInstance serviceInstance = loadBalancer.instances(instances);
        URI uri = serviceInstance.getUri();
        log.info("*****URI："+uri);
        return restTemplate.getForObject(uri+"/payment/lb",String.class);
    }


//     ====================> zipkin+sleuth
    @GetMapping("/zipkin")
    public String paymentZipkin()
    {
        String result = restTemplate.getForObject("http://localhost:8001"+"/payment/zipkin/", String.class);
        return result;
    }



}
