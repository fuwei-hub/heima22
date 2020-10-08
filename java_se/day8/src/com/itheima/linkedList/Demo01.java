package com.itheima.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
//LinkedList特有的功能
public void addFirst(E e)在该列表开头插入指定的元素
public void addLast(E e)将指定的元素追加到此列表的末尾
public E getFirst()返回此列表中的第一个元素
public   E getLast()返回此列表中的最后一个元素
public E removeFirst()从此列表中删除并返回第一个元素
public   E removeLast()从此列表中删除并返回最后一个元素
 */
public class Demo01 {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        //iterator(list);
        //superFor(list);
        //removeIF(list);
        //addFirst(list);
        //addLast(list);
        //getFirst(list);
        //getLast(list);
        //removeFirst(list);
        //removeLast(list);

    }

    private static void removeLast(LinkedList<String> list) {
        //public   E removeLast()从此列表中删除并返回最后一个元素
        String s = list.removeLast();
        System.out.println(s);
        System.out.println(list);
    }

    private static void removeFirst(LinkedList<String> list) {
        //public E removeFirst()从此列表中删除并返回第一个元素
        String s = list.removeFirst();
        System.out.println(s);
        System.out.println(list);
    }

    private static void getLast(LinkedList<String> list) {
        //public   E getLast()返回此列表中的最后一个元素
        String last = list.getLast();
        System.out.println(last);
    }

    private static void getFirst(LinkedList<String> list) {
        //public E getFirst()返回此列表中的第一个元素
        String first = list.getFirst();
        System.out.println(first);
    }

    private static void addLast(LinkedList<String> list) {
        //public void addLast(E e)将指定的元素追加到此列表的末尾
        list.addLast("DDD");
        System.out.println(list);
    }

    private static void addFirst(LinkedList<String> list) {
        // public void addFirst(E e)在该列表开头插入指定的元素
        list.addFirst("AAA");
        System.out.println(list);
    }

    private static void removeIF(List<String> list) {
        list.removeIf((String s)->{
            return "aaa".equals(s);
        });
        System.out.println(list);
    }

    private static void superFor(List<String> list) {
        System.out.println("---------------");
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void iterator(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
