package com.yutianle.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        //需求：定义方法实现随机产生一个指定位数的验证码，每位可能是数字、大写、小写字母
       String code = createCode(4);
        System.out.println("随机生成的验证码是：" + code);

    }

    public static String createCode(int n) {
        String code = "";
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            //随机生成大写(0)，小写(1)，数字(2)选择
            int type = r.nextInt(3);
            switch (type) {
                case 0:
                    char ch = (char)(r.nextInt(26)+65);
                    code += ch;
                    break;
                case 1:
                    char ch1 = (char)(r.nextInt(26)+97);
                    code += ch1;
                    break;
                case 2:
                    code += r.nextInt(10);
                    break;
            }
        }
        return code;
    }
}
