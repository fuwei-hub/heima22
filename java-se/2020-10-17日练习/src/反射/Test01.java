package 反射;


import domain.Student;

import java.lang.reflect.Constructor;


public class Test01 {
    public static void main(String[] args) throws Exception {
        Class clazz = Student.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object o =constructor.newInstance();
        System.out.println(o);

        Constructor constructor1 = clazz.getDeclaredConstructor(String.class, Integer.class);
        constructor1.setAccessible(true);
        Object o1 = constructor1.newInstance("张三", 24);
        System.out.println(o1);

    }
}
