package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.common.CommonResult;
import com.atguigu.springcloud.entities.payment.Payment;
import com.atguigu.springcloud.service.PaymentService;
import io.micrometer.core.instrument.Meter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/addPayment")
    public CommonResult addPayment(@RequestBody Payment payment){
        int result = paymentService.insert(payment);
        log.info("******插入结果："+result);

        if(result>0){
            return new CommonResult("200","插入成功！",result);
        }else{
            return new CommonResult("444","插入失败！",null);
        }
    }

    @GetMapping("/getPayment")
    public CommonResult getPayment(@RequestParam("id") long id
    ){
        Payment payment = paymentService.selectPaymentById(id);
        log.info("******查询结果："+payment);

        if(payment!=null){
            return new CommonResult("200","查询成功！",payment);
        }else{
            return new CommonResult("444","查询失败！",null);
        }
    }



}
