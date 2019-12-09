package com.wei.spring.cloud.alibaba.business.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "provider-admin")
public interface IEchoService {

    @GetMapping(value = "/echo/{String}")
    String echo(@PathVariable("String")String s);

    @GetMapping(value = "/lb")
    String lb();
}
