package com.yutianle.param;

public class ParamTest1 {
    public static void main(String[] args) {
//        需求：
//        设计一个方法用于输出任意整型数组的内容，要求输出成如下格式：
//        “该数组内容为：[11, 22, 33, 44, 55]”
        int[] arr = {11, 22, 33, 44, 55};
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        //1、判断数组是否为空
        if(arr != null) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print((i == arr.length - 1 ? arr[i] : arr[i] + ","));
            }
            System.out.println("]");
        }else {
            System.out.println("您需要打印的数组为空！");
        }
    }
}
