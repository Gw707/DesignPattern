package com.gw.Factory.FactoryMethod;

public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("Yellow!!!");
    }

    @Override
    public void talk() {
        System.out.println("say yellow");
    }
}
