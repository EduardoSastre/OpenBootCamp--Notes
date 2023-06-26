package com.example.amigosspringsecurityjwt.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/")
    public ResponseEntity<String> helloWorld(){

        return ResponseEntity.ok("Hello world");

    }

}
