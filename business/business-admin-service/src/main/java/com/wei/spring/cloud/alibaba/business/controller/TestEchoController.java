package com.wei.spring.cloud.alibaba.business.controller;

import com.wei.spring.cloud.alibaba.business.service.IEchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope//打开动态刷新功能
@RestController
@EnableFeignClients//通信
public class TestEchoController {

    @Autowired
    private IEchoService echoService;

    @GetMapping(value = "/feign/echo/{str}")
    public String echo(@PathVariable String str) {
        return echoService.echo(str);
    }

    /*两个服务交替显示*/
    @GetMapping(value = "/lb")
    public String lb() {
        return echoService.lb();
    }

    /*Nacos配置*/
    @Value("${user.name}")
    private String username;

    @GetMapping(value = "/config")
    public String config() {
        return echoService.echo(username);
    }

}
