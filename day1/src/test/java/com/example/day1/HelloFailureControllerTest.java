package com.example.day1;

import com.example.day1.dip.XXXRandom;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.TestRestTemplate;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureTestRestTemplate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureTestRestTemplate
class HelloFailureControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void test01() {
        // Act
        ResponseEntity<MyError> result = restTemplate.getForEntity("/random", MyError.class);
        // Assert
        assertEquals(200, result.getStatusCode().value());
        assertEquals(500, result.getBody().code());
        assertEquals("Under construction !!", result.getBody().message());
    }
}