package 反射;

import domain.Student;

import java.lang.reflect.Method;

public class Test02 {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        Class clazz = Student.class;
        Method method = clazz.getDeclaredMethod("show",String.class);
        method.setAccessible(true);
        Object invoke = method.invoke(student, "来哇?");
        System.out.println(student);
    }
}
