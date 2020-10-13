package test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class 创建可以定时的线程池 {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println(
                        "早上吃了两碗面"
                );
            }
        },1, TimeUnit.SECONDS);

    executorService.scheduleAtFixedRate(new Runnable() {
        @Override
        public void run() {
            System.out.println("中午吃了两碗面");
        }
    },5,2,TimeUnit.SECONDS);
    }
}
