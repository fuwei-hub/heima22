package com.itheima.task;
/*
设计一个方法获得小数类型的绝对值。
1.既然是获得，说明要return。
2.小数类型，说明是double

 */
public class Task01 {
    public static void main(String[] args) {
        double jueDuiZhi = getJueDuiZhi(0);
        System.out.println(jueDuiZhi);
    }
    public static double getJueDuiZhi(double a ) {
        if(a <0){
            double jueDuiZhi=-a;
            return jueDuiZhi;
        }
        else{return a;}
    }
}
