package com.mabwatech.controller.impl;

import com.mabwatech.controller.PlateAPIController;
import com.mabwatech.models.manager.PlateManager;
import com.mabwatech.models.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlateAPIControllerImpl implements PlateAPIController {

    @Autowired
    private PlateManager plateMan;

    @Autowired
    private UserManager userMan;

    @Override
    @PostMapping("/init")
    public ResponseEntity<String> initPlate() {
        return null;
    }
}
