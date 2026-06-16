package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // -> Hello

    @GetMapping("Hello")
    public String hello() {
        return "Hello World";
    }
}
