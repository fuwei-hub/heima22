package test.实现多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Callable实现多线程 implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 1; i < 10; i++) {
            System.out.println("晚上吃了" + i + "碗面");
        }
        return "恰饱了";
    }
}

class Test3 {
    public static void main(String[] args) throws Exception {
        Callable实现多线程 c = new Callable实现多线程();
        FutureTask<String> ft = new FutureTask<>(c);
        Thread thread = new Thread(ft);
        thread.start();
        String s = ft.get();
        System.out.println(s);
    }
}
