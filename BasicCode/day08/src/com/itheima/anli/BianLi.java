package com.itheima.anli;

import java.util.Scanner;

//手动输入一个字符串，在控制台答应出字符元素
//m.toCharArray  这种是把字符串转化成字符数组
public class BianLi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想要遍历的字符串");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

}
