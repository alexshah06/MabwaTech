package com.mabwatech.controller.impl;

import com.mabwatech.controller.UserAPIController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAPIControllerImpl implements UserAPIController {

    @Override
    @PostMapping("/pair/{plateId}/{userId}")
    public ResponseEntity<String> pairPlate(@PathVariable String plateId, @PathVariable String userId) {
        return null;
    }

}
