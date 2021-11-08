package com.swjd.demo1.com.swjd.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassConfig2 {
    @Bean
    @ConfigurationProperties(prefix = "hunan.swjd")
    public ClassProperties classProperties() {
        return new ClassProperties();
    }
}
