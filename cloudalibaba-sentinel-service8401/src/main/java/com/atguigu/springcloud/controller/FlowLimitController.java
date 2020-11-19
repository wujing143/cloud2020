package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wujing
 * @Description:
 * @Date: 2020/11/17 11:02
 * @Version: 1.0
 */

@RestController
public class FlowLimitController
{
    @GetMapping("/testA")
    public String testA() {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {

        return "------testB";
    }


    /**
     * 热点key限流 ：【同一个接口，根据请求的参数的不同，实现限流操作】
     * @return
     */
    @GetMapping("/testHotKey")
//    [与 hystrix中 @HystrixCommand 相同： 指定兜底方法 ]  (在 cloud-consumer-feign-hystrix-order80)
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2) {
        //int age = 10/0;
        return "------testHotKey";
    }

    //兜底方法【这个兜底，只是管sentinel系统配置的违规情况，但像运行异常[ age = 10/0]，不会用这个方法】
    public String deal_testHotKey (String p1, String p2, BlockException exception){
        //sentinel系统默认的提示都是  ===>  Blocked by Sentinel (flow limiting)
        return "------deal_testHotKey,o(╥﹏╥)o";
    }





}


