package src.com.itheima.maptest;
//Map方法的初体验
import java.util.HashMap;
import java.util.Map;

/*
V   put(K key,V   value)添加元素
V   remove(Object key)根据键删除键值对元素
void   clear()删除所有的键值对元素
boolean containsKey(Object key)判断集合是否包含指定的键
boolean containsValue(Object value)判断集合是否包含指定的值
boolean isEmpty()判断集合是否为空
int size()集合的长度，也就是集合中键值对的个数
 */
public class TestMap1 {
    public static void main(String[] args) {
        Map<String,Integer> s=new HashMap<>();
        put(s);
        //remove(s);
        //contain(s);
        //isEmpty(s);
        //size(s);
        //clear(s);

    }

    private static void clear(Map<String, Integer> s) {
        //void   clear()删除所有的键值对元素
        s.clear();
        System.out.println(s);
    }

    private static void size(Map<String, Integer> s) {
        //int size()集合的长度，也就是集合中键值对的个数
        int size = s.size();
        System.out.println(size);
    }

    private static void isEmpty(Map<String, Integer> s) {
        //boolean isEmpty()判断集合是否为空
        boolean empty = s.isEmpty();
        System.out.println(empty);
    }

    private static void contain(Map<String, Integer> s) {
        //boolean containsKey(Object key)判断集合是否包含指定的键
        boolean huawei = s.containsKey("华为");
        System.out.println(huawei);
        //boolean containsValue(Object value)判断集合是否包含指定的值
        boolean b = s.containsValue(199999);
        System.out.println(b);
    }

    private static void remove(Map<String, Integer> s) {
        //V   remove(Object key)根据键删除键值对元素
        Integer apple = s.remove("苹果");
        System.out.println(apple);
        System.out.println(s);
    }

    private static void put(Map<String, Integer> s) {
        //V   put(K key,V   value)添加元素
        s.put("华为",4888);
        s.put("小米",3888);
        s.put("Oppo",2888);
        s.put("Vivo",1888);
        s.put("华为",5888);
        s.put("苹果",19999998);
        System.out.println(s);
    }
}
