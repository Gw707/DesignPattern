package com.gw.Singleton;

public class StaticSingleton {

    private StaticSingleton() {
    }

    private static class Internal{
        private static final StaticSingleton INSTANCE = new StaticSingleton();


    }

    public StaticSingleton getInstance(){
        return Internal.INSTANCE;
    }

}
