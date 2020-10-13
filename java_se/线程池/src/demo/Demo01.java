package demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//创建可缓存的线程池,并且创建两个任务
public class Demo01 {
    public static void main(String[] args) {
        //Executors的newCachedThreadPool方法
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(()-> System.out.println("A线程执行了"));
        executorService.submit(()-> System.out.println("B线程执行了"));
        executorService.submit(()-> System.out.println("C线程执行了"));
        executorService.shutdown();//结束线程池,一般不推荐使用
    }
}
