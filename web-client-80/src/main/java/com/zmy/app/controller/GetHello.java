package com.zmy.app.controller;


import com.zmy.app.server.HelloClientService;
import com.zmy.app.to.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class GetHello {

    private static final String REST_URL_PREFIX = "http://SERVER-INSTANCE";

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    HelloClientService helloClientService;

    @ResponseBody
    @RequestMapping(value = "/api/hello",method = RequestMethod.GET)
    public CommonResult getHello(){
        String name = this.helloClientService.getHello();
        return new CommonResult().success(name);
    }

}
