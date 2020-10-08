package com.itheima.qiche;

public class TaskCar {
    public static void main(String[] args) {
        Car m=new Car();
        m.setName("上海大众");
        m.setChandi("德国");
        m.setPrice(366666);
        m.setDaikuan(true);
        System.out.println(m.toString());
        m.start();
        m.end();
        Car n=new Car("东风日产",48888,"日本",true);
        System.out.println(n.toString());
        n.start();
        n.end();
    }
}
