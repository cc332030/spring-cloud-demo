package com.c332030.springcloud.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>
 * Description: ConfigServerApplication
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
// @EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class ConfigClientBusEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientBusEurekaClientApplication.class, args);
    }

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }

}
