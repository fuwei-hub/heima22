package 买票案例.lock;

import java.util.concurrent.locks.ReentrantLock;

public class TickRunnable implements Runnable {
    private int ticketCount = 100;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            if (lock.tryLock()) {
                try {
                    if (ticketCount > 0) {
                        System.out.println(Thread.currentThread().getName() + "正在卖第" + ticketCount-- + "张票");
                    } else {
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
