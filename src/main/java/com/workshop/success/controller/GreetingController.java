package com.workshop.success.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> SayHello(){
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/sey-goodbye")
    public ResponseEntity<String> SeyGoodbye(){
        return ResponseEntity.ok("Good bye and see you later!!");
    }

}
