package com.gw.Factory.AbstractFactory;

public abstract class Woman implements Human {

    public void getGender(){
        System.out.println("woman!!");
    }

    public abstract void getColor();
}
