package com.zmy.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EurekaRegistryCenterApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaRegistryCenterApp.class,args);
    }
}
