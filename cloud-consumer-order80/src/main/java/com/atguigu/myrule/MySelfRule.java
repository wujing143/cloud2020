package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wujing
 * @Description: 自定义Ribbon的负载均衡规则 [替换默认的轮迅负载均衡]
 * 【
 * ** MySelfRule 配置，不可被Springboot的 @ComponentScan 所扫描
        @SpringBootApplication 里面就包含了 @ComponentScan，自动扫描此包及子包的组件
 * 】
 * @Date: 2020/10/23 15:47
 * @Version: 1.0
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();//定义为随机
    }
}