package 反射.案例;

import java.lang.reflect.Method;
import java.util.ArrayList;

//ArrayList泛型为int类型的  向集合中添加String类型的数据
public class 通过反射向集合中添加数据 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //创建list字节码文件对象
        Class clazz = list.getClass();
        //创建list对象中的添加方法对象
        Method add = clazz.getDeclaredMethod("add", Object.class);
        //暴力反射
        add.setAccessible(true);
        //运行方法,添加数据
        Object invoke = add.invoke(list, "来吧,展示!");
        //输出打印
        System.out.println(list);
    }
}
