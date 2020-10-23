package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: wujing
 * @Description: 实现LoadBalancer接口
 * @Date: 2020/10/23 16:38
 * @Version: 1.0
 */
@Component
public class MyLB implements LoadBalancer {
    //原子类，初始值：0
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    //坐标【返回第几次访问】
    private final int getAndIncrement(){
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        }while (!this.atomicInteger.compareAndSet(current,next));  //第一个参数是期望值，第二个参数是修改值是
        System.out.println("*******第几次访问，次数next: "+next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {  //得到机器的列表
        int index = getAndIncrement() % serviceInstances.size(); //求余数 ，得到服务器的下标位置
        return serviceInstances.get(index);  //返回具体哪个微服务去执行
    }


}


