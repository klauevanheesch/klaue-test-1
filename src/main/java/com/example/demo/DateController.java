package com.example.demo;

import java.time.LocalDate;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

    @GetMapping("/message")
    public Map<String, String> message() {
        return Map.of("message", LocalDate.now().toString());
    }
}
