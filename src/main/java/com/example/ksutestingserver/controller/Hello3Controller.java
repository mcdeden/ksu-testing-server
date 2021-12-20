package com.example.ksutestingserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello3Controller {
    @GetMapping("hello3")
    public String sayHello() {
        return "Hello3";
    }
}
