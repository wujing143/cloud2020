package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.controller.myHandler.CustomerBlockHandler;
import com.atguigu.springcloud.entities.common.CommonResult;
import com.atguigu.springcloud.entities.payment.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wujing
 * @Description: @SentinelResource 注解详细介绍
 * @Date: 2020/11/19 17:12
 * @Version: 1.0
 */
@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public CommonResult byResource() {
        return new CommonResult("200", "按资源名称限流测试OK", new Payment(2020L, "serial001"));
    }

    //d兜底方法
    public CommonResult handleException(BlockException exception) {
        return new CommonResult("444", exception.getClass().getCanonicalName() + "\t 服务不可用");
    }


    /**
     * 1./rateLimit/byUrl  和   byUrl  都可以用于sentinel中监控的资源名，只要唯一
     * 2.不指定兜底方法，sentinel有默认的
     * @return
     */
    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl()
    {
        return new CommonResult("200","按url限流测试OK",new Payment(2020L,"serial002"));
    }


    /**
     * 统一调用兜底方法，解决代码耦合
     * @return
     */
    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handlerException2")
    public CommonResult customerBlockHandler()
    {
        return new CommonResult("200","按客戶自定义",new Payment(2020L,"serial003"));
    }



}
