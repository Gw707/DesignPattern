package com.gw.Factory.SimpleFactory;

/**
 * test
 */
public class TestFactory {
    public static void main(String[] args) {
        HumanFactory factory = new HumanFactory();
        factory.createHuman(BlackHuman.class).getColor();
    }
}
