package com.sentinel.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author effort
 * @version 1.0
 * @description: TODO
 * @date 2025/4/7 14:31
 */
@RestController
@RequestMapping("/test")
public class TestApi {

    @GetMapping
    public void test() {
        System.out.println("test");
    }
}
