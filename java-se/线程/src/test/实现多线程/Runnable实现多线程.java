package test.实现多线程;

public class Runnable实现多线程 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("中午吃了" + i + "碗面");
        }
    }
}


class Test2 {
    public static void main(String[] args) {
        Runnable实现多线程 r = new Runnable实现多线程();
        Thread thread = new Thread(r);
        thread.start();
    }
}