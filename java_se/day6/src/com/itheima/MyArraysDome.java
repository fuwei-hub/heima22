package com.itheima;

import java.util.Arrays;

public class MyArraysDome {
    public static void main(String[] args) {
        int[]arr={11,22,33,44,55};
        int[]arr2={22,44,33,11,55};
        //对比两个数组是否相同
        boolean equals = Arrays.equals(arr, arr2);
        System.out.println(equals);
        System.out.println(Arrays.toString(arr));
        //数组的大小排序
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        int i = Arrays.binarySearch(arr, 5);
        System.out.println(i);



    }
}
