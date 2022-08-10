package com.yutianle.d1_static;

public class User {
    /**
     在线人数。
     注意：static修饰的成员变量：静态成员变量，只在内存中有一份，可以被共享
     */
    public static int onlineNumber = 161;

    /**
     实例成员变量：无static修饰，属于每个对象的，必须用对象名.访问
     */
    private String name;
    private int age;

    public static void main(String[] args) {
        // 目标：理解static修饰成员变量的作用和访问特点。
        // 1、类名.静态成员变量。
        System.out.println(User.onlineNumber);

        // 2、对象名.实例成员变量
        // System.out.println(User.name); // 报错
        User u = new User();
        u.name = "星星";
        u.age = 23;
        System.out.println(u.name);
        System.out.println(u.age);
        u.onlineNumber++;
        System.out.println(u.onlineNumber);

        User u1 = new User();
        u1.name = "傻星星";
        u1.age = 24;
        System.out.println(u1.name);
        System.out.println(u1.age);
        u1.onlineNumber++;

        System.out.println(u.onlineNumber);
        System.out.println(User.onlineNumber); // 推荐方式
        // 注意：同一个类中静态成员变量的访问可以省略类名。
        System.out.println(onlineNumber);


    }
}
