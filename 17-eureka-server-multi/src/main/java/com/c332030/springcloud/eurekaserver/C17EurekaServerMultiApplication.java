package com.c332030.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class C17EurekaServerMultiApplication {

    public static void main(String[] args) {
        SpringApplication.run(C17EurekaServerMultiApplication.class, args);
    }

}
