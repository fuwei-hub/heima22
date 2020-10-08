package com.itheima.task;
/*
已知一个数组 arr = {19, 28, 37, 46, 50}; 用程序实现把数组中的元素值交换，

        ​        交换后的数组 arr = {50, 46, 37, 28, 19}; 并在控制台输出交换后的数组元素。
        */

public class Task06 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        int[] brr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            int temp = arr[i];
            arr[i] = brr[j];
            brr[j] = temp;
            //这里可以借用第三个变量来帮助其完成数据的转换，好处是只需要走两轮就可以完成交换了，因为第三个变量
            //可以一下子帮忙赋两个值
            System.out.print(brr[j] + " ");
        }
    }
}
