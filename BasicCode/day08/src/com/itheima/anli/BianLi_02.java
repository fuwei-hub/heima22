package com.itheima.anli;

import java.util.Scanner;

//m.charAt（）这是获得了字符串（）上的元素，这是一个方法
// 所以先获得字符串的长度m.length，然后用for循环遍历输出
public class BianLi_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您想要遍历的字符串");
        String s=sc.nextLine();
        for (int i = 0; i <s.length(); i++) {
            //i
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}
