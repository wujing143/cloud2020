package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilderFactory;
import org.springframework.messaging.MessageChannel;
import org.springframework.integration.support.MessageBuilder;
import javax.annotation.Resource;
import org.springframework.cloud.stream.messaging.Source;

import javax.annotation.Resource;
import java.util.UUID;
import java.util.function.LongFunction;


/**
 * @Author: wujing
 * @Description:  消息发送者  发送接口的实现
 * @Date: 2020/11/4 13:55
 * @Version: 1.0
 */
@Slf4j
@EnableBinding(Source.class) //【定义消息的推送管道】 指信道channel 和 交换exchange 绑定在一起
public class MessageProviderImpl implements IMessageProvider
{
    @Resource
    private MessageChannel output; // 消息发送管道


    @Override
    public String send()
    {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        log.info("*****serial: "+serial);
        return null;
    }
}