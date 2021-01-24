package cn.itcast.homework.动态入门;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class KunKun {
    public static void main(String[] args) {
        Xuxu xuxu = new Xuxu();
        Caicai o = (Caicai)Proxy.newProxyInstance(xuxu.getClass().getClassLoader(), new Class[]{Caicai.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("rap")) {
                    System.out.println("只是在人群中多看了你一眼");
                    return null;
                } else {
                    return method.invoke(xuxu,args);
                }
            }
        });
        o.jump();
        o.sing();
        o.rap("传奇");
    }
}
