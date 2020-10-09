package test.死锁;

public class 测试 {
    public static void main(String[] args) {
        new ThreadA().start();
        new ThreadB().start();
    }
}
