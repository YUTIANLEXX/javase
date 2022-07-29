package com.yutianle.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //1、求较大值
//     int[] arr = {12, 22, 33, 44, 7, 8};
//     int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("数组的最大值是：" + max);
        //2、猜数字
        //随机生成1-20之间的5个数（无所谓重复）

        //定义一个动态初始化的数组存储5个数据
        int[] data = new int[5];
        //动态生成五个数
        Random r = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = r.nextInt(1,20);
        }
        Scanner sc = new Scanner(System.in);
        OUT:
        while(true) {
            System.out.println("请输入一个1-20的整数：");
            int guess = sc.nextInt();

            //遍历数组
            for (int i = 0; i < data.length; i++) {
                if(data[i] == guess) {
                    System.out.println("恭喜你猜中了,你猜中的数据索引是：" + i);
                    break OUT;
                }
            }
            System.out.println("当前猜测的数据不存在，请重新输入");
        }
        //输出数组的全部元素
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
    }
}
