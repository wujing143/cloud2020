package com.atguigu.springcloud.rpc.service.fallback;

import com.atguigu.springcloud.entities.common.CommonResult;
import com.atguigu.springcloud.rpc.service.RpcHystrixAccountService;

import java.math.BigDecimal;

/**
 * @Description:
 * @ClassName: RpcHystrixAccountServiceHystrix
 * @Author: Wu
 * @Date: 2020/11/23 22:12
 */
public class RpcHystrixAccountServiceHystrix implements RpcHystrixAccountService {
    @Override
    public CommonResult decrease(Long userId, BigDecimal money) {
        return new CommonResult("444","减余额失败！");
    }
}
