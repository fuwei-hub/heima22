package com.itheima.test;
//匿名内部类实践
public class Test03 {
    public static void main(String[] args) {
        Fu f=new Fu(){
            @Override
            public void Sing() {
                System.out.println("唱一首");
            }
        };
        f.Sing();

        new Zi() {
            @Override
            public void Chang() {
                System.out.println("我就不唱");
            }
        }.Chang();
    }
}


abstract class Fu{
    public abstract void Sing();
}


class Zi{
    public void Chang(){
        System.out.println("及你太美");
    }
}