package com.itheima.anli;
/*
二维数组，求其中数组的和。
1.遍历二位数组（因为是二维数组，所以遍历的话就要遍历两次）
2.设立变量记录和的变化
 */
public class anli02 {
    public static void main(String[] args) {
    int[][]arr={{11,22,33},{44,55,66},{77,88,99}};
    int sum=0;
        for (int i = 0; i < arr.length; i++) {
            //arr[]
            for (int j = 0; j < arr[i].length; j++) {
                //arr[][]
                sum+=arr[i][j];
            }

        }
        System.out.println("二维数组的和为"+sum);

    }
}
