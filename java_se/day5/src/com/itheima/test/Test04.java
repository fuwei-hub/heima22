package com.itheima.test;
//无参数无返回值lambda练习
public class Test04 {
    public static void main(String[] args) {
        getSingSong(new Sing() {
            @Override
            public void Singsong() {
                System.out.println("及你太美");
            }
    });
    }

    public static void getSingSong(Sing sing) {
        sing.Singsong();
    }
}

interface Sing {
    public abstract void Singsong();
}
