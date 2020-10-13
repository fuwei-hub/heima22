package 多线程.实现方式;
//1.三种多线程实现方式
public class Test01 extends Thread{
    @Override
    public void run() {
        System.out.println("还行");
    }
}


class Test{
    public static void main(String[] args) {
        Test01 test01 = new Test01();
        test01.start();
    }
}
