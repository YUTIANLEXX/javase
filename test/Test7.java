package com.yutianle.test;

import java.util.Random;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //需求：中奖号码由6个红球和1个篮球组成(注意：6个红球要求不能重复)。

        //1、定义一个数组，存放随机生成的6个红球和1个蓝球
        int[] luckNumbers = createluckNumbers();
        //print(luckNumbers);
        //2、用户输入红球和蓝球号码
        int[] userNumbers = userinputNumbers();
       // print(userNumbers);

        //3、判断中奖情况
        jude(luckNumbers,userNumbers);

    }

    public static void jude(int[] luckNumbers, int[] userNumbers) {
        //luckNumbers = {1, 22 ,33, 15, 21, 8, 16}
        //userNumbers = {1, 22, 16, 17, 20, 11, 4}

        //定义两个变量用来存放红球和蓝球的中将个数
        int redHitNumbers = 0;
        int blueHitNumbers = 0;

        for (int i = 0; i < userNumbers.length - 1; i++) {
            for (int j = 0; j < luckNumbers.length - 1; j++) {
                if(userNumbers[i] == luckNumbers[j]) {
                    redHitNumbers++;
                    break;
                }
            }
        }
        blueHitNumbers = (userNumbers[6] == luckNumbers[6] ? 1 : 0);

        //用个数来判断中奖情况
        System.out.println("中奖号码是：");
        print(luckNumbers);
        System.out.println("您投注的号码是：");
        print(userNumbers);
        System.out.println("您是否命中蓝球：" + (blueHitNumbers == 1 ? "是" : "否"));

        if(blueHitNumbers == 1 && redHitNumbers <3) {
            System.out.println("恭喜你，获得了5元小奖~~");
        }else if(blueHitNumbers == 1 && redHitNumbers == 3
                || redHitNumbers == 4 && blueHitNumbers == 0) {
            System.out.println("恭喜你，获得了10元小奖励~~");
        }else if(blueHitNumbers == 1 && redHitNumbers == 4
                || redHitNumbers == 5 && blueHitNumbers == 0) {
            System.out.println("恭喜你，获得了220元小奖励~~");
        }else if(blueHitNumbers == 1 && redHitNumbers == 5) {
            System.out.println("恭喜您，获得了了3000元大奖~~");
        }else if(blueHitNumbers == 0 && redHitNumbers == 6) {
            System.out.println("恭喜你，获得了500万的超级大奖！！！");
        }else if(blueHitNumbers == 1 && redHitNumbers == 6) {
            System.out.println("恭喜你，获得了1000万的超级大奖！！！");
        }else{
            System.out.println("感谢你为中国福利事业做出的贡献！");
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < 7; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int[] userinputNumbers() {
        int[] numbers = new int[7];

        //用户录入红球号码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length-1; i++) {
           //判断输入号码的合法性
            while(true) {
                System.out.println("请输入第" + (i+1) + "个红球号码（1-33）：");
                int data = sc.nextInt();
                if(data >= 1 && data <= 33) {
                    numbers[i] = data;
                    break;
                } else {
                    System.out.println("您输入的号码有误，请重新输入：");
                }
            }
        }
        //用户输入蓝球号码
        System.out.println("请输入蓝球号码（1-16）：");
        numbers[6]=sc.nextInt();
        return numbers;
    }

    //随机生成红球和蓝球
    public static int[] createluckNumbers() {
        int[] numbers = new int[7];
        Random r = new Random();

        for (int i = 0; i < numbers.length - 1; i++) {

            while (true) {
                boolean flag = true;
                int data = r.nextInt(33)+1;

                for (int j = 0; j < i; j++) {
                    if(numbers[j] == data) {
                    flag = false;
                    break;
                    }
                }
                if(flag) {
                    numbers[i] = data;
                    break;
                }
            }
        }
        //随机生产蓝球号码
        numbers[numbers.length-1] = r.nextInt(16) + 1;
        return numbers;
    }
}
