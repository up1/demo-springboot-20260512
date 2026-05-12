package com.example.day1.oop;

public class DemoException {
    static void main() {
        A a = new A();
        a.process();
    }
}

class A {
    void process() {
        throw new RuntimeException("From A");
    }
}
