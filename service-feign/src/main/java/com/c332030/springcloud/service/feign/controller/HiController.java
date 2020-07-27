package com.c332030.springcloud.service.feign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import com.c332030.springcloud.service.feign.service.SchedarServiceHi;

/**
 * <p>
 * Description: HelloControler
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
@RestController
public class HiController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    SchedarServiceHi schedarServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedarServiceHi.sayHiFromClientOne( name );
    }
}
