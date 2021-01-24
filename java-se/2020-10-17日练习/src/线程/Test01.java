package 线程;

import java.util.concurrent.locks.ReentrantLock;

//买票案例
public class Test01 implements Runnable {
    private Integer ticket=100;
    private ReentrantLock lock=new ReentrantLock();

    @Override
    public void run() {
        while(true){
            if(lock.tryLock()){
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"正在卖"+ticket--+"张票");
                }else{
                    break;
                }
                lock.unlock();
            }
        }
    }
}

class Test{
    public static void main(String[] args) {
        Test01 test01 = new Test01();
        new Thread(test01,"窗口一").start();
        new Thread(test01,"窗口二").start();
        new Thread(test01,"窗口三").start();

    }
}