package 反射.作业;

import cn.itheima.domain.Teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//通过反射操作属性
public class Test02 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException {
        Teacher teacher = new Teacher();
        //创建字节码文件对象
        Class clazz = Teacher.class;
        //创建field对象
        Field field1 = clazz.getDeclaredField("money");
        //暴力反射
        field1.setAccessible(true);
        //创建对象调用money的set和get方法
        Object o = field1.get(teacher);
        //输出打印
        System.out.println(o);


        Field field2 = clazz.getDeclaredField("name");
        field2.setAccessible(true);
        field2.set(teacher, "小芳");
        Object o1 = field2.get(teacher);
        System.out.println(o1);

        Field field3 = clazz.getDeclaredField("age");
        field3.setAccessible(true);
        field3.set(teacher, 28);
        Object o2 = field3.get(teacher);
        System.out.println(o2);


    }
}
