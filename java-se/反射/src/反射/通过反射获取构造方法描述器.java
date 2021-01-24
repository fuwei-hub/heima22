package 反射;

import cn.itheima.domain.Student;

import java.lang.reflect.Constructor;

public class 通过反射获取构造方法描述器 {
    public static void main(String[] args) throws Exception {
        //1.获取Student对象的字节码文件对象
        Class clazz = Student.class;
        //Class.forName("全类名")
        //new Student.getClass

        //2.获取Student对象的构造方法描述器
        Constructor constructor1 = clazz.getDeclaredConstructor();
        constructor1.setAccessible(true);
        Object o = constructor1.newInstance();
        System.out.println(o);

        Constructor constructor2 = clazz.getDeclaredConstructor(String.class, Integer.class);
        constructor1.setAccessible(true);
        Object obj1 = constructor2.newInstance("张三", 23);
        System.out.println(obj1);

        Constructor constructor3 = clazz.getDeclaredConstructor(Integer.class, String.class);
        constructor1.setAccessible(true);
        Object obj2 = constructor3.newInstance(23, "张三");
        System.out.println(obj2);

        Constructor constructor4 = clazz.getDeclaredConstructor(String.class);
        constructor1.setAccessible(true);
        Object obj3 = constructor4.newInstance("张三");
        System.out.println(obj3);

        //java.lang.NoSuchMethodException: cn.itheima.domain.Student.<init>(java.lang.Integer)
        //下面代码的错误表示在Student类下面,<init>表示构造方法中,没有参数为Integer类型的构造方法
        Constructor c = clazz.getDeclaredConstructor(Integer.class);

    }
}
