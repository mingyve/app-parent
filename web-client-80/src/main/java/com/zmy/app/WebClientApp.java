package com.zmy.app;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients(basePackages={"com.zmy.app"})
@EnableEurekaClient
@SpringBootApplication
//@RibbonClient(name = "SERVER-INSTANCE",configuration = RuleConfig.class)
public class WebClientApp {
    public static void main(String[] args) {
        SpringApplication.run(WebClientApp.class,args);
    }
}
