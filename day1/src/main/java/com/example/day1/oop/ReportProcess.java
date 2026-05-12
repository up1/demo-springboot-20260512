package com.example.day1.oop;

public abstract class ReportProcess {
    abstract void generateHeader();
    abstract void generateBody();
    abstract void generateFooter();

    void process() {
        generateHeader();
        generateBody();
        generateFooter();
    }
}

class Report1 extends ReportProcess {

    @Override
    void generateHeader() {

    }

    @Override
    void generateBody() {

    }

    @Override
    void generateFooter() {

    }
}
