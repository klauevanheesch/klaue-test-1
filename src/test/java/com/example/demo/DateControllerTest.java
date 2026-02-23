package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class DateControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void messageEndpointReturnsCurrentDateInMessageKey() throws Exception {
        mockMvc.perform(get("/message"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value(LocalDate.now().toString()));
    }
}
