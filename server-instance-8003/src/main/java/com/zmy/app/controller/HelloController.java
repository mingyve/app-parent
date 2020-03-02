package com.zmy.app.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zmy.app.server.HelloServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Autowired
    HelloServer helloServer;


    @RequestMapping(value = "/getHello",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod="processHystrix_Get")
    public String hello(){
        String hello = helloServer.hello();
        return hello;
    }

    public String processHystrix_Get(){
        return "出错了";
    }


}
