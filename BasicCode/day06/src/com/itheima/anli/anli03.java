package com.itheima.anli;
/*
求二维数组中的最大值
1.定义二维数组
2.遍历二维数组
3.定义一个变量记录最大值
 */
public class anli03 {
    public static void main(String[] args) {
        int[][]arr={{11,22,33},{44,55,66},{77,88,99}};
        int max=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            //arr[]这里只是遍历了二维数组
            for (int j = 0; j < arr[i].length; j++) {
                //arr[][]这里遍历了二维数组中的一维数组
                 max=max>arr[i][j]?max:arr[i][j];
            }
        }
        System.out.println("最大值为："+max);
    }
}
