package com.gw.ChainOfResponsibility;

/**
 * 设置具体的问题
 * 以及问题的具体信息，xxxSupport类拿到后判断能不能进行处理
 */
public class Trouble {
    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Trouble{" +
                "number=" + number +
                '}';
    }
}
