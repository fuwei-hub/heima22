package com.itheima;

/*
在数组{1,2,3,4,5,6,7,8,9,10}中,查找某个元素的位置
二分查找法
 */
public class MyBinarySearchDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 10;
        int start = 0;
        int end = arr.length - 1;
        int index = getIndex(arr, start, end, num);
        System.out.println(index);
    }

    private static int getIndex(int[] arr, int start, int end, int num) {
        while (start <= end) {
            int mid = (start + end) >> 1;
            if (num > arr[mid]) {
                start = mid + 1;
            }
            else if (num < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
