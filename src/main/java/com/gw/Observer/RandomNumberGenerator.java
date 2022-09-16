package com.gw.Observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator{
    private Random random = new Random();
    private int number;
    @Override
    public int getNumber() {
        return number;
    }

    /**
     * 根据当前状态决定是否向observer发送通知
     */
    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
