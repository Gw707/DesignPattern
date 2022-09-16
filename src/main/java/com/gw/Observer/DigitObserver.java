package com.gw.Observer;

/**
 * 具体的观察者，观察到了目标状态后应如何执行
 */
public class DigitObserver implements Observer {

    /**
     * 可以获取被观察的对象的信息，在update中进行使用
     * @param numberGenerator
     */
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.println(111111);
    }
}
