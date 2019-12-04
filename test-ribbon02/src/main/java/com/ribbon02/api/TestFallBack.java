package com.ribbon02.api;

import org.springframework.stereotype.Component;

@Component
public class TestFallBack implements TestApi {
    @Override
    public String test003(String name) {
        return "出错";
    }
}
