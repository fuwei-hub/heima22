package 多线程实现.runnable;

public class 测试类 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable,"李四");
        System.out.println(thread.getName());
        thread.start();
    }
}
