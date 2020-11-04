package com.atguigu.springcloud.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @Author: wujing
 * @Description:
 * @Date: 2020/11/4 14:48
 * @Version: 1.0
 */
@Slf4j
@Controller
@EnableBinding(Sink.class)   //指信道channel 和 交换exchange 绑定在一起  【source <===> Sink】
public class ReceiveMessageListenerController {
    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)   //监听队列，用于消费者的队列信息接受
    public void input(Message<String> message) {

        log.info("port:"+serverPort+"  消费者1号接受："+message.getPayload());
    }

}