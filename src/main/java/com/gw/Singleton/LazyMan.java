package com.gw.Singleton;

public class LazyMan {
    /**
     * 双重检测锁模式，DCL懒汉式
     *
     */
    private LazyMan() {
    }

    private volatile static LazyMan lazyMan;   //防止在new的过程中进行指令重排

    public static LazyMan getInstance(){
        if(lazyMan==null){
            synchronized (LazyMan.class){
                if(lazyMan==null){
                    lazyMan = new LazyMan();
                    /**
                     * new LazyMan()的过程仍不安全，不是原子性操作
                     * 1、分配内存空间
                     * 2、执行构造方法，初始化对象
                     * 3、把对象指向这个空间
                     * 但是2、3两步可能进行指令重排，此时如果有多个线程
                     * 当某一线程按照132执行13后，另一线程就会认为lazyMan不为null而返回，但此时lazyMan还未进行初始化
                     * 可以通过volatile防止指令重排
                     *
                     */
                }
            }
        }

        return lazyMan;
    }

}
