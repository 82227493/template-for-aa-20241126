package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    private static final String USER_ID = "82227493";

    @GetMapping("/api/v1/user")
    public String getUserId() {
        return USER_ID;
    }
}
