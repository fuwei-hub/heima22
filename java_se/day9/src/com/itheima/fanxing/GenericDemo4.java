package com.itheima.fanxing;

import java.util.ArrayList;

/*
ArrayList<?>: 表示元素类型未知的ArrayList,它的元素可以匹配任何的类型
ArrayListList <? extends Number>: 它表示的类型是Number或者其子类型
ArrayListList <? super Number>: 它表示的类型是Number或者其父类型
 */
public class GenericDemo4 {
    public static void main(String[] args) {
        // 表示元素类型未知的ArrayList,所以无法添加信息
        ArrayList<?> objects1 = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Number> numbers = new ArrayList<>();
        ArrayList<Object> objects = new ArrayList<>();
        //它的元素可以匹配任何的类型
        method(integers);
        method(numbers);
        method(objects);
        //它表示的类型是Number或者其子类型
        method1(numbers);
        method1(integers);
        //它表示的类型是Number或者其父类型
        method2(objects);
        method2(numbers);

    }

    private static void method2(ArrayList<? super Number> list) {
    }

    private static void method1(ArrayList<? extends Number> list) {
    }

    private static void method(ArrayList<?> list) {
    }


}
