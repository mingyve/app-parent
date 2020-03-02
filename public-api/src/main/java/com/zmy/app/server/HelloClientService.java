package com.zmy.app.server;

import com.zmy.app.to.CommonResult;
import jdk.nashorn.internal.objects.annotations.Function;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(value = "SERVER-INSTANCE")GATEWAY-ZULL
@FeignClient(value = "SERVER-INSTANCE")
public interface HelloClientService {

    @RequestMapping(value = "/getHello",method = RequestMethod.GET)
    String getHello();


}
