package 反射;

import cn.itheima.domain.Student;

import java.lang.reflect.Field;

public class 通过反射获取field并设置和获取属性值  {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        //1.获取字节码对象对象
        Class clazz = Student.class;
        //2.获取field对象
        Field name = clazz.getDeclaredField("name");
        //3.暴力反射
        name.setAccessible(true);
        //4.设置属性值
        name.set(student,"王五");
        //5.获取属性值
        String o = (String) name.get(student);
        System.out.println(student);
        System.out.println(o);
    }
}
