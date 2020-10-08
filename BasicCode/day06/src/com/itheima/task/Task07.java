package com.itheima.task;

import java.util.Scanner;

/*
在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
​        选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。
 */
public class Task07 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //arr[i]  现在都还等于0
            System.out.println("请输入第" + (i + 1) + "位评委老师的评分");
            int socrd = sc.nextInt();
            if (socrd > 100 || socrd < 0) {
                System.out.println("请输入正确的评分！");
                i--;
            } else {
                arr[i] = socrd;
            }
        }
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        //这里定义三个变量，一定是在已经遍历数组之后，要不然下面都是0；
        for (int i = 0; i < arr.length; i++) {
            //arr[i] 现在这里面是刚刚键盘录入的值
            max = max > arr[i] ? max : arr[i];
            min = min < arr[i] ? min : arr[i];
            sum += arr[i];
        }
        int avg = (sum - min - max) / 4;
        System.out.println("最高分为：" + max);
        System.out.println("最低分为：" + min);
        System.out.println("最终分数为" + avg);
    }

}
