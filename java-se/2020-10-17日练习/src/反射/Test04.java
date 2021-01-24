package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ResourceBundle;

//读取配置文件中的信息,执行相应对象的方法
public class Test04 {
    public static void main(String[] args) throws Exception {
        ResourceBundle test = ResourceBundle.getBundle("Test");
        String className = test.getString("className");
        String methodName = test.getString("methodName");

        Class clazz = Class.forName(className);
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object o = constructor.newInstance();

        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        Object invoke = method.invoke(className);

    }
}
