package test;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class 可缓存和固定长度的线程池 {
    public static void main(String[] args) throws InterruptedException {
        //创建一个空的线程池  Executors . newCachedThreadPool
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        /*Thread.sleep(1000);睡一会的目的是使得上面的线程处于空闲状态,下面就可以从线程池中直接调用了*/
        executorService.submit(() -> System.out.println(Thread.currentThread().getName()));

        //Execcutors设置线程的上限  Executors . newFIxedThreadPool
       /* ExecutorService executorService1 = Executors.newFixedThreadPool(10);
        executorService1.submit(()-> System.out.println(Thread.currentThread().getName()+"执行了"));
        executorService1.submit(()-> System.out.println(Thread.currentThread().getName()+"执行了"));
        executorService1.submit(()-> System.out.println(Thread.currentThread().getName()+"执行了"));
        executorService1.shutdown();*/
    }
}
