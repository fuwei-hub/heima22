package 反射;

import domain.Student;

import java.lang.reflect.Field;

public class Test03 {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        Class clazz = Student.class;
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(student,"付伟");
        Object o = name.get(student);
        System.out.println(student);
        System.out.println(o);
    }
}
