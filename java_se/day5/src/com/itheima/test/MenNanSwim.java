package com.itheima.test;

public class MenNanSwim {
    public static void main(String[] args) {
        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("铁汁，游个泳哇？");
            }
        });
        goSwimming(()->System.out.println("不去不去，怕了怕了"));
    }

    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }
}


interface Swimming {
    void swim();
}
