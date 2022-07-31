package com.yutianle.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //需求：机票最终优惠价格的计算方案如下：
        // 旺季（5-10月）头等舱9折，经济舱8.5折
        // 淡季（11月到来年4月）头等舱7折，经济舱6.5折。

        //1、用户输入机票的相关信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入机票的原价：");
        double money = sc.nextDouble();
        System.out.println("请输入购买的月份（1~12）：");
        int month = sc.nextInt();
        System.out.println("请输入机票的类型（头等舱/经济舱）：");
        String type = sc.next();

        System.out.println("优惠后的价格是：" + calc(money, month, type));

    }
    //2、设计一个方法，统计优惠后的价格
    public static double calc(double money, int month, String type) {
        if(month >= 5 && month <= 10) {
            switch (type) {
                case "头等舱":
                    money *= 0.9;
                    break;
                case "经济舱":
                    money *= 0.85;
                    break;
                default:
                    System.out.println("你输入的仓位有误，请重新输入！");
                    money = -1;
            }
        }else if(month == 11 || month== 12 || month >= 1 && month <= 4) {
            switch (type) {
                case "头等舱":
                    money *= 0.7;
                    break;
                case "经济舱":
                    money *= 0.65;
                    break;
                default:
                    System.out.println("你输入的仓位有误，请重新输入！");
                    money = -1;
            }
        }else {
            System.out.println("你输入的月份有误，请重新输入！");
            money = -1;
        }

        return money;
    }
}
