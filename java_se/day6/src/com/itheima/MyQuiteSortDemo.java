package com.itheima;

//快速排序
public class MyQuiteSortDemo {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        quiteSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    private static void quiteSort(int[] arr, int min, int max) {
        //这是递归的出口
        if (min > max) {
            return;
        }
        int start = min;
        int end = max;
        int baseNumber = arr[start];
        while (min != max) {
            //这里一定是从右开始找比基准数小的
            while (arr[max] >= baseNumber && min < max) {
                max--;
            }
            //然后再从左边开始找比基数大的
            while (arr[min] <= baseNumber && min < max) {
                min++;
            }
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
            //这一步就将基础数左右两边分割好了
        }
        int temp=arr[min];
        arr[min]=arr[start];
        arr[start]=temp;
        //左半部分调用方法
        quiteSort(arr,start,max-1);
        //右半部分调用方法
        quiteSort(arr,max+1,end);
    }
}
