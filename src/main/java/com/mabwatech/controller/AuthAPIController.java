package com.mabwatech.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/api/auth")
public interface AuthAPIController {
    ResponseEntity<String> registerUser(@RequestParam String email, @RequestParam String password, @RequestParam String authProvider);
}
