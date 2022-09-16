package com.gw.Factory.FactoryMethod;


/**
 * 具体的工厂类，实际创建对象
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
