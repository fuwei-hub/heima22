package test.卖票;

//同步代码块版本
public class Demo01 implements Runnable {
    private int ticketCount = 100;
    private Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock) {
                if (ticketCount > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖" + ticketCount-- + "张票");
                } else {
                    break;
                }
            }
        }
    }
}


class TestDemo01{
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        new Thread(demo01,"窗口1").start();
        new Thread(demo01,"窗口2").start();
        new Thread(demo01,"窗口3").start();
    }
}
