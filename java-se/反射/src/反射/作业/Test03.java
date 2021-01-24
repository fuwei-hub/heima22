package 反射.作业;

import cn.itheima.domain.Teacher;

import java.lang.reflect.Method;
//在创建构造方法和普通方法对象的时候,如果有参的话要填写参数的class对象
//通过反射操作普通方法
public class Test03 {
    public static void main(String[] args) throws Exception {
        Teacher teacher = new Teacher();
        //创建字节码文件对象
        Class clazz = Teacher.class;
        //创建Method对象
        Method chifan = clazz.getDeclaredMethod("chifan", String.class);
        //暴力反射
        chifan.setAccessible(true);
        //执行方法
        Object o = chifan.invoke(teacher, "鱼香肉丝盖饭");


        Method shuijiao = clazz.getDeclaredMethod("shuijiao");
        shuijiao.setAccessible(true);
        Object o2 = shuijiao.invoke(teacher);
        System.out.println(o2);


        Method drink = clazz.getDeclaredMethod("drink", Integer.class);
        drink.setAccessible(true);
        Object o3 = drink.invoke(teacher, 5);
        System.out.println(o3);

    }
}
