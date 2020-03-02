package com.zmy.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class GatewayZuulApp {

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulApp.class,args);
    }
}
