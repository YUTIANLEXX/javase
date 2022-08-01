package com.yutianle.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //需求：在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
        // 选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。

        //1、定义一个数组，用来存储评委打分的成绩
        int[] scores = new int[6];

        Scanner sc = new Scanner(System.in);

        //输入成绩
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i+1) + "位评委的打分：");
            int score = sc.nextInt();
            scores[i] = score;
        }

        int max = scores[0];
        int min = scores[0];
        int sum = 0;

        //2、遍历数组，寻找最高分、最低分、总分
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]> max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
            sum +=scores[i];
        }

        //3、求平均分
        double score = (sum - max - min) * 1.0 / (scores.length - 2);

        //4、打印
        System.out.println("最高分是:"+max);
        System.out.println("最低分是:"+min);
        System.out.println("选手的最终得分是：" + score);

    }
}
