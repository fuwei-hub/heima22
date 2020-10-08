package com.itheima.anli;

import com.itheima.string.StringDemo2;

import java.util.Scanner;

//将键盘录入的TMD转换成我爱你
public class Tmd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入");
        String s=sc.nextLine();
        String replace = s.replace("tmd", "我爱你").replace("sb", "好人");
        System.out.println(replace);
    }
}
