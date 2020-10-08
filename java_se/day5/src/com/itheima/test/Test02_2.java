package com.itheima.test;
//访问类中的静态类，
// 因为类中的静态类只能在本类中调用，所以要先在类中创建对象调用静态类方法，然后再创建外部类的
//对象，然后进行调用
public class Test02_2 {
    public static void main(String[] args) {
        cai cai = new cai();
        cai.tiao();
    }

}


class cai {

    static class xu{
        public void kun(){
            System.out.println("来哇？");
        }
    }
    public void tiao(){
        xu xu = new xu();
        xu.kun();
    }
}