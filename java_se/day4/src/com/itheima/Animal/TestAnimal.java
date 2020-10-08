package com.itheima.Animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Cat();
        System.out.println(a.a);
        a.dongwu();
        //判断a变量记录的类型, 是否是Cat
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.zhaoya();
        }

    }
}

class Animal {
    int a = 10;

    public void dongwu() {
        System.out.println("努力进化");
    }
}

class Cat extends Animal {
    int a = 20;

    public void dongwu() {
        System.out.println("动物世界里都太假");
    }

    public void zhaoya(){
        System.out.println("祖先已抹去爪牙");
    }
}
