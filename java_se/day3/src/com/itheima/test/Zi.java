package com.itheima.test;

public class Zi extends Fu {
    int a=20;
    public  void rap() {
        int a=10;
        System.out.println("rap");
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);

    }
}
