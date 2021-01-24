package 死锁;

public class 测试类 {
    public static void main(String[] args) {
        new ThreadA().start();
        new ThreadB().start();
    }
}
