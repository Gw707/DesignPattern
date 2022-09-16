package com.gw.Factory.AbstractFactory;

import com.gw.Factory.FactoryMethod.Human;

public abstract class AbstractHumanFactory {  //负责性别
    public abstract Human createMan();
    public abstract Human createWoman();
}
