package com.itheima.test;
//访问
public class Test02 {
    public static void main(String[] args) {
        outer02.inner inner = new outer02.inner();
        inner.sing();
        outer02.inner.jump();
    }
}

class outer02{
   static class inner{
        public  void sing(){
            System.out.println("及你太美");
        }
       public static void jump(){
           System.out.println("跳一跳");
       }
    }
}
