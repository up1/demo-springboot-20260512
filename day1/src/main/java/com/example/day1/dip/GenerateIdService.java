package com.example.day1.dip;

public class GenerateIdService {
    MyRandom random;

    public GenerateIdService(MyRandom random) {
        this.random = random;
    }

    public String process() {
        int randNumber = random.get(10);
        return "DEMO-" + randNumber;
    }

}
