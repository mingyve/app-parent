package com.zmy.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@EnableHystrix
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class ServerInstanceApp {
    public static void main(String[] args) {
        SpringApplication.run(ServerInstanceApp.class,args);
    }
}
