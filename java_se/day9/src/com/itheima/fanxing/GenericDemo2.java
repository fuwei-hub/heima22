package com.itheima.fanxing;

public class GenericDemo2 {
    public static void main(String[] args) {
        Generic g = new Generic();
        g.show("我");
        g.show(18);
        g.show(true);
        g.show(11.28);
    }
}


class Generic{
    public <T> void show(T t){
        System.out.println(t+"来哇?");
    }
}