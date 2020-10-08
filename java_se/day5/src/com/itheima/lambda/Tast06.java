package com.itheima.lambda;

//有参数无返回值
/*
1.首先存在一个接口（StringHandler）
 2.在该接口中存在一个抽象方法（printMessage），该方法是有参数无返回值
 3.在测试类（StringHandlerDemo）中存在一个方法（useStringHandler）
              方法的的参数是StringHandler类型的
              在方法内部调用了StringHandler的printMessage方法

 */
public class Tast06 {
    public static void main(String[] args) {
        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String string) {
                System.out.println(string);
            }
        });

        useStringHandler(string -> System.out.println(string+"我是有参数无返回值lambda方法"));
    }

    public static void useStringHandler(StringHandler string) {

        string.printMessage("及你太美");
    }
}


interface StringHandler {
    void printMessage(String string);
}