package com.c332030.springcloud.service.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * <p>
 * Description: ServiceZuulApplication
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient

// 路由
@EnableZuulProxy
public class C07ServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run( C07ServiceZuulApplication.class, args );
    }

}
