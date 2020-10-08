package com.itheima.lambda;

//体验Lambda表达式
public class Test05 {
    public static void main(String[] args) {
        new Dance() {
            @Override
            public void GoDance() {
                System.out.println("来哇？");
            }
        }.GoDance();


        /*      Dance d=(()->{
            System.out.println("来哇？");
        });
         d.GoDance();*/
    }

}


interface Dance {
    void GoDance();
}