package com.gw.Decorator;

/**
 *原理与Arms类似，具体参考Arms中的注释
 */
public class Mount extends AdditionalInfo {
    private String MountName;

    public Mount(Info info, String MountName) {
        super(info);
        this.MountName = MountName;
    }

    @Override
    public String getAdditionalInfo() {
        return MountName;
    }

    @Override
    public String getBasicInfo() {
        return info.getAllInfo();
    }

    @Override
    public String getAllInfo() {
        return getBasicInfo() + " " + getAdditionalInfo();
    }
}
