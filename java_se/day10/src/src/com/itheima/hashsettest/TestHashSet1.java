package src.com.itheima.hashsettest;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet1 {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("我叫吴亦凡");
        strings.add("你叫鹿晗");
        strings.add("我们不一般");
        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println("-----------滴滴滴-----------------");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
