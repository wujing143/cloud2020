package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.common.CommonResult;
import com.atguigu.springcloud.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Description:
 * @ClassName: AccountController
 * @Author: Wu
 * @Date: 2020/11/23 22:16
 */
@RestController
@Api
public class AccountController {

    @Resource
    AccountService accountService;


    //扣减账户余额
    @GetMapping("/account/decrease")
    @ApiOperation("扣减账户余额")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult("200","扣减账户余额成功！");
    }
}
