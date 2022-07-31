package com.yutianle.test;

public class Test2 {
    public static void main(String[] args) {
        //需求：寻找100-200之间的素数
        // 除了1和它本身以外，不能被其他正整数整除，就叫素数。
        isPrime();

    }
    public static void isPrime() {
        for (int i = 101; i <=200 ; i++) {

            //假设当前数为素数
            boolean flag = true;

            for (int j = 2; j < i / 2 ; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                System.out.print(i + "\t");

            }
        }
    }
}
