package com.atguigu.springcloud.mapper;

import com.atguigu.springcloud.entities.payment.Payment;

/**
 * @ClassName: PaymentMapper
 * @Author: wujing
 * @Date: 2020/10/20 14:23
 * @Version: 1.0
 */

public interface PaymentMapper {

      int  insert(Payment payment);

      Payment selectPaymentById(long id);

}
