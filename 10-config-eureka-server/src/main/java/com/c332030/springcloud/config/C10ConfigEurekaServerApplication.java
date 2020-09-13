package com.c332030.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>
 * Description: ConfigServerApplication
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class C10ConfigEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(C10ConfigEurekaServerApplication.class, args);
    }

}
