package com.yutianle.d10_extends_constructor;

public class Dog {
    public Dog () {
        super();
        System.out.println("子类Dog无参构造器被执行~");
    }

    public Dog(String name) {
        super();
        System.out.println("子类Dog有参构造器被执行~");
    }
}
