package com.ribbon01.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("test01/{name}")
    @HystrixCommand(fallbackMethod = "testBack")
    public String test01(@PathVariable("name")String name,Integer tt){
        if("1".equals(name)){
            throw new RuntimeException("出错了");
        }
        return "OK";
    }
    public String testBack(String user,Integer tt){
        return "服务出错了";
    }
}
