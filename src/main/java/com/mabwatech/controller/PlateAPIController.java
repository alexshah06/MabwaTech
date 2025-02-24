package com.mabwatech.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/plates")
public interface PlateAPIController {

    ResponseEntity<String> initPlate();
}
