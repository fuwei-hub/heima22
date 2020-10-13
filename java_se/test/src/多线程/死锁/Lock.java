package 多线程.死锁;

public class Lock {
    public static Object Lock_A=new Object();
    public static Object Lock_B=new Object();
}


class ThreadA implements Runnable{

    @Override
    public void run() {
        synchronized (Lock.Lock_A){
            System.out.println("我拿到A锁啦");
            synchronized (Lock.Lock_B){
                System.out.println("我拿到B锁啦");
            }
        }
    }
}


class ThreadB implements Runnable{
    @Override
    public void run() {
        synchronized (Lock.Lock_B){
            System.out.println("我拿到B锁啦");
            synchronized (Lock.Lock_A){
                System.out.println("我拿到A锁啦");
            }
        }
    }
}

class Test{
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        new Thread(threadA).start();
        new Thread(threadB).start();
    }
}