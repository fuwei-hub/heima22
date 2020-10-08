package com.itheima.task;

import java.util.Scanner;

/*
键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您所要遍历的字符串");
        String s = sc.nextLine();
        int max = 0;
        int small = 0;
        int num = 0;
        char[] chars = s.toCharArray();
        //将输入的字符串调用方法转变成数组
        for (int i = 0; i < chars.length; i++) {
            //遍历数组，
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                max++;
            }
            if (chars[i] >='a' && chars[i] <= 'z') {
                small++;
            }
            if (chars[i] >= '0' && chars[i] <= '9') {
                num++;
            }
        }
        System.out.println("大写字母有："+max);
        System.out.println("小写字母有："+small);
        System.out.println("数字字母有："+num);
    }
}
