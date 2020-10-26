package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author: wujing
 * @Description:
 * @Date: 2020/10/26 10:40
 * @Version: 1.0
 */
@Service
public class PaymentService {

    /**
     * 正常访问，OK
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_OK,id：  "+id+"\t"+"☺ 哈哈哈"  ;
    }

    //模拟：超时3秒——>高并发时——>失败
    public String paymentInfo_TimeOut(Integer id){
        int timeNumber = 3;
        try { TimeUnit.SECONDS.sleep(timeNumber); }catch (Exception e) {e.printStackTrace();}
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_TimeOut,id：  "+id+"\t"+"☹ 呜呜呜"+" 耗时(秒)"+timeNumber;
    }

}

