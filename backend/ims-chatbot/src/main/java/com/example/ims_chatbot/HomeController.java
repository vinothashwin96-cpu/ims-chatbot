



package com.example.ims_chatbot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/ask")
    public String ask(@RequestParam String question) {

        question = question.toLowerCase();

        if (question.contains("exam")) {
            return "Next exam starts on Monday.";
        } 
        else if (question.contains("attendance")) {
            return "Your attendance is 92%.";
        } 
        else if (question.contains("hello")) {
            return "Hello! I am IMS Chatbot.";
        }
        else if (question.contains("result")) {
            return "Results will be published next week.";
        }
        else if (question.contains("fees")) {
            return "Please contact admin for fees details.";
        }
        else if (question.contains("time table")) {
            return "Time table is available on the college portal.";
        }
        else if (question.contains("holiday")) {
            return "Next college holiday is on Friday.";
        }
        else if (question.contains("department")) {
            return "You are studying in the Artificial Intelligence and Data Science department.";
        }
        else if (question.contains("timing")) {
            return "College timing is 8:00 AM to 3:00 PM.";
        }
        else if (question.contains("thank")) {
            return "You're welcome! Have a nice day.";
        }
        else {
            return "Sorry, I didn't understand your question.";
        }
    }
}