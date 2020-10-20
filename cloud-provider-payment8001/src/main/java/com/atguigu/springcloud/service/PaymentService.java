package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.payment.Payment;

/**
 * @ClassName: PaymentService
 * @Author: wujing
 * @Description: service接口
 * @Date: 2020/10/20 14:42
 * @Version: 1.0
 */
public interface PaymentService {

    int  insert(Payment payment);

    Payment selectPaymentById(long id);

}
