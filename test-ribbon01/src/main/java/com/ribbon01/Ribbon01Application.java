package com.ribbon01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableHystrix
@RestController
public class Ribbon01Application {
    public static void main(String[] args) {
        SpringApplication.run(Ribbon01Application.class);
    }

    @RequestMapping("testHealth")
    public String test(){
        System.out.println("============ribbon01============");
        return "OK";
    }
}
