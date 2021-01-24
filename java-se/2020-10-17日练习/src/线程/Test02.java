package 线程;

//死锁
public class Test02 {
    public static Object LOCk_A = new Object();
    public static Object LOCk_B = new Object();
}

class SuoA extends Thread {
    @Override
    public void run() {
        synchronized (Test02.LOCk_A) {
            System.out.println("我拿到A锁了");
            synchronized (Test02.LOCk_B) {
                System.out.println("我拿到B锁了");
            }
        }
    }
}

class SuoB extends Thread {
    @Override
    public void run() {
        synchronized (Test02.LOCk_B) {
            System.out.println("我拿到B锁了");
            synchronized (Test02.LOCk_A) {
                System.out.println("我拿到A锁了");
            }
        }
    }
}


class Test2 {
    public static void main(String[] args) {
        new SuoA().start();
        new SuoB().start();
    }
}