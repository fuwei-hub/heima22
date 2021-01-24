package demo;

import java.util.concurrent.atomic.AtomicInteger;

//使用AtomicInteger方法进行自增自减运算
public class Demo03 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        System.out.println(atomicInteger.get());//  5
        System.out.println(atomicInteger.getAndAdd(3));//先获得在加三   8
        System.out.println(atomicInteger.addAndGet(1));//先增加再获得   ++8
        System.out.println(atomicInteger.decrementAndGet());//先自减一再获得  --9
        System.out.println(atomicInteger.getAndDecrement());//先获得再自减    8--
        System.out.println(atomicInteger.incrementAndGet());//先自加再获得    8
        System.out.println(atomicInteger.getAndIncrement());//先获得再自加   8++
        System.out.println(atomicInteger.getAndSet(999));//先获得再设置  9
        System.out.println(atomicInteger.get());//999
    }
}


