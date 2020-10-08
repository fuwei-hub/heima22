package com.itheima.task;

import java.util.Scanner;

/*
已知一个数组 arr = {19, 28, 37, 46, 50};
键盘录入一个数据。定义一个方法，完成查找该数据在数组中的索引，并在控制台输出找到的索引值。
 */
public class Task09 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        System.out.println("请输入您想要查询的数据！");
        getIdext(arr);
    }

    public static void getIdext(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int idext = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            //arr[i]
            if (idext == arr[i]) {
                System.out.println(i);
            }
        }
    }
}










