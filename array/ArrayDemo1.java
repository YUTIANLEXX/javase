package com.yutianle.array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //目标：学会使用静态数组的定义方式
        //数据类型[] 数组名称= new 数据类型[]{}

        double[] scores = new double[] {99.5,73.5};

        int[] ages = new int[] {12,24,36};
        String[] names = new String[] {"牛二","张三"};

        //目标：学会访问数组的元素
        int[] ages1 = new int[] {12,24,36};
        int ret = ages1[1];
        System.out.println(ages1[1]);

        //赋值: 数组名称[索引]=数据；
        ages1[2]=100;
        System.out.println(ages1[2]);

        //访问数组的长度
        System.out.println(ages1.length);
        System.out.println(ages1.length - 1);
        int[] arr = {};



    }
}
