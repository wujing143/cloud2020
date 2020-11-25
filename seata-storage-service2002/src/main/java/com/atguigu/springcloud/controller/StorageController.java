package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.common.CommonResult;
import com.atguigu.springcloud.service.StorageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @ClassName: StorageController
 * @Author: Wu
 * @Date: 2020/11/23 22:16
 */
@RestController
@Api
public class StorageController {

    @Autowired
    private StorageService storageService;


    //扣减库存
    @RequestMapping("/storage/decrease")
    @ApiOperation("扣减库存")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult("200","扣减库存成功！");
    }
}
