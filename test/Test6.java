package com.yutianle.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //需求：某系统的数字密码：比如1983，采用加密方式进行传输。规则如下：
        //先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数。

        //1、定义一个数组，存储需要加密的数字密码
        Scanner sc = new Scanner(System.in);

        System.out.println("请你输入需要加密的数字个数：");
        int length = sc.nextInt();
        int[] arr = new int[length];

        //2、录入需要加密的数字
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i+1) + "数字：");
            int data =sc.nextInt();
            arr[i] = data;
        }

        //3、打印数组
       print(arr);

        //4、加密 (每位数都加上5，再对10求余)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }

        //5、加密(反正)

        for (int i = 0, j = arr.length - 1; i < j ; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        print(arr);
    }

    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1 ? arr[i] : arr[i] + " ,");
        }
        System.out.println("]");
    }
}
