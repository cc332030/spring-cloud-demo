package com.c332030.springcloud.service.feign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import com.c332030.springcloud.service.feign.service.HelloService;

/**
 * <p>
 * Description: HelloControler
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}
