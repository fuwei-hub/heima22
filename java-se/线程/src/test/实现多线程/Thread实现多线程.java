package test.实现多线程;

public class Thread实现多线程 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("今早吃了" + i + "碗面");
        }
    }
}


class Test {
    public static void main(String[] args) {
        Thread实现多线程 t = new Thread实现多线程();
        t.start();
    }
}