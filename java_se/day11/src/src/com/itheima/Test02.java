package src.com.itheima;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
- 在List、Set、Map接口中,都存在of方法,可以创建一个不可变的集合
  - 这个集合不能添加,不能删除,不能修改
  - 但是可以结合集合的带参构造,实现集合的批量添加
- 在Map接口中,还有一个ofEntries方法可以提高代码的阅读性
  - 首先会把键值对封装成一个Entry对象,再把这个Entry对象添加到集合当中
 */
public class Test02 {
    public static void main(String[] args) {
        //List接口中的of方法,创建了一个不可变的集合,再将此集合用一个新的ArrayList接收就可以增删等操作
        List<Integer> s1 = List.of(11, 22, 33, 44);
        ArrayList<Integer> integers = new ArrayList<>(s1);
        System.out.println(s1);
        System.out.println("======================");
        Set<String> s2 = Set.of("11,22,33,44,55,66");
        System.out.println(s2);
        System.out.println("======================");
        //map的第一种of方法
        Map<String, Integer> s3 = Map.of("张三", 23, "李四", 24, "王五", 25);
        System.out.println(s3);
        System.out.println("======================");
        Map<String, Integer> s4 = Map.ofEntries(Map.entry("张三", 24), Map.entry("李四", 24));
        System.out.println(s4);
    }
}
