package com.yutianle.d2_static_util;

public class ArrayUtil {
    /**
     * 私有构造器
     */
    private  ArrayUtil(){

    }

    /**
     * 工具方法：静态方法
     */
    public static String toString(int[] arr) {
        //1、校验
        if(arr == null) {
            return null;
        }

        //2、拼接字符串并返回
        String result = "";
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            result += (i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        result += "]";
        return result;
    }
}
