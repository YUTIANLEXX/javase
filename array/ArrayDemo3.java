package com.yutianle.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
//        int[] ages = {20, 30, 40, 50};
//
//        for (int i = 0; i < ages.length; i++) {
//            System.out.println(ages[i]);
//
//       }
        int[] money = {16, 26, 36, 6, 100};
        int sum = 0;

        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println(sum);
    }
}
