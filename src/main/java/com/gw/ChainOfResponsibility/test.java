package com.gw.ChainOfResponsibility;

/**
 * 测试
 * 将责任链进行封装
 */
public class test {
    public static void main(String[] args) {
        Support a = new NoSupport("a");
        Support b = new LimitSupport("b", 100);
        Support c = new SpecialSupport("c", 111);
        Support d = new LimitSupport("d", 200);
        Support e = new OddSupport("e");
        Support f = new LimitSupport("f", 250);

        a.setNext(b).setNext(c).setNext(d).setNext(e).setNext(f);
        for (int i = 0; i < 300; i++) {
            a.support(new Trouble(i));
        }
    }
}
