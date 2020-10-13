package 锁的对象测试;

public class 静态方法 {
    public static void zuofan() {
        while (true) {
            synchronized (静态方法.class) {
                System.out.print("老");
                System.out.print("八");
                System.out.print("秘");
                System.out.print("制");
                System.out.print("小");
                System.out.print("🍔");
                System.out.println();
            }
        }
    }

    public static synchronized void chifan() {
        while(true){
            System.out.print("真");
            System.out.print("不");
            System.out.print("戳");
            System.out.println();
        }

    }
}


class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                静态方法.zuofan();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                静态方法.chifan();
            }
        }).start();
    }
}
