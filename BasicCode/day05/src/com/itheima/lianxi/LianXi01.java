package com.itheima.lianxi;

import java.util.Scanner;

/*
评委评分，六位评委每个人输入0-100的评分，去掉一个最高分，一个最低分，剩下的求和取平均值。
1.定义一个长度为6的动态初始化数组
2.遍历数组
3.键盘录入，将键盘录入的值赋值给数组中的元素
4.求最大值、最小值，求和
5.输出
 */
public class LianXi01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的评分");
            int s = sc.nextInt();
            if (s > 100 || s < 0) {
                System.out.println("请输入正确的评分！");
                i--;
            } else {
                arr[i] = s;
            }
        }
        int max = arr[0];
        int min = arr[0];
        int sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }
        int avg = (sum - max - min) / 4;
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);
        System.out.println("平均分为：" + avg);
    }
}
