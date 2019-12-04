package com.ribbon02;

import com.ribbon02.config.TestConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableFeignClients
@EnableCircuitBreaker
//@RibbonClient(name = "ribbon02",configuration =  TestConfig.class)
public class Ribbon02Application {
    public static void main(String[] args) {
        SpringApplication.run(Ribbon02Application.class);
    }

    @RequestMapping("/testHealth")
    public String test(){
        System.out.println("=========Ribbon============");
        return "OK";
    }
}
