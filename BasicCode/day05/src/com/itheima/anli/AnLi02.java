package com.itheima.anli;

import java.util.Scanner;

/*
定义一个名为sum的方法，定义两个变量，输出这两个变量之间的奇数
 */
public class AnLi02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数：");
        int b = sc.nextInt();
        int n = a;
        int m = b;
        sum(n, m);
    }

    public static void sum(int n, int m) {
        if (m > n) {
            for (int i = n; i < m; i++) {
                if (i % 2 == 1) {
                    System.out.println("奇数有：" + i);
                }
            }
        } else {
            System.out.println("请输入正确的范围！");
            ;
        }
    }
}


