package com.zmy.app.server;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloClientServiceFallBack implements FallbackFactory<HelloClientService> {
    @Override
    public HelloClientService create(Throwable throwable) {
       return new HelloClientService() {
            @Override
            public String getHello() {
                return "失败了";
            }
        };
    }
}
