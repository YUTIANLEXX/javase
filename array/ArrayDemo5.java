package com.yutianle.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //需求：随机排名(相似还有洗牌)
        //键盘录入一组工号，随机生成一组排名

        //1、初始化一个数组，存储5个工号
        int[] codes = new int[5];

        //2、定义一个循环，循环5次，依次录入一个工号存入对应的位置
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < codes.length; i++) {
            //录入工号
            System.out.println("请你输入第" + (i+1) + "个员工的工号：");
            int code = sc.nextInt();

            //存入到数组去
            codes[i] =code;
        }
        Random r = new Random();
        //3、遍历数组的每个元素，随机一个索引出来，让该元素与随机索引位置处的元素值进行交换
        for (int i = 0; i < codes.length; i++) {
            //随机一个索引位置出来：codes[index]
            int index = r.nextInt(codes.length);

            //交换
            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }

        //4、遍历数组元素显示随机排名的结果
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + "\t");
        }
    }
}
