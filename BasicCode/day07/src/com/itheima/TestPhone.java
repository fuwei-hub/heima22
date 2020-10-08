package com.itheima;
/*
测试手机类
 */
public class TestPhone {
    public static void main(String[] args) {
        //创建对象
        Phone p=new Phone();
        //适用对象
        p.brand="华为mate30pro";
        p.price=9999.9;
        System.out.println(p.brand+"     "+p.price);
        p.call("付伟");
        p.sendMessage();
    }
}