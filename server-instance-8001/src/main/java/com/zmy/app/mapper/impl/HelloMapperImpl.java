package com.zmy.app.mapper.impl;

import com.zmy.app.mapper.HelloMapper;
import org.springframework.stereotype.Component;

@Component
public class HelloMapperImpl implements HelloMapper {

    @Override
    public String getMapper() {
        return "hello8001";
    }
}
