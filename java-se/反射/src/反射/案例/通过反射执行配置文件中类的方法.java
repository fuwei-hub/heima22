package 反射.案例;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ResourceBundle;

public class 通过反射执行配置文件中类的方法 {
    public static void main(String[] args) throws Exception {
        //获取配置文件中的信息
        ResourceBundle config = ResourceBundle.getBundle("config");
        String className = config.getString("className");
        String methodName = config.getString("methodName");

        //通过反射创建字节码文件对象
        Class clazz = Class.forName(className);
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object o = constructor.newInstance();

        //通过反射创建o对象的methodName方法
        Method method = clazz.getDeclaredMethod(methodName, String.class);
        method.setAccessible(true);
        Object invoke = method.invoke(o,"我再睡一会哇?");
        System.out.println(invoke);


    }
}
