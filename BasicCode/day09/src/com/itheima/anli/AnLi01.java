package com.itheima.anli;

import java.util.ArrayList;

/*
创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合
 */
public class AnLi01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("付伟");
        list.add("是");
        list.add("吴娱大哥");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
