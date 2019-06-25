package com.github.lyrric.controller;

import com.github.lyrric.feign.OrderFeign;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created on 2019-06-12.
 *
 * @author wangxiaodong
 */
@RestController
@RequestMapping(value = "/api/v1.0/user")
public class UserController {

    @Value("${server.port}")
    private Integer port;

    @Value("${spring.application.name}")
    private String applicationName;

    @Resource
    private OrderFeign orderFeign;

    @GetMapping(value = "/get")
    public String get(){
        return "用户服务， 来自" + applicationName + "服务，端口：" + port;
    }


    @GetMapping(value = "/getFromRemote")
    public String getFromRemote(){
        return "获取远程服务数据,".concat(orderFeign.getFromRemote());
    }

}
