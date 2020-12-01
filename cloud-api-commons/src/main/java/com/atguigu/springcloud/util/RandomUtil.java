package com.atguigu.springcloud.util;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author: HHF
 * @date: 2020/9/28
 **/
public class RandomUtil {
    private static final String RANDOM_STR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final Random RANDOM = new Random();

    public static String getRandomStr(int len) {
        if(len < 1){
            return null;
        }
        int bound = RANDOM_STR.length();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < len; ++i) {
            sb.append(RANDOM_STR.charAt(RANDOM.nextInt(bound)));
        }
        return sb.toString();
    }

    /**
     * 生成特定位数随机数
     * @param len
     * @return
     */
    public static long getRandomNumber(int len){
        // ThreadLocalRandom
        return ThreadLocalRandom.current().nextLong((long) Math.pow(10, len));
    }
}
