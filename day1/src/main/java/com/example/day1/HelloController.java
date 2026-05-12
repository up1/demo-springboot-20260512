package com.example.day1;

import com.example.day1.dip.GenerateIdService;
import com.example.day1.report.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Report reportV2;

    @Autowired
    private GenerateIdService generateIdService;


    @GetMapping("/random")
    public String random(){
        return generateIdService.process();
    }

    @GetMapping("/report")
    public String getReport(){
        return reportV2.generate();
    }

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
