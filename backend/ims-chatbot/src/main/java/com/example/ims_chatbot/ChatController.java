


package com.example.ims_chatbot;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ChatController {

    @PostMapping("/chat")
    public Map<String, String> chat(@RequestBody Map<String, String> request) {
        String question = request.get("question");
        String answer = "You asked: " + question;
        return Map.of("answer", answer);
    }
}