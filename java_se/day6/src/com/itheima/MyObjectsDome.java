package com.itheima;
/*public static String toString(对象)            返回参数中对象的字符串表示形式。
public static String toString(对象, 默认字符串)   返回对象的字符串表示形式。
public static Boolean isNull(对象)               判断对象是否为空
public static Boolean nonNull(对象)              判断对象是否不为空*/

import java.util.Objects;

public class MyObjectsDome {
    public static void main(String[] args) {
        //public static String toString(对象)   返回参数中对象的字符串表示形式。
        Student student = new Student("小花", 28);
        System.out.println(Objects.toString(student));

        //public static String toString(对象, 默认字符串)   返回对象的字符串表示形式。
        Student student1 = null;
        System.out.println(Objects.toString(student1, "这是对象为空的提示"));

        //public static Boolean isNull(对象)     判断对象是否为空
        System.out.println(Objects.isNull(student1));

        //public static Boolean nonNull(对象)              判断对象是否不为空*/
        System.out.println(Objects.nonNull(student));

        //判断两个对象是否相等的方法（这里，如果学生类中没有写equals方法
        // 那么将会使用Objet父类中的equals方法，判断两个的地址值是否一致）
        Student s1=new Student("小张",30);
        Student s2=new Student("小张",30);
        System.out.println(s1.equals(s2));

    }
}
