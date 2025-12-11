package com.krishna.openai.OpenAI.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenAIController {

    @PostMapping("/chat")
    private ResponseEntity<String> chat(
            @RequestParam(value = "q", required = true) String q){
                return ResponseEntity.ok("Hello From Krishna OpenAI Project");
    }

}
