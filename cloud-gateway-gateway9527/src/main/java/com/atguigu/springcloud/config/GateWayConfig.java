package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wujing
 * @Description: 网关路由配置 http://news.baidu.com/guonei  百度国内王者
 * https://user.qzone.qq.com/1046696449
 * @Date: 2020/10/28 16:21
 * @Version: 1.0
 */
@Configuration
public class GateWayConfig {

    /**
     *   //  id===> # 配置了一个id 为 path_rote_atguigu 的路由规则 【没啥用】
     *  //当访问https://localhost:9527/guonei 时
     *     就会自动转发到地址 http://news.baidu.com/guonei
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        return routes.route("route2", r -> r.path("/guonei")
                              .uri("http://news.baidu.com/guonei"))
                      .route("route1", r -> r.path("/haha")
                              .uri("https://www.jd.com/"))
                      .build();
    }

}
