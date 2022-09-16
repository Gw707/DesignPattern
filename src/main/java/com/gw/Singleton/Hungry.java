package com.gw.Singleton;

public class Hungry {

    /**
     * 不论是否需要该对象，执行程序时都会生成实例
     * 当对象所占空间大时不好
     */
    private Hungry() {
    }

    private final static Hungry hungry= new Hungry();

    public Hungry getInstance(){
        return hungry;
    }

}
