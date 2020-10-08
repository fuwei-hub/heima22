package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;


/*
boolean add(E e)添加元素
boolean remove(Object o)从集合中移除指定的元素
boolean removeIf(Object o)根据条件进行移除
void   clear()清空集合中的元素
boolean contains(Object o)判断集合中是否存在指定的元素
boolean isEmpty()判断集合是否为空
int   size()集合的长度，也就是集合中元素的个数
 */
public class Demo01 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("aaa");
        // remove(list);
        //removeIf(list);
        //clear(list);
        //contains(list);
        //isEmpty(list);
        //size(list);
    }

    private static void size(Collection<String> list) {
        //int   size()集合的长度，也就是集合中元素的个数
        int size = list.size();
        System.out.println(size);
    }

    private static void isEmpty(Collection<String> list) {
        //boolean isEmpty()判断集合是否为空
        boolean empty = list.isEmpty();
        System.out.println(empty);
    }

    private static void contains(Collection<String> list) {
        //boolean contains(Object o)判断集合中是否存在指定的元素
        boolean contains = list.contains("aaa");
        System.out.println(contains);
    }

    private static void clear(Collection<String> list) {
        //void   clear()清空集合中的元素
        list.clear();
        System.out.println(list);
    }

    private static void removeIf(Collection<String> list) {
        //boolean removeIf(Object o)根据条件进行移除
        list.removeIf(s -> "aaa".equals(s));
        System.out.println(list);
    }

    private static void remove(Collection<String> list) {
        // boolean remove(Object o)从集合中移除指定的元素
        boolean remove = list.remove("aaa");
        System.out.println(list);
    }
}


