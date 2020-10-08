package com.itheima;

public class MyMathDome {
    public static void main(String[] args) {
        //取绝对值
        int abs = Math.abs(-15);
        System.out.println(abs);

        //向上取整
        double ceil = Math.ceil(10.1);
        System.out.println(ceil);

        //向下取整
        double floor = Math.floor(10.9);
        System.out.println(floor);

        //四舍五入
        long round = Math.round(10.50);
        System.out.println(round);

        //输出[0.0-1)的随机数(若想取得范围较高的随机数，输出乘相应的数就可了)
        double random = Math.random();
        System.out.println(random);


        //输出a的b次幂
        double pow = Math.pow(2, 3);
        System.out.println(pow);

        //获得两个数的最大值
        int max = Math.max(12, 14);
        System.out.println(max);

        //获得两个数的最小值
        int min = Math.min(1888, 198);
        System.out.println(min);
    }
}
