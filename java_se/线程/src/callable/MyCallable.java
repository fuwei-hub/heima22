package callable;

import java.util.concurrent.Callable;

//创建类,实现Callable接口,重写call方法
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("吃了" + i + "碗面");
        }
        return "饱了";
    }
}
