package com.c332030.springcloud.service.feign.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * <p>
 * Description: SchedualServiceHi
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
@FeignClient(value = "service-hi")
public interface SchedarServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
