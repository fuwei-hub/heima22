package com.itheima;

//冒泡排序
/*
1.定义一个乱序的数组
2.调用冒泡排序的方法
 */
public class MyBubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {11, 44, 55, 22, 99};
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        //递归的方法所要循环的次数需要四次的确定，最后一位1不需要确定
        for (int j = 0; j < arr.length - 1; j++) {
            //定义for循环方法，第一次选出一个最大值需要比较四次，随后一次递减
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] >= arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
