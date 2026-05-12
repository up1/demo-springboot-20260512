package com.example.day1.dip;

import org.springframework.stereotype.Component;

@Component
public class XXXRandom implements MyRandom{
    @Override
    public int get(int bound) {
        throw new RuntimeException("Under construction !!");
    }
}
