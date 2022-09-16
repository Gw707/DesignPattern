package com.gw.Factory.SimpleFactory;

public class HumanFactory{

    public static <T extends Human> T createHuman(Class<T> clazz) {

        if (clazz == null) return null;
        Human human = null;
        try {
            human = (Human) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) { //异常处理
            System.out.println("人种产生错误");
        }
        return (T) human;
    }

}
