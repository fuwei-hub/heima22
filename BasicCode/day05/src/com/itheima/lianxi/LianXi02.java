package com.itheima.lianxi;

import java.util.Scanner;

/*
输入一个数，匹配相应的索引
1.定义一个容量为5个数的静态初始化数组。
2.键盘录入与元素匹配
3.定义一个变量记录索引
4.输出索引


 */
public class LianXi02 {
    public static void main(String[] args) {
        int index=-1;
        Scanner sc=new Scanner(System.in);
        int[]arr={56,65,66,85,94};
        int num=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("该数的索引是："+index);
        }else{
            System.out.println("该数不在数组中");
        }
    }
}
