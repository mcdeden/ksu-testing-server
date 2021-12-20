package com.example.ksutestingserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller {

    @GetMapping("hello2")
    public String sayHello() {
        return "Hello2";
    }
}
