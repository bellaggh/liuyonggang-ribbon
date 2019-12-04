package com.ribbon02.web;

import com.ribbon02.api.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ribbon02Controller {
    @Autowired
    TestApi testApi;

    @RequestMapping("test01/{name}")
    public String test(@PathVariable("name") String name){
        String content = testApi.test003(name);

        return content;
    }
}
