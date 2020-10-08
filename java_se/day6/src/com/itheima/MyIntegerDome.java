package com.itheima;
//int转换为String     String转换为int
public class MyIntegerDome {
    public static void main(String[] args) {
        //int转换为String(1)
        int num=10;
        String s=num+" ";
        System.out.println(s);

        //int转换为String(2)
        int num2=20;
        String s2=String.valueOf(num2);
        System.out.println(s2);

        //int转换为String(3)
        int num3=30;
        Integer integer = new Integer(num3);
        String s3=integer.toString();
        System.out.println(s3);


        //String转换为int(1)  String --- Integer --- int
        String s4="18";
        Integer integer1 = Integer.valueOf("18");
        int x=integer1.intValue();
        System.out.println(x);

        //String转换为int(2)  public static int parseInt(String s)
        int y=Integer.parseInt(s4);
        System.out.println(y);

        //String转换为int(3)   创建对象，对象调取方法
        Integer integer2 = new Integer("18");
        int z=integer2.intValue();
        System.out.println(z);


    }
}
