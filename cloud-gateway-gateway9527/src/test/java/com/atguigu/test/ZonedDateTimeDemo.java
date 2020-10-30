package com.atguigu.test;

import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.jcajce.provider.symmetric.Noekeon;
import org.junit.Test;

import java.time.ZonedDateTime;

/**
 * @Author: wujing
 * @Description: Tmie 获取时间格式
 * @Date: 2020/10/30 16:47
 * @Version: 1.0
 */
@Slf4j
public class ZonedDateTimeDemo {

    @Test
    public void test1(){
        ZonedDateTime now = ZonedDateTime.now();   //默认区时间 【shanghai】
        log.info(now.toString()); // 2020-10-30T16:50:46.249+08:00[Asia/Shanghai]
    }

}
