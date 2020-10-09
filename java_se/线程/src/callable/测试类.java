package callable;

import java.util.concurrent.FutureTask;

public class 测试类 {
    public static void main(String[] args) throws Exception {
        //创建MyCallable对象
        MyCallable myCallable = new MyCallable();
        //创建FuturTask对象,将MyCallable作为参数传入
        FutureTask<String> ft = new FutureTask<String>(myCallable);
        //创建线程对象,将FutureTask对象作为参数传入
        Thread thread = new Thread(ft);
        //启动线程
        thread.start();
        //调用FutureTask的get方法获取返回值
        String s = ft.get();
        System.out.println(s);
    }
}
