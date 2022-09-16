package com.gw.Decorator;

/**
 * 创建一个person,再为这个person对象添加配件，进行装饰
 *
 * 创建关羽，为关羽添加坐骑和武器
 *
 */
public class test {
    public static void main(String[] args) {
        Info person = new Person("关羽");

        Info arm = new Arms(person, "青龙偃月刀");
        Info mount = new Mount(arm, "赤兔马");

        System.out.println(mount.getAllInfo());

    }
}
