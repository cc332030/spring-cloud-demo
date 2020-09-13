package com.c332030.springcloud.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.context.annotation.Bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
// 断路器监控
@EnableHystrix
public class C23Gateway {

    public static void main(String[] args) {
        SpringApplication.run(C23Gateway.class, args);
    }

    // @Bean
    // public RouteLocator myRoutes(RouteLocatorBuilder builder) {
    //     return builder.routes().route(
    //         p -> p.path("/get")
    //             .filters(f -> f.addRequestHeader("Hello", "World"))
    //             .uri("http://httpbin.org:80")
    //     ).build();
    // }

    // 使用熔断器
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        String httpUri = "http://httpbin.org:80";
        return builder.routes()
            .route(p -> p
                .path("/get")
                .filters(f -> f.addRequestHeader("Hello", "World"))
                .uri(httpUri))
            .route(p -> p
                .host("*.hystrix.com")
                .filters(f -> f
                    .hystrix(config -> config
                        .setName("mycmd")
                        .setFallbackUri("forward:/fallback")))
                .uri(httpUri))
            .build();
    }

    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("fallback");
    }

}
