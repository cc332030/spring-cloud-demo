package com.c332030.springcloud.service.feign.service;

/**
 * <p>
 * Description: SchedualServiceHiHystric
 * </p>
 *
 * @author c332030
 * @version 1.0
 */

import org.springframework.stereotype.Service;

@Service
public class SchedarServiceHiHystric implements SchedarServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
