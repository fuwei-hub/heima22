package com.itheima.task;

/*
请定义一个方法，实现交换整数数组中两个索引上的元素值。并调用方法，查看运行效果。
如，数组为{11, 22, 33, 44, 55, 66}，交换索引1和索引5位置上的元素，结果为{11, 66, 33, 44, 55, 22}
 */
public class Task04 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        exchang(arr, 0, 3);
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + " , ");
            }
        }
    }

    public static void exchang(int[] arr, int dext1, int dext2) {
        int num = arr[dext1];
        arr[dext1] = arr[dext2];
        arr[dext2] = num;

    }

}
