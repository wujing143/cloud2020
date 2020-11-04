package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.IMessageProvider;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: wujing
 * @Description:
 * @Date: 2020/11/4 13:58
 * @Version: 1.0
 */
@RestController
@Api(description="Spring Cloud Stream")
public class SendMessageController {
    @Resource
    private IMessageProvider messageProvider;

    @ApiOperation("发送消息")
    @GetMapping(value = "/sendMessage")
    public String sendMessage()
    {
        return messageProvider.send();
    }

}
