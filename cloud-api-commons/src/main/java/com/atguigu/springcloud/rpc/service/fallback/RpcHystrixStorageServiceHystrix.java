package com.atguigu.springcloud.rpc.service.fallback;

import com.atguigu.springcloud.entities.common.CommonResult;
import com.atguigu.springcloud.rpc.service.RpcHystrixStorageService;

/**
 * @Description:
 * @ClassName: RpcHystrixStorageServiceHystrix
 * @Author: Wu
 * @Date: 2020/11/23 22:12
 */
public class RpcHystrixStorageServiceHystrix implements RpcHystrixStorageService {
    @Override
    public CommonResult decrease(Long productId, Integer count) {
        return new CommonResult("444","减库存失败！");
    }
}
