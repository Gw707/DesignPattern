package com.gw.Builder;

/**
 * 建造者模式的使用
 */
public class Client {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        HtmlBuilder htmlBuilder = new HtmlBuilder();
        Director director = new Director(htmlBuilder);
        director.construct();
    }
}
