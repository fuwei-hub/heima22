package com.itheima.task;

/*
设计一个方法，用于比较两个数组的内容是否相同。
 */
public class Task08 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 66, 44, 11, 55};
        int[] brr = {11, 22, 44, 66, 11, 55};
        boolean b = compare(arr, brr);
        System.out.println(b);
    }

    public static boolean compare(int[] arr, int[] brr) {
        if (arr.length != brr.length) {
            //先比较长度是否一致
            return false;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != brr[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}

