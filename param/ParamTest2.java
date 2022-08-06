package com.yutianle.param;

public class ParamTest2 {
    public static void main(String[] args) {
        //需求：
        //设计一个方法可以接收整型数组，和要查询的元素值；
        //最终要返回元素在该数组中的索引，如果数组中不存在该元素则返回 -1。
        int[] arr = {11, 22, 33, 44, 55};
        int data = 44;
        int index = findIndex(arr, data);
        System.out.println("你查找的元素的索引值是：" + index);
    }

    public static int findIndex(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == data) {
                return i;
            }
        }
        return -1;
    }
}
