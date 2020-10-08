package com.itheima.task;


import java.util.Scanner;

/*
请定义一个方法用于判断一个字符串是否是对称的字符串，
并在主方法中测试方法。例如："abcba"、"上海自来水来自海上"均为对称字符串。
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想要判断的字符串");
        String s = sc.nextLine();
        boolean a = trueorfalse(s);
        System.out.println(a);
    }

    private static boolean trueorfalse(String s) {
        if (s == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s1 = sb.toString();
        /*if (s1.equals(s)) {
            return true;
        } else {
            return false;
        }*/
        return s1.equals(s);
    }
}