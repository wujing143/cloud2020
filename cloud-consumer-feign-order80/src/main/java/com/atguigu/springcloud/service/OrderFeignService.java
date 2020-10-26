package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.common.CommonResult;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: wujing
 * @Description: @eignClient  指示为IPC接口
 * @Date: 2020/10/26 9:41
 * @Version: 1.0
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")  //value:指定对应微服务的名称
public interface OrderFeignService {

    /**
     *  public CommonResult getPayment(@PathVariable("id") @ApiParam("id") long id);
     *  1.这个样和所调用微服务的接口 保持一致
     *  2.@GetMapping("/payment/getPayment/{id}")  路径也要保持一致，注意类上的 @RequestMapping("/payment")
     *
     * @param id
     * @return
     */
    @GetMapping("/payment/getPayment/{id}")
    @ApiOperation("查询")
    public CommonResult getPayment(@PathVariable("id") @ApiParam("id") long id);

}
