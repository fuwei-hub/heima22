package com.itheima.anli;

//比较两个整数的大小，使其兼容（byte，short，int，long模式）
public class AnLi04 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        System.out.println(compare(10, 30));
    }

    public static boolean compare(int a, int b) {
        return a == b;
    }

    public static boolean compare(byte a, byte b) {
        return a == b;
    }

    public static boolean compare(short a, short b) {
        return a == b;
    }

    public static boolean compare(long a, long b) {
        return a == b;
    }
}
