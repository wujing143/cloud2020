package com.atguigu.springcloud.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 编码工具类
 * @author: HHF
 * @date: 2020/7/17
 **/
public class NumberGenerator {
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd'%s'SSSSSS");

    private static AtomicLong marker = new AtomicLong(1);

    public static void main(String[] args) {
        System.out.println(create());
    }

    /**
     * 生成编码
     * 格式：yyyyMMdd+时分秒时间戳+SSSSSS+随机数
     * @return
     */
    public static String create(){
        LocalDateTime localDateTime = LocalDateTime.now();

        String timeTemplate = localDateTime.format(formatter);

        // 保持数据始终5位数
        int timeStamp = localDateTime.getHour() * 3600 + localDateTime.getMinute() * 60 + localDateTime.getSecond() + 9999;

        long number = marker.incrementAndGet();
        return  String.format(timeTemplate, timeStamp) + String.format("%03d", number % 1000);
    }

}
