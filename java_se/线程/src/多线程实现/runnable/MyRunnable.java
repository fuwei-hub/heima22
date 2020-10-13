package 多线程实现.runnable;

public class MyRunnable  implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println("早上吃了"+i+"碗面");
        }

    }
}
