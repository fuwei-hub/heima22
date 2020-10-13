package demo;

import javax.swing.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//创建固定长度的线程池,长度为2 并且向里面添加5个任务
public class Demo02 {
    public static void main(String[] args) {
        //设置线程池中线程的数量上限是2,如果创建多个线程就要等待先执行的两条线程执行完毕才可执行
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(()-> System.out.println(Thread.currentThread().getName()+"  A线程"));
        executorService.submit(()-> System.out.println(Thread.currentThread().getName()+"  B线程"));
        executorService.submit(()-> System.out.println(Thread.currentThread().getName()+"  C线程"));
        executorService.submit(()-> System.out.println(Thread.currentThread().getName()+"  D线程"));
        executorService.submit(()-> System.out.println(Thread.currentThread().getName()+"  E线程"));
        executorService.shutdown();
    }
}
