package com.yutianle.demo;

import java.util.Scanner;

public class MethodDemo1 {
    public static void main(String[] args) {
//        案例1、需求：定义一个方法，方法中计算出 1-n的和并返回
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入需要取得前n个整数相加的和：");
        int ret = sc.nextInt();
        int sum = Add(ret);
        System.out.println("sum=" + sum);
    }

    public static int Add(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
