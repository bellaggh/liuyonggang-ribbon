package com.ribbon03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ribbon03Application {
    public static void main(String[] args) {
        SpringApplication.run(Ribbon03Application.class);
    }

    @RequestMapping("testHealth")
    public String test(){
        System.out.println("-============ribbon03==============");
        return "OK";
    }
}
