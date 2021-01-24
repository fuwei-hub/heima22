package 反射;

import java.lang.reflect.Method;
import java.util.HashMap;

public class Test05 {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);

        Class clazz= map.getClass();
        Method put = clazz.getDeclaredMethod("put", Object.class, Object.class);
        put.setAccessible(true);
        put.invoke(map,26,"赵六");
        System.out.println(map);
    }
}
