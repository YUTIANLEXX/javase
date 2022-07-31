package com.yutianle.test;

public class Test4 {
    public static void main(String[] args) {
        //需求：把一个数组中的元素复制到另一个新数组中去。

        int[] arr1 = {11, 22, 33, 34, 44};
        int[] arr2 = new int[arr1.length];

        copyArray(arr1, arr2);
        printArray(arr1);
        System.out.println("-----------");
        printArray(arr2);

    }

    public static void printArray(int[] arr) {

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }

        public static void copyArray( int[] arr1, int[] arr2){
        //复制数组内容
            for (int i = 0; i < arr1.length; i++) {
                arr2[i] = arr1[i];
            }
        }
    }