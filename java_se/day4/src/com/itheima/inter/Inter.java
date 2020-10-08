package com.itheima.inter;

public interface Inter {
    public abstract void sing();

    public default void tiao(){
        System.out.println("跳一支💃");
    }

    public static void rep(){
        System.out.println("rap🙃");
    }
}
