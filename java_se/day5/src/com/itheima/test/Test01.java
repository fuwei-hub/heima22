package com.itheima.test;

//内部类
public class Test01 {
    public static void main(String[] args) {
        CaiCai.XuXu xuXu = new CaiCai().new XuXu();
        xuXu.KunKun();


    }
}

class CaiCai{
 private int ssum=20;

    class XuXu{
        public void KunKun(){
            int sum=10;
            System.out.println("唱、跳、rap，🏀");
            System.out.println(ssum);
        }
    }
    }



