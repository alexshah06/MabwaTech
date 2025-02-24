package com.mabwatech.controller;

import com.mabwatech.models.MtUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/users")
public interface UserAPIController {

    ResponseEntity<String> pairPlate(@PathVariable String plateId, @PathVariable String userId);

}
