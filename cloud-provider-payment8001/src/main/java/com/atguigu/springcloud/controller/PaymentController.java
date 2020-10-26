package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.common.CommonResult;
import com.atguigu.springcloud.entities.payment.Payment;
import com.atguigu.springcloud.service.PaymentService;
import com.atguigu.springcloud.service.impl.PaymentServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: PaymentController
 * @Author: wujing
 * @Description: Payment控制层
 * @Date: 2020/10/20 14:47
 * @Version: 1.0
 */
@RestController
@Slf4j
@RequestMapping("/payment")
@Api("支付服务")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${server.port}")   //去 application.yml 取值
    private String serverPort;

    @Autowired
    private DiscoveryClient discoveryClient;  //可以通过服务发现来获得该服务的信息



    @PostMapping("/addPayment")
    @ApiOperation("添加")
    public CommonResult addPayment(@RequestBody Payment payment){

        paymentService.insert(payment);
        int result = this.paymentService.insert(payment);
        log.info("******插入结果："+result);

        if(result>0){
            return new CommonResult("200","插入成功！serverPort："+serverPort,result);
        }else{
            return new CommonResult("444","插入失败！",null);
        }
    }

    @GetMapping("/getPayment/{id}")
    @ApiOperation("查询")
    public CommonResult getPayment(@PathVariable("id") @ApiParam("id") long id){
        Payment payment = paymentService.selectPaymentById(id);
        log.info("******查询结果："+payment);

        if(payment!=null){
            return new CommonResult("200","查询成功！serverPort："+serverPort,payment);
        }else{
            return new CommonResult("444","查询失败！",null);
        }
    }


    @GetMapping(value = "/discovery")
    @ApiOperation("通过服务发现来获得该服务的信息，现在自测查询本服务8001的信息")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();  //获取注册到Eureka上的所有微服务
        for (String element : services) {
            log.info("***** element:"+element);
        }
        //根据微服务名称，获取Eureka上的该名称的所有微服务e
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
        /*  结果：
            ***** element:cloud-payment-service
            ***** element:cloud-order-service
            CLOUD-PAYMENT-SERVICE	192.168.12.253	8001	http://192.168.12.253:8001
            CLOUD-PAYMENT-SERVICE	192.168.12.253	8002	http://192.168.12.253:8002
         */

    }

    @GetMapping("/lb")
    public String getPaymentLB(){
        return serverPort;
    }





}
