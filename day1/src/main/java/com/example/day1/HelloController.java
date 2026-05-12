package com.example.day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHi(){
        return "Hello spring boot + graalvm";
    }

    @GetMapping("/slow")
    public String slow(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Hello spring boot + graalvm";
    }

}
