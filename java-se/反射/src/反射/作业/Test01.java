package 反射.作业;

import cn.itheima.domain.Teacher;

import java.lang.reflect.Constructor;

//通过反射操作构造方法
public class Test01 {
    public static void main(String[] args) throws Exception {
        //创建字节码文件对象
        Class clazz = Teacher.class;   //Class.forName("cn.itheima.domain.Teacher")  //new Teacher().getClass
        //创建构造方法
        Constructor constructor = clazz.getDeclaredConstructor();
        //暴力反射
        constructor.setAccessible(true);
        //创建对象
        Object o = constructor.newInstance();
        //输出打印
        System.out.println(o);


    }
}
