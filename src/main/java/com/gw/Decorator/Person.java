package com.gw.Decorator;

public class Person extends Info {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    /**
     * 配置人物的基本信息，原始信息就是名字
     * @return
     */
    @Override
    public String getBasicInfo() {
        return name;
    }

    @Override
    public String getAllInfo() {
        return name;
    }
}
