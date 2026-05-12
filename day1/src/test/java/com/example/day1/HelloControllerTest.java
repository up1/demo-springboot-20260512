package com.example.day1;

import com.example.day1.dip.GenerateIdService;
import com.example.day1.dip.XXXRandom;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.TestRestTemplate;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureTestRestTemplate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

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

    @Test
    void test02() {
        // Act
        String result = restTemplate.getForObject("/report", String.class);
        // Assert
        assertEquals("Report V2", result);
    }

//    @MockitoBean
//    GenerateIdService stub;

//    @Test
//    void test03() {
//        // Arrange
//        when(stub.process()).thenReturn("DEMO-5");
//
//        // Act
//        String result = restTemplate.getForObject("/random", String.class);
//        // Assert
//        assertEquals("DEMO-5", result);
//    }

    @MockitoBean
    XXXRandom stub;

    @Test
    void test04() {
        // Arrange
        when(stub.get(anyInt())).thenReturn(5);

        // Act
        String result = restTemplate.getForObject("/random", String.class);
        // Assert
        assertEquals("DEMO-5", result);
    }
}