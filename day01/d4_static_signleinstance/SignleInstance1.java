package com.yutianle.d4_static_signleinstance;

/**
 使用饿汉单例实现单例类
 */
public class SignleInstance1 {
    /**
     2、饿汉单例是在获取对象前，对象已经提前准备好了一个。
     这个对象只能是一个，所以定义静态成员变量记住。
     */
    public static SignleInstance1 instance = new SignleInstance1();

    /**
     * 1、必须把构造器私有化。
     */
    private SignleInstance1() {
    }
}
