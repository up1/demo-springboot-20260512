package com.example.day1.report;

import org.springframework.stereotype.Component;

@Component
public class ReportV2 implements Report{
    public String generate(){
        return "Report V2";
    }
}
