package com.atguigu.springcloud.rpc.service.fallback;

import com.atguigu.springcloud.rpc.service.RpcHystrixPaymentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: wujing
 * @Description: HystrixPayment8001娄底方法 【 降级 】
 * @Date: 2020/10/28 9:47
 * @Version: 1.0
 */
@Component
public class RpcHystrixPaymentServiceHystrix implements RpcHystrixPaymentService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "系统繁忙，请稍后再试，或者自身代码有问题，请进行检查！！！"+id;
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "系统繁忙，请稍后再试，或者自身代码有问题，请进行检查！！！"+id;
    }

    @Override
    public String paymentUUID(Integer id) {
        return "系统繁忙，请稍后再试，或者自身代码有问题，请进行检查！！！"+id;
    }
}
