package com.yutianle.param;

public class ParamTest3 {
    public static void main(String[] args) {
        //需求：
        //如果两个数组的类型，元素个数，元素顺序和内容是一样的我们就认为这2个数组是一模一样的。
        int[] arr1 = {11, 22 ,33};
        int[] arr2 = {11, 22, 33};

        boolean result= check(arr1, arr2);
        System.out.println(result);
    }
    public static boolean check(int[] arr1, int[] arr2) {
        //1、判断数组是否为空
        if(arr1 != null & arr2 != null) {

            //2、判断数组大小是否相同
            if(arr1.length == arr2.length) {

                //3、判断数组元素是否相同
                for (int i = 0; i < arr1.length; i++) {
                    if (arr1[i] != arr2[i]) {
                        return false;
                    }
                }
                return true;
        }else {
            return false;
        }
    }else {
        return false;
        }
    }
}
