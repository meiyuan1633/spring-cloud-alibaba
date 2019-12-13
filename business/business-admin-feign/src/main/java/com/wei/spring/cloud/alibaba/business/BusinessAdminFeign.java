package com.wei.spring.cloud.alibaba.business;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(value = "provider-admin")
public interface BusinessAdminFeign {
    @GetMapping(value = "/hi")
    String sayHi();

}
