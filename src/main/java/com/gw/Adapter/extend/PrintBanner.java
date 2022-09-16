package com.gw.Adapter.extend;

/**
 *
 * adapter
 * 适配器的具体实现:使用接口和继承
 *
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String str) {
        super(str);
    }

    @Override
    public void printWeak() {
        targetWeak();  //调用继承的Banner中的方法，来实现Print接口和Banner类适配
    }

    @Override
    public void printStrong() {
        targetStrong();
    }

    @Override
    public void otherThings() {
        System.out.println("the implement could do other things");  //除了适配的部分，还可以做其他的事情
    }
}
