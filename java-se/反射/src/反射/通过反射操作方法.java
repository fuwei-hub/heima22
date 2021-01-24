package 反射;

import cn.itheima.domain.Student;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class 通过反射操作方法 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //获取字节码文件对象
        Class clazz = Student.class;
        //获取method对象
        Method hashCode = clazz.getDeclaredMethod("hashCode");
        //暴力获取
        hashCode.setAccessible(true);
        //创建对象调用方法
        Object o = hashCode.invoke(new Student());
        System.out.println(o);

    }
}
