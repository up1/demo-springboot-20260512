package com.example.day1;

import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("ทำการทดสอบเรื่องอะไร ด้วย input อะไร และต้องได้ผลอะไรบ้าง ?")
    void test01() {
        // Act
        String result = restTemplate.getForObject("/hello", String.class);
        // Assert
        assertEquals("Hello spring boot + graalvm", result);
    }
}