package com.gw.Builder;

/**
 *
 * 定义接口，交由具体的xxxBuilder去实现
 *
 */
public abstract class Builder {
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void makeTitle(String title);
    public abstract void close();
    public abstract String getResult();
}
