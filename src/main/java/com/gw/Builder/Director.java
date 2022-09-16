package com.gw.Builder;

/**
 * 建造者模式的关键所在！！！！
 * 指出了建造者模式的特点
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     *
     * 关键步骤！！！！
     * 有了原材料之后，确定各个方法间如何协调执行
     *
     */
    public void construct(){

        builder.makeTitle("Greeting");
        builder.makeItems(new String[]{
                "morning",
                "afternoon",
                "night"
        });

        builder.makeString("nice!!!");
        builder.makeItems(new String[]{
                "good",
                "good",
                "good"
        });

        builder.close();
        System.out.println(builder.getResult());

    }
}
