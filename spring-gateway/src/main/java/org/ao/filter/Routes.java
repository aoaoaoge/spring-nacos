package org.ao.filter;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author: aoyh
 * @Despriction:
 * @Package: org.ao.filter
 * @Date:Created in 2020-05-28 下午 04:21
 * @Modify By:
 */
@Component
public class Routes {

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/get")
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri("http://httpbin.org:80"))
                .route(p -> p
                        .host("*.hystrix.com")
                        .filters(f -> f.hystrix(config -> config
                                .setName("mycmd")
                                .setFallbackUri("forward::/fallback")))
                        .uri("http://httpbin.org:80"))
                .build();
    }

}
