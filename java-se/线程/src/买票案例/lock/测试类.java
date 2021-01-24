package 买票案例.lock;

public class 测试类 {
    public static void main(String[] args) {
        TickRunnable tickRunnable = new TickRunnable();
        new Thread(tickRunnable,"窗口1").start();
        new Thread(tickRunnable,"窗口2").start();
        new Thread(tickRunnable,"窗口3").start();
    }
}
