package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class DateServiceTest {

    @Test
    void currentDateReturnsValue() {
        DateService service = new DateService();
        assertNotNull(service.currentDate());
    }
}
