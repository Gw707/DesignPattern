package com.gw.Factory.FactoryMethod;

public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("Black!!!");
    }

    @Override
    public void talk() {
        System.out.println("say black");
    }
}
