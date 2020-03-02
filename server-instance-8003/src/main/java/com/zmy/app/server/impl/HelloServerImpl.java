package com.zmy.app.server.impl;

import com.zmy.app.mapper.HelloMapper;
import com.zmy.app.server.HelloServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServerImpl implements HelloServer {

    @Autowired
    HelloMapper helloMapper;

    @Override
    public String hello() {
        return helloMapper.getMapper();
    }
}
