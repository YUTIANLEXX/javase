package com.yutianle.object;

import java.util.Random;
import java.util.Scanner;

public class StringEqualdemo {
    public static void main(String[] args) {
        //1、正确登录名和密码
        String okName = "admin";
        String okPassword = "123456";

        //2、输入登陆名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入正确的登录名称：");
        String name = sc.next();
        System.out.println("请您输入正确的登录密码：");
        String password = sc.next();

        //3、判断是否正确
        if (okName.equals(name)  && okPassword.equals(password)){
            System.out.println("登陆成功！");
        }else {
            System.out.println("用户名或者密码错误！");
        }

        //4、忽略大小写，用于比较验证码

        String sysCode = "fB1cZ";
        String code1 = "fb1cz";

        System.out.println(sysCode.equals(code1));
        System.out.println(sysCode.equalsIgnoreCase(code1));
    }
}
