package com.wei.spring.cloud.alibaba.business;

import com.wei.spring.cloud.alibaba.business.service.IEchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.annotation.Resource;

/* `@EnableFeignClients` 注解开启 Feign 功能*/
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class BusinessAdminApplication {


    public static void main(String[] args) {
        SpringApplication.run(BusinessAdminApplication.class,args);
    }
}
