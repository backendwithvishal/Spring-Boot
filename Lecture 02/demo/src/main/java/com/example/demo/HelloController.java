package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // -> Hello

    @GetMapping("hello")
    public String hello() {
        return "Hello World from VISHAL" +
                "very good morining";
    }
}
