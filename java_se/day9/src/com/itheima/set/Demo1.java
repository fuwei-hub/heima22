package com.itheima.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//Set存储字符串并遍历
public class Demo1 {
    public static void main(String[] args) {
        Set<String> str = new TreeSet<>();
        str.add("哎哟");
        str.add("小伙子");
        str.add("不错哦");
        //iterator遍历方式
        Iterator<String> iterator = str.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("-------------我是一条无情的分割线---------------");
        for (String s : str) {
            System.out.println(s);
        }
    }
}
