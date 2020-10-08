package com.itheima;

import java.util.Arrays;

//有一个字符串：“91 27 46 38 50”，请写程序实现最终输出结果是：27 38 46 50 91
/*
1.创建字符串变量
2.使用空格来分割字符串
3.遍历字符串将字符串转化成数组元素
4.将数组大小排序输出
 */
public class StringExchangToArray {
    public static void main(String[] args) {
        String s="91 27 46 38 50";
        String[] s1 = s.split(" ");
        int[]arr=new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            //将遍历到的字符串转换成数组元素
            arr[i]=Integer.parseInt(s1[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    
}
