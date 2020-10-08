package com.itheima.lianxi;
/*
二维数组的动静结合
动加动
 */
public class LianXi03 {
    public static void main(String[] args) {
        int[][]arr=new int[3][3];
        int[]brr={16,52,65,45};
        arr[0]=brr;
        System.out.println(arr[0][2]);
        //动加静
        int[][]crr=new int[3][];
        int[]drr={15,65,65,62};
        crr[0]=drr;
        System.out.println(crr[0][1]);
        //静加动
        int[]irr=new int[5];
        int[]ierr=new int[3];
        int[][]err={irr,ierr};
        System.out.println(err[0][4]);
    }
}
