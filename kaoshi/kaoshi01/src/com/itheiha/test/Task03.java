package com.itheiha.test;

import java.util.Scanner;

/*
20.提示用户键盘录入一个包含数字和字母的字符串（不做是否包含数字和字母的判断），
遍历字符串分别筛选出数字和字母（如有符号不包含在字母里），
按照数字在前字母在后的规则组成一个新的字符串，把组成的新字符串打印在控制台。

例如：
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个包含数字和字母的字符串！");
        String  a=sc.nextLine();
        String s1="";
        String s2="";
        char[] chars = a.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            //chars[i]
            if((chars[i]>'a'&&chars[i]<'z')||(chars[i]>'A'&&chars[i]<'Z')){
             s1+=chars[i];
            }
            else{
                s2+=chars[i];
            }
        }
        System.out.print("新产生的字符串为："+s2+s1);

    }
}
