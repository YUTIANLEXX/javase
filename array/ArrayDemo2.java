package com.yutianle.array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //目标：理解数组的注意事项
        //
//        int[] ages={23,24,25};
//        int ages1[] ={11,12,13};
//        String[] names = { "西门吹雪"};
//        int ret = ages[2];
//        ages[1]=100;

        //动态初始化数组
        //只确定元素的类型和数组的的长度
        //数据类型[] 数组名 = new 数据类型[长度];
        int[] arr2 = new int[3];
        double[] scores = new double[3];

        //赋值
        scores[0]=99.5;
        System.out.println(scores[0]);
        System.out.println(scores[2]);

        String[] names2 = new String[90];
        names2[0] = "迪丽热巴";
        names2[2] = "马儿扎哈";
        System.out.println(names2[0]);
        System.out.println(names2[1]);
        System.out.println(names2[2]);

        //动态数组初始化的元素默认值
        //引用数据类型的默认值是null

        int[] arr22 = new int[10];

        System.out.println(arr22[0]);
        System.out.println(arr22[1]);

//        字符数组的元素默认值
        char[] chars = new char[10];
        System.out.println(chars[0]);
        System.out.println(chars[9]);

        boolean[] booleans = new boolean[100];
        System.out.println(booleans[1]);
        System.out.println(booleans[99]);

        int[] why = new int[2];
        int[] why1 = new int[] {1,2,34};

    }
}
