package com.itheima.test2;

public class Test {
    public static void main(String[] args) {
        int drink = Animal.drink(10);
        System.out.println(drink);
        Dog dog = new Dog();
        dog.eat();

        int drink1 = Animal.drink(12);
        Cat cat = new Cat();
        cat.eat();

    }
}
