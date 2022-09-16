package com.gw.Decorator;

public abstract class AdditionalInfo extends Info{

    protected Info info;

    /**
     * 注意再添加附件时需要传入一个Info对象(也就是person对象)
     * 添加附件必须有一个明确的被装饰者指向
     * @param info
     */
    public AdditionalInfo(Info info) {
        this.info = info;
    }

    /**
     * 添加装饰物的公共接口
     * @return
     */
    public abstract String getAdditionalInfo();

}
