package thread;
//继承Threa类
public class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override//重新run方法
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("我是帅哥"+i);
        }
    }
}
