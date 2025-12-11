package com.krishna.openai.OpenAI.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenAIController {

    private ChatClient chatClient;

    public OpenAIController(ChatClient.Builder builder){
        this.chatClient = builder.build();
    }

    @GetMapping("/")
    public ResponseEntity<String> chat(
            @RequestParam(value = "q", required = true) String q){
                return ResponseEntity.ok("Hello From Krishna OpenAI Project");
    }

    @GetMapping("/chat")
    public ResponseEntity<String> openAIChat(
            @RequestParam(value = "q", required = true) String q){
        return ResponseEntity.ok(chatClient.prompt(q).call().content());
    }

}
