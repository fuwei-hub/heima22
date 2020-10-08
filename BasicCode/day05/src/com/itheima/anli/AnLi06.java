package com.itheima.anli;

/*
设置一个方法，找出数组中的最大值和最小值。
2.定义静态格式化数组
3.设计数据类型为数组的办法
4.找出最大值和最小值
5.将最大值和最小值赋值给数组
6.调用数组
7.输出最大值最小值

 */
public class AnLi06 {
    public static void main(String[] args) {
        int[] arr = {56, 65, 74, 85, 96};
        int[] maxAndMin = getMaxAndMin(arr);
        System.out.println(maxAndMin[0]);
        System.out.println(maxAndMin[1]);
    }

    public static int[] getMaxAndMin(int[]arr) {
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            max=max>arr[i]?max:arr[i];
            min=min>arr[i]?arr[i]:min;
        }
        int[]maxAndMin={max,min};
        return maxAndMin;

    }
}


