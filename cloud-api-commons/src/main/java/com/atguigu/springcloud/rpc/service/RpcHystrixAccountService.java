package com.atguigu.springcloud.rpc.service;

import com.atguigu.springcloud.entities.common.CommonResult;
import com.atguigu.springcloud.rpc.service.fallback.RpcHystrixPaymentServiceHystrix;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Description:
 * @ClassName: RpcHystrixAccountService
 * @Author: Wu
 * @Date: 2020/11/23 22:11
 */

@Component
@FeignClient(name ="seata-account-service" ,
        fallback = RpcHystrixPaymentServiceHystrix.class)
public interface RpcHystrixAccountService {

    @RequestMapping("/account/decrease")
    @ApiOperation("扣减账户余额")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);

}
