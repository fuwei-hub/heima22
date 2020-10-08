package com.itheima.shangpu;

public class TaskShoop {
    public static void main(String[] args) {
        Shoop m=new Shoop();
        m.setName("子得");
        m.setBianhao(2014534);
        m.setPrice(264);
        m.setZhenjia(true);
        String s = m.toString();
        System.out.println(s);
        Shoop n=new Shoop("如家",201456,256,265446,false);
        System.out.println(n);
    m.kaiye("开业");
    }
}
