package com.atguigu.springcloud.ipc;

import com.atguigu.springcloud.entities.common.CommonResult;
import com.atguigu.springcloud.entities.payment.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: wujing
 * @Description: openFeign ipc调用 9003-9004
 * @Date: 2020/11/20 17:56
 * @Version: 1.0
 */
@RestController
public class PaymentIPC {

    // OpenFeign
    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/ipc/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        return paymentService.paymentSQL(id);
    }
}
