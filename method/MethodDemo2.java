package com.yutianle.demo;

import java.util.Scanner;

public class MethodDemo2 {
    //需求：拿一个整数，然后调用方法，把整数交给方法，在方法中输出该数为奇数还是偶数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入需要判断的数字：");
        int ret = sc.nextInt();
        check(ret);
    }

    public static void check(int ret) {
        if(ret % 2 == 1) {
            System.out.println(ret + "是奇数");
        }else{
            System.out.println(ret + "是偶数");
        }
    }
}
