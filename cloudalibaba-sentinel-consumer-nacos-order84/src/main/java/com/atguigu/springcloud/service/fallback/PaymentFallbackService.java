package com.atguigu.springcloud.service.fallback;

import com.atguigu.springcloud.entities.common.CommonResult;
import com.atguigu.springcloud.entities.payment.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @ClassName: PaymentFallbackService
 * @Author: Wu
 * @Date: 2020/11/21 22:28
 */

@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>("44444","服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}


