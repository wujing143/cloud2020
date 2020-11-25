package com.atguigu.springcloud.rpc.service;

import com.atguigu.springcloud.entities.common.CommonResult;
import com.atguigu.springcloud.rpc.service.fallback.RpcHystrixPaymentServiceHystrix;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @ClassName: RpcHystrixStorageService
 * @Author: Wu
 * @Date: 2020/11/23 22:10
 */
@Component
@FeignClient(name ="seata-storage-service" ,
        fallback = RpcHystrixPaymentServiceHystrix.class)
public interface RpcHystrixStorageService {

    @RequestMapping("/storage/decrease")
    @ApiOperation("扣减库存")
    public CommonResult decrease(Long productId, Integer count);

}
