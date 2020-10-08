package com.itheima.string;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入整数:");
        int num = sc.nextInt(); // 10 + 回车换行
        System.out.println("请输入字符串:");
        String s = sc.nextLine();


        System.out.println(num);
        System.out.println(s);
    }
}
