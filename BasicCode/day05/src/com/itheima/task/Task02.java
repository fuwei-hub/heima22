package com.itheima.task;

/*
定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行
 */
public class Task02 {
    public static void main(String[] args) {
        int max = getMax(45,654,95);
        System.out.println(max);
    }

    public static int getMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            int max = a;
            return max;
        } else if (b >= a && b >= c) {
            int max = b;
            return max;
        } else {
            int max = c;
            return max;
        }


    }
}
