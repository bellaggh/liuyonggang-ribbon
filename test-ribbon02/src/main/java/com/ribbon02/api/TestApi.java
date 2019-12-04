package com.ribbon02.api;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ribbon03",fallback = TestFallBack.class)
@Hystrix
public interface TestApi {

    @RequestMapping("test003")
    public String test003(@RequestParam("name") String name);
}
