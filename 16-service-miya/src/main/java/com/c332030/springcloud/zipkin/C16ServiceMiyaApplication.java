package com.c332030.springcloud.zipkin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

import brave.sampler.Sampler;

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
public class C16ServiceMiyaApplication {

    public static void main(String[] args) {
        SpringApplication.run(C16ServiceMiyaApplication.class, args);
    }

    @RequestMapping("/hi")
    public String home(){
        log.info("hi is being called");
        return "hi i'm miya!";
    }

    @RequestMapping("/miya")
    public String info(){
        log.info("info is being called");
        return restTemplate.getForObject("http://localhost:8988/info",String.class);
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
