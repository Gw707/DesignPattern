package com.gw.Decorator;


/**
 *装备的武器，是对AdditionalInfo的具体实现
 */
public class Arms extends AdditionalInfo{

    private String ArmName;

    public Arms(Info info, String name) {
        super(info);
        this.ArmName = name;
    }

    /**
     * 获取武器的信息
     * @return
     */
    @Override
    public String getAdditionalInfo() {
        return ArmName;
    }

    /**
     * 对被装饰者进行处理
     * @return
     */
    @Override
    public String getBasicInfo() {
        return info.getAllInfo();  //获取父类的所有信息，包括被装饰的信息
    }

    @Override
    public String getAllInfo() {
        return getBasicInfo() + " " + getAdditionalInfo();  //将装饰的信息添加进被装饰者的信息中
    }
}
