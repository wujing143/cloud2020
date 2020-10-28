package com.atguigu.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @Author: wujing
 * @Description:
 * @Date: 2020/10/26 10:40
 * @Version: 1.0
 */


@Service
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")  //指定全局 fallback 方法
public class PaymentService {

    /**
     * 正常访问，OK
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_OK,id：  "+id+"\t"+"☺ 哈哈哈"  ;
    }

    //模拟：超时3秒——>高并发时——>失败
    //@HystrixProperty 3秒以内 算正常，超过3秒，执行fallbackMethod指定方法
//    @HystrixCommand(fallbackMethod = "paymentInfoTimeOutHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")  //3秒钟以内就是正常的业务逻辑
//    })
    @HystrixCommand
    public String paymentInfo_TimeOut(Integer id){
        int timeNumber = 3000;
        //int age=10/0;
        try { TimeUnit.MILLISECONDS.sleep(timeNumber); }catch (Exception e) {e.printStackTrace();}
        return "线程池："+Thread.currentThread().getName()+"   id：  "+id+"\t"+"☹ 呜呜呜"+" 耗时(毫秒)"+timeNumber;
    }


    //兜底方法[回滚方法]  服务降级
    public String paymentInfoTimeOutHandler(Integer id){
        return "线程池："+Thread.currentThread().getName()+"   8001系统繁忙/运行出错, 请稍候再试  ,id：  "+id+"\t"+"哭了哇呜";
    }

    //下面是全局fallback方法 【类上@DefaultProperties】
    public String payment_Global_FallbackMethod(){
        return "Global异常处理信息，请稍后再试,(┬＿┬)";
    }











    //服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),  //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),   //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),  //时间范围
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"), //失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        if (id < 0){ throw new RuntimeException("*****id 不能负数"); }
        String serialNumber = IdUtil.simpleUUID();

        return Thread.currentThread().getName()+"\t"+"调用成功,流水号："+serialNumber;
    }
    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id){
        return "id 不能负数，请稍候再试,(┬＿┬)/~~     id: " +id;
    }


}

