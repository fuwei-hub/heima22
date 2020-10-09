package 死锁;

public class ThreadA extends Thread{
    @Override
    public void run() {
        synchronized (Lock.lock_A) {
            System.out.println("我拿到A锁了");
            synchronized (Lock.lock_B) {
                System.out.println("我拿到B锁了");
            }
        }
    }
}
