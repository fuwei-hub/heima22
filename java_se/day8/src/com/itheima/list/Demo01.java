package com.itheima.list;

import java.util.ArrayList;
import java.util.List;

/*
void add(int index,E   element)在此集合中的指定位置插入指定的元素
E remove(int   index)删除指定索引处的元素，返回被删除的元素
E set(int index,E   element)修改指定索引处的元素，返回被修改的元素
E get(int   index)返回指定索引处的元素
 */
public class Demo01 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        //remove(list);
        //set(list);
        //get(list);


    }

    private static void get(List<String> list) {
        //E get(int   index)返回指定索引处的元素
        String s = list.get(2);
        System.out.println(s);
    }

    private static void set(List<String> list) {
        //E set(int index,E   element)修改指定索引处的元素，返回被修改的元素
        String fff = list.set(3, "fff");
        System.out.println(fff);
        System.out.println(list);
    }

    private static void remove(List<String> list) {
        //E remove(int   index)删除指定索引处的元素，返回被删除的元素
        String remove = list.remove(0);
        System.out.println(remove);
        System.out.println(list);
    }
}
