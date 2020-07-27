package com.c332030.springcloud.service.feign.service;

import org.springframework.web.client.RestTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Description: HelloService
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {

        // url 不区分大小写
        return restTemplate.getForObject("http://service-hi/hi?name="+name, String.class);
    }
}
