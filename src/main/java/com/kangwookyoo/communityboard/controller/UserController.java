package com.kangwookyoo.communityboard.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @GetMapping
    public Object hello() {
        Map<String, String> object = new HashMap<>();
        object.put("Programming Language", "Java");
        object.put("Framework", "Spring Boot");
        object.put("Version Control", "Github");
        object.put("Container", "Docker");
        object.put("Cloud", "AWS");
        return object;
    }
}
