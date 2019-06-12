package com.github.lyrric.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2019-06-12.
 *
 * @author wangxiaodong
 */
@RestController
@RequestMapping(value = "/api/v1.0/order")
public class OrderController {

    @Value("${server.port}")
    private Integer port;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping(value = "/get")
    public String get(){
        return "订单服务， 来自" + applicationName + "服务，端口：" + port;
    }
}
