package com.wei.spring.cloud.alibaba.business.configure;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/*
* java配置类，主要作用是为了RestTemplate
* */
@Configuration
public class BusinessConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){

        return new RestTemplate();
    }
}
