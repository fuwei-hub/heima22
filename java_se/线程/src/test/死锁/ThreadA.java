package test.死锁;

public class ThreadA extends Thread{
    @Override
    public void run() {
        synchronized (Lock.lock_A){
            System.out.println("我得到A锁啦");
            synchronized (Lock.lock_B){
                System.out.println("我得到B锁啦");
            }
        }
    }
}
