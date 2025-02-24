package com.mabwatech.controller.impl;

import com.mabwatech.controller.AuthAPIController;
import com.mabwatech.models.manager.UserManager;
import com.mabwatech.models.MtUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthAPIControllerImpl implements AuthAPIController {

    @Autowired
    private UserManager userMan;
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestParam String email, @RequestParam String password, @RequestParam String authProvider) {
        userMan.createAndPersistUser(email, password, authProvider);
        MtUser user = userMan.getUser(email);
        return null;
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginToExisting(@RequestParam String email, @RequestParam String password, @RequestParam String authProvider) {
        String token = userMan.login(email, password);
        return null;
    }
}
