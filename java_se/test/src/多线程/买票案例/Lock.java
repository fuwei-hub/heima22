package 多线程.买票案例;

import java.util.concurrent.locks.ReentrantLock;

//2.买票案例(Lock锁实现线程安全)
public class Lock implements Runnable {
    private int ticket=100;
    private ReentrantLock lock=new ReentrantLock();


    @Override
    public void run() {
        while(true){
            if(lock.tryLock()){
                try {
                    if(ticket>0){
                        System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket--+"张票");
                    }else{
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}


class Test{
    public static void main(String[] args) {
        Lock lock = new Lock();
        new Thread(lock,"窗口1").start();
        new Thread(lock,"窗口2").start();
        new Thread(lock,"窗口3").start();
    }
}