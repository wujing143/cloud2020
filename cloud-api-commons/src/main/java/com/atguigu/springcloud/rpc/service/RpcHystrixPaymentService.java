package com.atguigu.springcloud.rpc.service;


import cn.hutool.core.util.IdUtil;
import com.atguigu.springcloud.rpc.service.fallback.RpcHystrixPaymentServiceHystrix;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wujing   openfeign实现RPC接口
 * @version V1.0
 * @Package com.io.icos.rpc.service
 * @date 2020/8/25 16:45
 */
@Component
@FeignClient(name ="CLOUD-PROVIDER-HYSTRIX-PAYMENT" ,
        fallback = RpcHystrixPaymentServiceHystrix.class)
public interface RpcHystrixPaymentService {


    @ApiOperation("成功OK")
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id);

    @ApiOperation("超时3秒")
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id);


    @GetMapping("/payment/hystrix/uuid/{id}")
    @ApiOperation("生产UUID")
    public String paymentUUID(@PathVariable("id") Integer id);

}
