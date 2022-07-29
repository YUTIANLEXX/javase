package com.yutianle.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
//        //案例1，需求：某部门5名员工的销售额分别是：16、26、36、6、100，请计算出他们部门的总销售额
//
//        int[] money = {16, 26, 36, 6, 100};
//        int sum = 0;
//
//        for (int i = 0; i < money.length; i++) {
//            sum += money[i];
//        }
//        System.out.println("该部门的销售总额是：" + sum + "元");

//        //案例2，需求：数组元素求最大值
//
//        int[] facescores = {15, 85, 90 ,88, 59, -9};
//        int max = facescores[0];
//
//        for (int i = 1; i < facescores.length; i++) {
//            if (facescores[i] > max) {
//                max = facescores[i];
//            }
//        }
//        System.out.println("该数组中元素值最大的是：" + max);

//        //案例3，游戏后台随机生成1-20之间的5个数（无所谓是否重复），然后让大家来猜数字：
//
//        int[] arr = new int[5];
//
//        Random r = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = r.nextInt(1,20);
//        }
//
//        Scanner sc = new Scanner(System.in);
//        OUT:
//        while(true) {
//            System.out.println("请您输入来猜测1-20之间的整数");
//            int guess = sc.nextInt();
//
//            for (int i = 0; i < arr.length; i++) {
//                if(guess == arr[i]) {
//                    System.out.println("恭喜你猜对了，该元素的索引是" + i);
//                    break OUT;
//                }
//            }
//                System.out.println("当前猜测的数据不存在，请重新输入!");
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }

//        //案例4，需求：某公司开发部5名开发人员，要进行项目进展汇报演讲，现在采取随机排名后进行汇报
//
//        int[] data = new int[5];
//
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < data.length; i++) {
//            System.out.println("请你输入第" + (i+1) + "个员工的工号:");
//            int code = sc.nextInt();
//            data[i] = code;
//        }
//
//        Random r = new Random();
//        for (int i = 0; i < data.length; i++) {
//            int index = r.nextInt(data.length);
//
//         int temp = data[index];
//         data[index] = data[i];
//         data[i] =temp;
//        }
//
//        System.out.println("本次汇报演讲的顺序是：");
//        for (int i = 0; i < data.length; i++) {
//            System.out.print(data[i] + "\t");
//        }

        //案例5，需求：冒泡排序

        int[] arr = {5, 8, 3, 9, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            int flag = 1;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] =temp;

                    flag = 0;
                }
            }

            if (flag == 1) {
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
