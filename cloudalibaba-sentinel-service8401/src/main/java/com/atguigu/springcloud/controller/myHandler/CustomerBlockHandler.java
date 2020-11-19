package com.atguigu.springcloud.controller.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.common.CommonResult;

/**
 * @Author: wujing
 * @Description: Sentinel的兜底类
 * @Date: 2020/11/19 17:42
 * @Version: 1.0
 */
public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception) {
        return new CommonResult("4444", "自定义限流处理信息....CustomerBlockHandler");

    }

    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult("5555", "自定义限流处理信息2....CustomerBlockHandler");

    }

}
