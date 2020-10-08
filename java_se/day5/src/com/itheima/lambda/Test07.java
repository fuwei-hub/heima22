package com.itheima.lambda;

import java.util.Random;

/*
1. 首先存在一个接口（RandomNumHandler）
2. 在该接口中存在一个抽象方法（getNumber），该方法是无参数但是有返回值
3. 在测试类（RandomNumHandlerDemo）中存在一个方法（useRandomNumHandler）
        方法的的参数是RandomNumHandler类型的
        在方法内部调用了RandomNumHandler的getNumber方法
 */
public class Test07 {
    public static void main(String[] args) {
        useRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                Random a = new Random();
                int b = a.nextInt(10) + 1;
                return b;
            }
        });
        useRandomNumHandler(() -> {
            Random a = new Random();
            int b = a.nextInt(10) + 1;
            return b;
        });

    }

    public static void useRandomNumHandler(RandomNumHandler randomNumHandler) {
        int number = randomNumHandler.getNumber();
        System.out.println(number);
    }

}

interface RandomNumHandler {
    int getNumber();
}