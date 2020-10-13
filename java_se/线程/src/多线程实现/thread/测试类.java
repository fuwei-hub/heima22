package 多线程实现.thread;


public class 测试类 {
    public static void main(String[] args) {
            //创建MyThread对象
            MyThread myThread = new MyThread("一号");
            //启动线程  start方法
            myThread.start();

            MyThread myThread2 = new MyThread("二号");
            myThread2.start();
            //设置优先级 setPriority
            myThread2.setPriority(10);
            //获得优先级 getPriority
            myThread2.getPriority();

    }

}
