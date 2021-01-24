package cn.itcast.jdbc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Kunkun kunkun = new Kunkun();

        Caicai o =(Caicai) Proxy.newProxyInstance(kunkun.getClass().getClassLoader(), kunkun.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("现在执行的方法是：" + method.getName());
                System.out.println(args.toString());
                return null;
            };
        });
        o.play("篮球");
    }
}
