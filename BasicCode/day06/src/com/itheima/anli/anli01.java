package com.itheima.anli;

/*
将一个静态初始化的数组里面的元素前后颠倒。例如：{16，65，45，85，95}
颠倒为{95，85，45，65，16}
 */
public class anli01 {
    public static void main(String[] args) {
        int[] arr = {16, 65, 45, 85, 95};
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
/**
 * public class anli01 {
 * public static void main(String[] args) {
 * int[] arr = {16, 65, 45, 85, 95};
 * int[] brr = new int[arr.length];
 * for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
 * brr[j] = arr[i];
 * }
 * for (int j = 0; j < brr.length; j++) {
 * System.out.print(brr[j]+" ");
 * <p>
 * }
 * <p>
 * }
 * }
 */