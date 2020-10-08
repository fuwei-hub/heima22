package com.itheima.lianxi;

import java.util.Scanner;

public class YiDong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想要检验的字符串");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s1 = sb.toString();
        if(s1.equals(s)){
            System.out.println("您输入的是对称字符串");
        }else{
            System.out.println("您输入的不是字符串");
        }
    }
}
