package com.atguigu.springcloud.util;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 数字工具类
 * @author: HHF
 * @date: 2020/7/17
 **/
public class NumberUtil {

    /**
     * 生成特定位数随机数
     * @param size
     * @return
     */
    public static long random(int size){
        // ThreadLocalRandom
        return ThreadLocalRandom.current().nextLong((long) Math.pow(10, size));

        // ThreadLocalRandom
//        SplittableRandom random = new SplittableRandom();
//        random.nextInt(10);
    }
}
