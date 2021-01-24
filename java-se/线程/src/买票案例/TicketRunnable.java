package 买票案例;

public class TicketRunnable implements Runnable {
    private int ticketCount = 100;
    private Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                /*try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                if (ticketCount > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticketCount-- + "张票");
                } else {
                    break;
                }
            }
        }
    }
}
