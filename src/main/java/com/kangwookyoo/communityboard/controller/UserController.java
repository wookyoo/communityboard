package com.kangwookyoo.communityboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @GetMapping("/hello")
    public String getHell() {
        return "hello world";
    }
}
