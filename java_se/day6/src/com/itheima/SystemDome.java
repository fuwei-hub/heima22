package com.itheima;

public class SystemDome {
    public static void main(String[] args) {
        //jvm中断方法
        System.out.println("我在运行");
        //System.exit(0);
        System.out.println("我死了");

        //数组的copy
        int[]arr={11,22,33,44,55,66};
        int[]brr=new int[10];
        System.arraycopy(arr,0,brr,0,arr.length);
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }
    }
}
