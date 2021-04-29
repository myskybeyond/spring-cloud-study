package com.myskybeyond.springcloudribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: JianTao Li
 * @time: 2021/4/28 16:05
 * @email: myskybeyond@163.com
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping(value = "/hello")
    public String hello() {
        return restTemplate.getForEntity("http://eureka-client2/", String.class).getBody();
    }
}
