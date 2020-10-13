package 多线程.实现方式;

public class Test02 implements Runnable{
    @Override
    public void run() {
        System.out.println("来哇?");
    }
}


class Test2{
    public static void main(String[] args) {
        Test02 test02 = new Test02();
        Thread thread = new Thread(test02);
        thread.start();
    }
}
