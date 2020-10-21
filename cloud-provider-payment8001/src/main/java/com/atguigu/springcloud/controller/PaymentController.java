package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.common.CommonResult;
import com.atguigu.springcloud.entities.payment.Payment;
import com.atguigu.springcloud.service.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@Api("支付服务")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());



    @PostMapping("/addPayment")
    @ApiOperation("添加")
    public CommonResult addPayment(@RequestBody Payment payment){
        int result = paymentService.insert(payment);
        log.info("******插入结果："+result);

        if(result>0){
            return new CommonResult("200","插入成功！",result);
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
            return new CommonResult("200","查询成功！",payment);
        }else{
            return new CommonResult("444","查询失败！",null);
        }
    }



}
