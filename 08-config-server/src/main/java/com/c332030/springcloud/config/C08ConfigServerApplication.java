package com.c332030.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * <p>
 * Description: ConfigServerApplication
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class C08ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(C08ConfigServerApplication.class, args);
    }
}
