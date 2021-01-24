package test.test03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestDemo {
    public static void main(String[] args) throws Exception {
        Class clazz = Demo.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Demo demo = (Demo)constructor.newInstance();

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            if(method.isAnnotationPresent(Test.class)){
                method.invoke(demo);
            }
        }
    }
}
