package com.gw.Adapter.entrust;


/**
 *
 * adapter
 * 与继承实现不同，委托实现则是直接将Banner对象私有
 * 适配器的具体实现:使用接口和继承
 *
 */
public class PrintBanner extends Print {

    private Banner banner;
    public PrintBanner(String str) {
        this.banner = new Banner(str);
    }

    @Override
    public void printWeak() {
        banner.targetWeak();
    }

    @Override
    public void printStrong() {
        banner.targetStrong();
    }

    @Override
    public void otherThings() {
        System.out.println("the implement could do other things");  //除了适配的部分，还可以做其他的事情
    }
}
