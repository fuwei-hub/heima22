package com.itheima.anli;

import java.util.Scanner;

//键盘录入一串数字例如12345566，判断其是否是对称的
/*
1.键盘录入
2.转化成StringBuilder类型，进行乾坤大挪移
3.转化成String类型进行比较
 */
public class DuiCheng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您所要检验的字符串");
            String s = sc.nextLine();
            StringBuilder s1 = new StringBuilder(s);
            //将输入的字符串
            s1.reverse();
            String s2 = s1.toString();
            if (s2.equals(s)) {
                System.out.println("您输入的是对称字符串");
            } else {
                System.out.println("您输入的不是对称字符串");
            }
        }

    }
}
