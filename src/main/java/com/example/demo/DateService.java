package com.example.demo;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class DateService {

    public LocalDate currentDate() {
        return LocalDate.now();
    }
}
