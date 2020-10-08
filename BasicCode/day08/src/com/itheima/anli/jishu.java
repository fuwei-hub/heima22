package com.itheima.anli;

import java.util.Scanner;

//键盘输入一个字符串，计算出其中大写字母、小写字母、数字的次数
public class jishu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要计数的字符串");
        String s = sc.nextLine();
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        char[] chars = s.toCharArray();
        //将字符串转化成字符数组
        for (int i = 0; i < chars.length; i++) {
            //遍历数组，然后比较
            //chars[i]
            int c = chars[i];
            if (c >= 'A' && c <= 'Z') {
                bigCount++;
            }
            if (c >= 'a' && c <= 'z') {
                smallCount++;
            }
            if (c >= '0' && c <= '9') {
                numCount++;
            }
        }
        System.out.println("大写字母有：" + bigCount);
        System.out.println("小写字母有：" + smallCount);
        System.out.println("数字字母有：" + numCount);

    }
}

