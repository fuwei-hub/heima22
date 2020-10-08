package com.itheima.task;
/*
有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
​        假如兔子都不死，问第二十个月的兔子对数为多少？
1. 为了存储多个月的兔子对数，定义一个数组，用动态初始化完成数组元素的初始化，长度为20
2. 因为第1个月，第2个月兔子的对数是已知的，都是1，所以数组的第1个元素，第2个元素值也都是1
3. 用循环实现计算每个月的兔子对数
4. 输出数组中最后一个元素的值，就是第20个月的兔子对数
 */
public class Task03 {
    public static void main(String[] args) {
        int[]arr=new int[20];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-2]+arr[i-1];
        }
        System.out.println("一共有："+arr[19]+"只兔子");
    }
}


