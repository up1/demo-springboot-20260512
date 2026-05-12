package com.example.day1.dip;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Random5 implements MyRandom{

    @Override
    public int get(int bound) {
        return 5;
    }
}

class GenerateIdServiceTest {

    @Test
    void random_with_5() {
        var g = new GenerateIdService(new Random5());
        assertEquals("DEMO-5", g.process());
    }

}