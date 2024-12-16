package com.imd.fidelity.controller;

import com.imd.fidelity.service.FidelityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fidelity")
public class FidelityController {

    @Autowired
    private FidelityService fidelityService;

    @PostMapping("/bonus")
    public ResponseEntity<?> getBonus(@RequestParam  Integer userId, @RequestParam Double bonus){
        return ResponseEntity.ok().body("ok");
    }
}
