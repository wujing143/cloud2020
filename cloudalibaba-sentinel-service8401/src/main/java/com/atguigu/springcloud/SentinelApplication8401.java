package com.atguigu.springcloud;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: wujing
 * @Description: Sentinel 服务
 *  作用：监控服务
 *  解决：服务雪崩 ，服务熔断，服务降级，服务限流
 *
 * 一：流控规则  （流控模式+流控效果）
         * 1.流控模式：
         *      a：直接(默认) ：QBS —> 直接 —> 快速失败[表示1秒钟内调用一次A接口，超过直接默认报错Blocked by Sentinel (flow limiting)]
         *      b：关联：A 关联 B ，B 达到阈值， 就限流A   【大批量线程高并发访问B，导致A失效了】
         *      c：链路： 多个请求调用同一个微服务
         * 2.流控效果：
         *      a：快速失败 :
         *      b：Warm Up(预热) :预热因子 默认3 ，QBS从(threshild/3)开始
         *                       eg： 阈值为10 + 预热时长为5秒
         *                            10/3=3，阈值开始为3，超过报错，然后5秒后才慢慢升到到10
         *      c：排队等待 :  让请求以匀速通过
 *
 * 二：降级规则   【Hystrix 熔断降级（这个有半开状态，Sentinel无）】
         * 1.RT(平均响应时间)  ：RT=200  时间窗口=1 ：表示小于5（默认）个线程，希望在200毫秒处理完，如果没有处理完，在未来的1秒钟的时间窗口内，断路器打开，微服务不可用
         * 2.异常比例 ：资源的每秒请求量 >= 5(默认)，并且每秒异常数占通过量的比值超过阈值试，进入降级。异常比例的阈值范围【0.0,1.0】，代表0%-100%
         * 3.异常数 ： 当资源近1分钟的异常数超过阈值之后，熔断降级。【时间窗口一定要大于等于60s，不然溶度状态后，任然可能处在熔断状态下】
 *
 * 三：热点key限流
 *
 * @Date: 2020/11/17 10:40
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelApplication8401 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelApplication8401.class, args);
    }


}
