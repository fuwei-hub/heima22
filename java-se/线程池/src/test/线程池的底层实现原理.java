package test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class 线程池的底层实现原理 {
    public static void main(String[] args) throws Exception {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,//核心线程数
                5,//最大线程数
                5,//核心线程存活的值
                TimeUnit.SECONDS,//核心线程村存活时间的单位
                new ArrayBlockingQueue<>(10),//等待队列中允许存放十个任务
                Executors.defaultThreadFactory(),//线程的默认创建方式
                new ThreadPoolExecutor.AbortPolicy()//默认拒绝策略
        );
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.submit(()->{});
        threadPoolExecutor.submit(()->{});
        Thread.sleep(6000);//当睡眠时间超过了核心线程存活的时间,核心线程就可以看出被删除了
        //而临时线程是运行完直接被删除,核心线程是过了存活时间被删除(在允许核心线程被删除的情况下)
        System.out.println(threadPoolExecutor.getPoolSize());

    }
}
