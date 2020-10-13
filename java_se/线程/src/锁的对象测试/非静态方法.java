package 锁的对象测试;

public class 非静态方法 {
    public void zuofan(){
        while (true) {
            synchronized (this){
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
    public synchronized void chifan(){
        while(true){
            System.out.print("真");
            System.out.print("不");
            System.out.print("戳");
            System.out.println();
        }
    }
}

class Test02{
    public static void main(String[] args) {
        非静态方法 t = new 非静态方法();
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.zuofan();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.chifan();
            }
        }).start();
    }
}
