package com.myskybeyond.springcloudribbonconsumer.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: JianTao Li
 * @time: 2021/4/29 15:21
 * @email: myskybeyond@163.com
 */
@Service
@FeignClient(value = "eureka-client2")
@RequestMapping("/")
public interface ServiceClient {

    @GetMapping
    String testService();
}
