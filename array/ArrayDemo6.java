package com.yutianle.array;

public class ArrayDemo6 {
    public static void main(String[] args) {
        //1、定义一个数组，存储数据
        int[] arr = {5, 2, 3, 1};

        //2、定义一个循环控制比较的趟数
        for (int i = 0; i < arr.length - 1; i++) {
            //3、控制每趟比较的次数

            //假设本趟排序有序
            int flag = 1;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                    //本趟排序不完全有序
                    flag = 0;
                }
            }
            if(flag == 1) {
                break;
            }
        }

        //4、遍历数组输出内容
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
