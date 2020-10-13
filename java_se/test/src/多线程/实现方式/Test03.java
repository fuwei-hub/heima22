package 多线程.实现方式;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test03 implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("中午喝了二两");
        return "醉了";
    }
}


class Test3{
    public static void main(String[] args) throws Exception{
        Test03 test03 = new Test03();
        FutureTask<String> ft = new FutureTask<>(test03);
        Thread thread = new Thread(ft);
        thread.start();
        System.out.println(ft.get());
    }
}