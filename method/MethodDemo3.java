package com.yutianle.demo;

public class MethodDemo3 {
    public static void main(String[] args) {
        int[] arr = {11, 22 ,8, 23, 4 };

        int max = getNumberMAX(arr);
        System.out.println("该数组中元素的最大值是" + max);

    }
    public static int getNumberMAX(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
