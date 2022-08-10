package com.yutianle.d4_static_signleinstance;

public class Test1 {
    public static void main(String[] args) {
        //目标：理解饿汉单例类的设计步骤
        SignleInstance1 s1 = SignleInstance1.instance;
        SignleInstance1 s2 = SignleInstance1.instance;
        System.out.println(s1 == s2);
    }
}
