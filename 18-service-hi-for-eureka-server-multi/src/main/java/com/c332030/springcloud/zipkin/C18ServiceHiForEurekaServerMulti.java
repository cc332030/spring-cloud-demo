package com.c332030.springcloud.zipkin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * Description: ServiceHiApplication
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
@Slf4j
@SpringBootApplication
@RestController
@EnableEurekaClient
public class C18ServiceHiForEurekaServerMulti {

    public static void main(String[] args) {
        SpringApplication.run(C18ServiceHiForEurekaServerMulti.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
