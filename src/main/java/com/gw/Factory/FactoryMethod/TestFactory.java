package com.gw.Factory.FactoryMethod;

import java.util.Vector;

/**
 * test
 */
public class TestFactory {
    public static void main(String[] args) {
        AbstractHumanFactory factory = new BlackHumanFactory();
        Human human = factory.createHuman();
        human.getColor();
    }
}
