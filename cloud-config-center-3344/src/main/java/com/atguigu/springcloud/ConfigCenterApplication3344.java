package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: wujing
 * @Description: Config配置服务端
 * @Date: 2020/11/2 9:52
 * @Version: 1.0
 */

/***  不想全部通知，只想定点通知，只通知3355 ，不通知3366
 * 公式：http://localhost:配置中心的端口号/actuator/bus-refresh/{destination}
 * curl -X POST "http://localhost:3344/actuator/bus-refresh/config-client:3355"
 *
 * /bus/refresh 请求不再发送到具体的服务实例上，
 * 而是发给config server并通过destination参数类指定需要更新配置的服务或实例
 */
@SpringBootApplication
@EnableConfigServer         //Config 服务端
public class ConfigCenterApplication3344 {
    public static void main(String[] args) {

        SpringApplication.run(ConfigCenterApplication3344.class, args);
    }


}
