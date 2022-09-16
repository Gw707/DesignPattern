package com.gw.Factory.AbstractFactory;

public abstract class Man implements Human {

    public void getGender(){
        System.out.println("man!!");
    }

    @Override
    public abstract void getColor();
}
