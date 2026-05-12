package com.example.day1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.TestRestTemplate;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureTestRestTemplate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureTestRestTemplate
class HelloControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void sayHi() {
        // Act
        String result = restTemplate.getForObject("/hello", String.class);
        // Assert
        assertEquals("Hello spring boot + graalvm", result);
    }
}