package com.example.InterceptorMiddleware1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class LegacyController {

    @GetMapping
    public ResponseEntity<String> currentDateTime(){
        return ResponseEntity.ok("this is just old code");
    }

}