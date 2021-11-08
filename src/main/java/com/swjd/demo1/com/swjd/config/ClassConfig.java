package com.swjd.demo1.com.swjd.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ClassConfig {
    @Value("${hunan.swjd.className}")
    private String className;
    @Value("${hunan.swjd.roomNum}")
    private Integer roomNum;

    @Bean
    public ClassProperties classProperties(){
        ClassProperties properties = new ClassProperties();
        properties.setClassName(className);
        properties.setRoomNum(roomNum);
        return properties;
    }
}
