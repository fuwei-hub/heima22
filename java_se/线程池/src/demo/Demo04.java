package demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//练习ConcurrentHashMap
public class Demo04 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<>();
        chm.put("小王",28);
        chm.put("小李",30);
        chm.put("小付",20);
        chm.put("小刚",99);
        //entryset遍历
        for (Map.Entry<String, Integer> s : chm.entrySet()) {
            System.out.println(s.getKey()+""+s.getValue());
        }
        System.out.println("------------------------------------------");
        //keyset遍历
        for (String s : chm.keySet()) {
            System.out.println(s+""+chm.get(s));
        }
    }
}
