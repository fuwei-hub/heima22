package com.itheima.anli;

//用方法遍历数组，输出【11.22.33.44.55】
/*
1.定义数组
2。设计方法便利数组
 */
public class AnLI05 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        printArray(arr);
        //将arr传递给参数
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        //在数据开始前输出[
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
                //最后一位直接打印元素就可以了
            } else {
                System.out.print(arr[i] + " , ");
            }
        }
        System.out.println("]");
        //打印接触输出]
    }
}
