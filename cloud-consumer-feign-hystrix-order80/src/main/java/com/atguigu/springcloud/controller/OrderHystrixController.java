package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.rpc.service.RpcHystrixPaymentService;
//import com.atguigu.springcloud.service.OrderHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: wujing
 * @Description:
 * @Date: 2020/10/26 17:45
 * @Version: 1.0
 */
@RestController
@Slf4j
public class OrderHystrixController {

//    @Resource
//    private OrderHystrixService orderHystrixService;
    @Resource
    private RpcHystrixPaymentService rpcHystrixPaymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/haha/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
//        String result = orderHystrixService.paymentInfo_OK(id);
        String result = rpcHystrixPaymentService.paymentInfo_OK(id);
        return result;
    }
    @GetMapping("/haha/timeout/{id}")
    //@HystrixProperty 3秒以内 算正常，超过3秒，执行fallbackMethod指定方法
    @HystrixCommand(fallbackMethod = "paymentInfoTimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")  //1.5秒钟以内就是正常的业务逻辑
    })
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
       // int age =10/0;
//        String result = orderHystrixService.paymentInfo_TimeOut(id);
        String result = rpcHystrixPaymentService.paymentInfo_TimeOut(id);
        return result;
    }

    //兜底方法[回滚方法]  服务降级
    public String paymentInfoTimeOutHandler(@PathVariable("id")Integer id){
        return "我是消费者80,对方支付系统繁忙，请稍后再试，或者自己运行出错，请检查自己~~~";
    }


    /**
     * openFegin 实现RPC接口调用
     * @param id
     * @return
     */
    @GetMapping("/haha/UUID/{id}")
    public String paymentUUID(@PathVariable("id") Integer id){
        String str = rpcHystrixPaymentService.paymentUUID(id);
        return str;
    }




}
