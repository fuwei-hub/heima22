package test.卖票;

import java.util.concurrent.locks.ReentrantLock;

//lock版本
public class Demo02 implements Runnable {
    private int tickCount = 100;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            if (lock.tryLock()) {
                try {
                    if (tickCount > 0) {
                        System.out.println(Thread.currentThread().getName() + "正在卖" + tickCount-- + "张电影票");
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

class TestDemo02 {
    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
        new Thread(demo02, "窗口1").start();
        new Thread(demo02, "窗口2").start();
        new Thread(demo02, "窗口3").start();

    }
}