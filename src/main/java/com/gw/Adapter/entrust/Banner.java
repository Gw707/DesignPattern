package com.gw.Adapter.entrust;

/**
 * 目标的输出
 */
public class Banner {

    private String str;

    public Banner(String str) {
        this.str = str;
    }

    public void targetWeak(){
        System.out.println("(" + str + ")");
    }

    public void targetStrong(){
        System.out.println("**" + str + "**");
    }
}
