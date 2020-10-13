package 多线程.买票案例;
//买票案例(Lock锁和同步代码块方法实现线程安全)
public class Tongbu implements Runnable {
private int ticket=100;
private Object lock=new Object();
    @Override
    public void run() {
        while(true){
            synchronized (lock){
               /* try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket--+"张票");
                }else{
                    System.out.println("卖完咯");
                    break;
                }
            }
        }
    }
}

class Test2{
    public static void main(String[] args) {
        Tongbu tongbu = new Tongbu();
        new Thread(tongbu,"窗口一").start();
        new Thread(tongbu,"窗口二").start();
        new Thread(tongbu,"窗口三").start();
    }
}
