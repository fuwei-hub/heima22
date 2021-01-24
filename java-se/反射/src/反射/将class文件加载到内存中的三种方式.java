package 反射;

import cn.itheima.domain.Student;

public class 将class文件加载到内存中的三种方式 {
    public static void main(String[] args) throws Exception {
        //1.Class.forName("全类名")
        Class clazz1 = Class.forName("cn.itheima.domain.Student");

        //2.类名.class
        Class clazz2 = Student.class;

        //3.对象.getClasss
        //Class clazz3 = new Student().getClass();

        System.out.println(clazz1);
        System.out.println(clazz2);
        //System.out.println(clazz3);
    }
}
