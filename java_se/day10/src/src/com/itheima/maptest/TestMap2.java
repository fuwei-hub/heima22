package src.com.itheima.maptest;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Map的遍历方式  第一种
public class TestMap2 {
    public static void main(String[] args) {
        Map<String,String> s=new TreeMap<>();
        s.put("阿giao","范冰冰");
        s.put("张杰","谢娜");
        s.put("吴亦凡","郭老师");
        s.put("鹿晗","关晓彤");
        s.put("坤坤","金星");
        //map的keySet方法可以获得 键  的 单列集合
        Set<String> strings = s.keySet();
        //遍历单列集合获取值就可以了
        for (String string : strings) {
            String s1 = s.get(string);
            System.out.println(string+"的妻子是"+s1);
        }
        System.out.println("------------------------------------------");
        //map的第二种遍历方式 先获得每个键值对对象,然后在获取键值
        Set<Map.Entry<String, String>> entries = s.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"的妻子是"+value);
        }
        System.out.println("------------------------------------------");
        //map的第三种遍历方式 foreach
        s.forEach((s1,s2)-> System.out.println(s1+"的妻子是"+s2));
    }
}
