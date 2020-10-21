package com.atguigu.springcloud.service.impl;


import com.atguigu.springcloud.entities.payment.Payment;
import com.atguigu.springcloud.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.atguigu.springcloud.service.PaymentService;

/**
 * @ClassName: PaymentServiceImpl
 * @Author: wujing
 * @Description: service接口实现
 * @Date: 2020/10/20 14:43
 * @Version: 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int insert(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment selectPaymentById(long id) {
        return paymentMapper.selectPaymentById(id);
    }



}
