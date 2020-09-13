package com.c332030.springcloud.eurekaclient;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@RestController

@EnableDiscoveryClient

@EnableEurekaClient

// 断路器监控
@EnableHystrix
@EnableHystrixDashboard

@EnableCircuitBreaker

@EnableTurbine
public class C22ServiceTurbine {

    /**
     * http://localhost:8764/turbine.stream
     */
    public static void main(String[] args) {
        SpringApplication.run( C22ServiceTurbine.class, args );
    }
}
