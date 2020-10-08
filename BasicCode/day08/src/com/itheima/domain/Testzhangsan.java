package com.itheima.domain;

import java.util.Scanner;

//键盘录入一个人的名字和年龄，分割成两块
public class Testzhangsan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生信息");
        String  s=sc.nextLine();
        String[] split = s.split("，");
        ZhangSan zhangsan = new ZhangSan();
        zhangsan.setAge(split[0]);
        zhangsan.setName(split[1]);
        System.out.println(zhangsan);
    }
}
