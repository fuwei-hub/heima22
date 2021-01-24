package 反射.作业;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

//通过反射向map集合里添加数据
public class Test05 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("张三", 23);
        map.put("赵四", 24);
        map.put("王五", 25);
        map.put("赵六", 26);

        Class clazz = map.getClass();
        Method add = clazz.getDeclaredMethod("put", Object.class, Object.class);
        add.setAccessible(true);
        Object o = add.invoke(map, 27, "蔡徐坤");
        System.out.println(map);

    }
}
