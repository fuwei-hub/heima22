package 反射.作业;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ResourceBundle;

//使用反射执行配置文件中的方法
public class Test04 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //读取配置文件
        ResourceBundle tese = ResourceBundle.getBundle("Test");
        String className = tese.getString("className");
        String methodName = tese.getString("methodName");
        //创建字节码文件对象
        Class clazz = Class.forName(className);
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object o = constructor.newInstance();

        //创建方法并执行
        Method methodName1 = clazz.getDeclaredMethod(methodName, Integer.class);
        methodName1.setAccessible(true);
        Object invoke = methodName1.invoke(o, 10);
        System.out.println(invoke);
    }
}
