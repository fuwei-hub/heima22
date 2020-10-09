package thread;

public class 测试类 {
    public static void main(String[] args) {
        //创建MyThread对象
        MyThread myThread = new MyThread();
        //启动线程  start方法
        myThread.start();
        MyThread myThread2 = new MyThread();
        myThread2.start();
    }
}
