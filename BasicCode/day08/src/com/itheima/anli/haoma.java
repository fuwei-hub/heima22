package com.itheima.anli;

import java.util.Scanner;

//键盘录入一个手机号码，将中间四位用****隐藏起来
//.subString();使用次方法可以截取字符串中的字符
public class haoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的电话号码");
        String s = sc.nextLine();
        String substring = s.substring(0, 3);
        String substring1 = s.substring(7);
        System.out.println(substring + "****" + substring1);
    }
}
