package com.gw.Factory.SimpleFactory;

public class WhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("White!!!");
    }

    @Override
    public void talk() {
        System.out.println("say white");
    }
}
