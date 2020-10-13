package test;

import java.util.concurrent.CountDownLatch;

public class CountDownLatch演示 {
    public static void main(String[] args) {
        //这里的参数2是指要等待两个线程结束后才执行
        CountDownLatch countDownLatch = new CountDownLatch(2);

        new Thread(()->{
            try {
                System.out.println("A执行了");
                Thread.sleep(1000);
                System.out.println("A执行结束了");
                //A执行结束了调用countdown方法提示已经结束了一个线程
                countDownLatch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                System.out.println("B执行了");
                Thread.sleep(2000);
                System.out.println("B执行结束了");
                //B线程结束后调用countdown方法表示两个线程都已经结束唤醒C线程
                countDownLatch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                //这里的await接收到了两个线程结束的呼唤,然后开始执行C线程
                countDownLatch.await();
                System.out.println("C执行了");
                Thread.sleep(1000);
                System.out.println("C执行结束了");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
