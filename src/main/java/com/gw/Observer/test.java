package com.gw.Observer;

public class test {
    public static void main(String[] args) {
        Observer digitObserver = new DigitObserver();
        Observer graphObserver = new GraphObserver();
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        numberGenerator.addObserver(digitObserver);
        numberGenerator.addObserver(graphObserver);
        numberGenerator.execute();
    }
}
